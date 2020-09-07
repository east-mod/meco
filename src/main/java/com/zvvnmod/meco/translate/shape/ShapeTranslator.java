package com.zvvnmod.meco.translate.shape;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.translate.exception.TranslateState;
import com.zvvnmod.meco.translate.letter.from.CharType;
import com.zvvnmod.meco.translate.word.ShapeWord;
import com.zvvnmod.meco.translate.word.ShapeWordFragment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/27
 * WEEK  : 周四
 * TIME  : 09:12
 */
public class ShapeTranslator {
    private static Logger logger = LoggerFactory.getLogger(ShapeTranslator.class);

    private ShapeTranslateRule translateRule;

    private ShapeWord word;

    private ShapeWordFragment wordFragment;

    private long wordCounter;

    public ShapeTranslator(ShapeTranslateRule translateRule) {
        this.translateRule = translateRule;
    }

    private void translateWord(StringBuilder builder, ShapeWord word) {
        for (ShapeWordFragment wordFragment : word.getWordFragments()) {
            String s = translateRule.getMapperCode(wordFragment);
            if (s == null) {
                throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                        "Not fount the string " + wordFragment.getContent() + " in mapper rule");
            }
            builder.append(s);
        }
        wordCounter++;
    }

    public String translate(final String s) {
        if (Strings.isBlank(s)) {
            return Strings.BLANK;
        }
        String s0 = s + "\ue666";
        char[] chars = s0.toCharArray();
        word = new ShapeWord();
        wordFragment = new ShapeWordFragment();
        StringBuilder builder = new StringBuilder();
        wordCounter = 0;
        wordFragment.setHead(CharType.OTHER);
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (translateRule.isTranslateCodePoint(aChar)) {
                wordFragment.push(aChar);
                wordFragment.setTail(translateRule.getCharType(chars[i + 1]));
                if (translateRule.contains(wordFragment)) {
                    continue;
                }
                wordFragment.pop();
                wordFragment.setTail(translateRule.getCharType(aChar));
                if (wordFragment.isBlank()) {
                    throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                            "Not fount the string [" + aChar + "] in mapper rule");
                }
                word.add(wordFragment);
                wordFragment = new ShapeWordFragment();
                wordFragment.setHead(translateRule.getCharType(chars[i - 1]));
                i--;
            } else {
                if (wordFragment.isNotBlank()) {
                    wordFragment.setTail(CharType.OTHER);
                    word.add(wordFragment);
                    wordFragment = new ShapeWordFragment();
                    wordFragment.setHead(CharType.OTHER);
                }
                if (word.isNotBlank()) {
                    translateWord(builder, word);
                    word = new ShapeWord();
                }
                builder.append(aChar);
            }
        }
        builder.deleteCharAt(builder.length() - 1);
        logger.info("{} words translated.", wordCounter);
        return builder.toString();
    }
}
