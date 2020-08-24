package com.zvvnmod.meco.translate.letter.to;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.translate.exception.TranslateState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/22
 * WEEK  : 周六
 * TIME  : 12:02
 */
public class LetterToTranslator {
    private static final Logger logger = LoggerFactory.getLogger(LetterToTranslator.class);

    private LetterTranslateRuleTo letterTranslateRuleTo;

    private long wordCounter;

    public LetterToTranslator(final LetterTranslateRuleTo letterTranslateRuleTo) {
        this.letterTranslateRuleTo = letterTranslateRuleTo;
    }

    public String translate(final String s) {
        if (Strings.isBlank(s)) {
            return Strings.BLANK;
        }
        wordCounter = 0;
        ShapeWordFragment zvvnModWordFragment = new ShapeWordFragment();
        ShapeWord zvvnModWord = new ShapeWord();
        StringBuilder builder = new StringBuilder();
        String s0 = s + '\ue666';
        char[] chars = s0.toCharArray();
        for (char aChar : chars) {
            if (letterTranslateRuleTo.isTranslateCodePoint(aChar)) {
                zvvnModWordFragment.push(aChar);
                if (letterTranslateRuleTo.contains(zvvnModWordFragment.getKey())) {
                    continue;
                }
                zvvnModWordFragment.pop();
                if (zvvnModWordFragment.isBlank()) {
                    throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                            "Not fount the string [" + aChar + "] in mapper rule");
                }
                zvvnModWord.add(zvvnModWordFragment);
                zvvnModWordFragment = new ShapeWordFragment();
                zvvnModWordFragment.push(aChar);
            } else {
                if (zvvnModWordFragment.isNotBlank()) {
                    zvvnModWord.add(zvvnModWordFragment);
                    zvvnModWordFragment = new ShapeWordFragment();
                }
                if (zvvnModWord.isNotBlank()) {
                    translateWord(builder, zvvnModWord);
                    zvvnModWord = new ShapeWord();
                }
                builder.append(aChar);
            }
        }
        builder.deleteCharAt(builder.length() - 1);
        logger.info("{} words translated.", wordCounter);
        return builder.toString();
    }

    private void translateWord(StringBuilder builder, ShapeWord zvvnModWord) {
        String pre = "";
        for (ShapeWordFragment wordFragment : zvvnModWord.getWordFragments()) {
            String s = letterTranslateRuleTo.getMapperCode(pre, wordFragment.getKey());
            if (s == null) {
                throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                        "Not fount the string " + wordFragment.getContent() + " in mapper rule");
            }
            if (s.charAt(s.length() - 1) == '\u202f' && builder.charAt(builder.length() - 1) == '\u0020') {
                builder.deleteCharAt(builder.length() - 1);
            }
            builder.append(s);
            pre = s;
        }
        wordCounter++;
    }
}
