package com.zvvnmod.meco.translate.letter.from;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.translate.exception.TranslateState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 18:14
 */
public class Translator {
    private static final Logger logger = LoggerFactory.getLogger(Translator.class);

    private TranslateRule translateRule;

    private MglWordFragment mglWordFragment;

    private MglWord mglWord;

    private long wordCounter;

    private Translator() {
    }

    public Translator(final TranslateRule translateRule) {
        this.translateRule = translateRule;
        this.mglWordFragment = new MglWordFragment();
        this.mglWord = new MglWord();
    }

    private UnicodeType getUnicodeType(char ch) {
        return translateRule.isMongolianCodePoint(ch) ? UnicodeType.MONGOLIAN : UnicodeType.OTHER;
    }

    private void resetMglWordFragment() {
        this.mglWordFragment = new MglWordFragment();
    }

    private void resetMglWord() {
        this.mglWord = new MglWord();
    }

    private void translateWord(StringBuilder builder, MglWord mglWord) {
        Nature nature;
        String s;
        List<Character> preFragmentContent = null;
        for (MglWordFragment wordFragment : mglWord.getMglWordFragments()) {
            nature = wordFragment.getNature().equals(Nature.SAARMAG) ? mglWord.getNature() : wordFragment.getNature();
            s = translateRule.getMapperCode(preFragmentContent, wordFragment.getKey(), nature);
            if (s == null) {
                throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                        "Not fount the string [" + wordFragment.getContent() + "] in mapper rule");
            }
            builder.append(s);
            preFragmentContent = wordFragment.getContent();
        }
        wordCounter++;
    }

    public String translate(final String s0) {
        if (Strings.isBlank(s0)) {
            return Strings.BLANK;
        }
        wordCounter = 0;
        String s1 = s0 + "\ue666";
        char[] chars0 = s1.toCharArray();
        StringBuilder builder = new StringBuilder(chars0.length * 2);
        mglWordFragment.setHead(UnicodeType.OTHER);
        for (int i = 0; i < chars0.length; i++) {
            char c = chars0[i];
            if (translateRule.isMongolianCodePoint(c)) {
                mglWordFragment.push(c);
                mglWordFragment.setTail(getUnicodeType(chars0[i + 1]));
                if (translateRule.contains(mglWordFragment.getKey())) {
                    mglWordFragment.setNature(translateRule.getCodeNature(c));
                    continue;
                }
                mglWordFragment.pop();
                mglWordFragment.setTail(getUnicodeType(c));
                if (mglWordFragment.contentIsBlank()) {
                    throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                            "Not fount the string [" + c + "] in mapper rule");
                }
                mglWord.add(mglWordFragment);
                resetMglWordFragment();
                mglWordFragment.setHead(getUnicodeType(chars0[i - 1]));
                i--;
            } else {
                if (!mglWordFragment.contentIsBlank()) {
                    mglWordFragment.setTail(UnicodeType.OTHER);
                    mglWord.add(mglWordFragment);
                    resetMglWordFragment();
                    mglWordFragment.setHead(UnicodeType.OTHER);
                }
                if (!mglWord.isEmpty()) {
                    translateWord(builder, mglWord);
                    resetMglWord();
                }
                if (translateRule.isTranslateCodePoint(c)) {
                    mglWordFragment.push(c);
                } else {
                    builder.append(c);
                }
            }
        }
        builder.deleteCharAt(builder.length() - 1);
        logger.info("{} words translated.", wordCounter);
        return builder.toString();
    }

}
