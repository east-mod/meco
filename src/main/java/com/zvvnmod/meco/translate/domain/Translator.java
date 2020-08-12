package com.zvvnmod.meco.translate.domain;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.translate.exception.TranslateState;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 18:14
 */
public class Translator {

    private TranslateRule translateRule;

    private MglWordFragment mglWordFragment;

    private MglWord mglWord;

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
        for (MglWordFragment wordFragment : mglWord.getMglWordFragments()) {
            nature = wordFragment.getNature().equals(Nature.SAARMAG) ? mglWord.getNature() : wordFragment.getNature();
            s = translateRule.getMapperCode(wordFragment.getKey(), nature);
            if (s == null) {
                throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                        "Not fount the string " + wordFragment.getContent() + "in mapper rule");
            }
            builder.append(s);
        }
    }

    public String translate(final String s0) {
        if (Strings.isBlank(s0)) {
            return Strings.BLANK;
        }
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
                mglWordFragment.setTail(UnicodeType.MONGOLIAN);
                if (mglWordFragment.contentIsBlank()) {
                    throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                            "not fount the string " + c + "in mapper rule");
                }
                mglWord.add(mglWordFragment);
                resetMglWordFragment();
                i--;
            } else {
                if (!mglWordFragment.contentIsBlank()) {
                    mglWordFragment.setTail(UnicodeType.OTHER);
                    mglWord.add(mglWordFragment);
                    resetMglWordFragment();
                }
                translateWord(builder, mglWord);
                resetMglWord();
                builder.append(c);
            }
            if (mglWordFragment.getHead() == null) {
                mglWordFragment.setHead(getUnicodeType(c));
            }
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

}
