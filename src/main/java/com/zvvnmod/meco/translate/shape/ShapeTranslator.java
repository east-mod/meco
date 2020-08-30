package com.zvvnmod.meco.translate.shape;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.translate.exception.TranslateState;
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
            String s = translateRule.getMapperCode(wordFragment.getKey());
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
        char[] chars = s.toCharArray();
        word = new ShapeWord();
        wordFragment = new ShapeWordFragment();
        StringBuilder builder = new StringBuilder();
        wordCounter = 0;
        for (char aChar : chars) {
            if (translateRule.isTranslateCodePoint(aChar)) {
                wordFragment.push(aChar);
                if (translateRule.contains(wordFragment.getKey())) {
                    continue;
                }
                wordFragment.pop();
                if (wordFragment.isBlank()) {
                    throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                            "Not fount the string [" + aChar + "] in mapper rule");
                }
                word.add(wordFragment);
                wordFragment = new ShapeWordFragment();
                wordFragment.push(aChar);
            } else {
                if (wordFragment.isNotBlank()) {
                    word.add(wordFragment);
                    wordFragment = new ShapeWordFragment();
                }
                if (word.isNotBlank()) {
                    translateWord(builder, word);
                }
                builder.append(aChar);
            }
        }
        builder.deleteCharAt(builder.length() - 1);
        logger.info("{} words translated.", wordCounter);
        return builder.toString();
    }
}
