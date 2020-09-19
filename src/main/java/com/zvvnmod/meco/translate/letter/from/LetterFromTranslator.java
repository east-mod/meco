package com.zvvnmod.meco.translate.letter.from;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.translate.exception.TranslateState;
import com.zvvnmod.meco.translate.word.LetterWord;
import com.zvvnmod.meco.translate.word.LetterWordFragment;
import com.zvvnmod.meco.translate.word.Nature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 18:14
 */
public class LetterFromTranslator {
    private static final Logger logger = LoggerFactory.getLogger(LetterFromTranslator.class);

    private LetterTranslateRuleFrom letterTranslateRuleFrom;

    private LetterWordFragment letterWordFragment;

    private LetterWord letterWord;

    private long wordCounter;

    private LetterFromTranslator() {
    }

    public LetterFromTranslator(final LetterTranslateRuleFrom letterTranslateRuleFrom) {
        this.letterTranslateRuleFrom = letterTranslateRuleFrom;
        this.letterWordFragment = new LetterWordFragment();
        this.letterWord = new LetterWord();
    }

    private CharType getUnicodeType(char ch) {
        return letterTranslateRuleFrom.isWordCodePoint(ch) ? CharType.MONGOLIAN : CharType.OTHER;
    }

    private void resetMglWordFragment() {
        this.letterWordFragment = new LetterWordFragment();
    }

    private void resetMglWord() {
        this.letterWord = new LetterWord();
    }

    private void translateWord(StringBuilder builder, LetterWord letterWord) {
        Nature nature;
        String s;
        List<Character> preFragmentContent = new LinkedList<>();
        for (int i = 0; i < letterWord.getLetterWordFragments().size(); i++) {
            LetterWordFragment wordFragment = letterWord.getLetterWordFragments().get(i);
            nature = wordFragment.getNature().equals(Nature.SAARMAG) ?
                    letterWord.getNature() : wordFragment.getNature();

            List<Character> suf;
            if (i + 1 < letterWord.getLetterWordFragments().size()) {
                suf = letterWord.getLetterWordFragments().get(i + 1).getContent();
            } else {
                suf = Collections.emptyList();
            }

            s = letterTranslateRuleFrom.getMapperCode(preFragmentContent, suf, wordFragment.getKey(), nature);

            if (s == null) {
                throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                        "Not fount the string " + wordFragment.getContent() + " in mapper rule");
            }
            builder.append(s);
            preFragmentContent.addAll(wordFragment.getContent());
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
        letterWordFragment.setHead(CharType.OTHER);
        for (int i = 0; i < chars0.length; i++) {
            char c = chars0[i];
            if (letterTranslateRuleFrom.isWordCodePoint(c)) {
                letterWordFragment.push(c);
                letterWordFragment.setTail(getUnicodeType(chars0[i + 1]));
                if (letterTranslateRuleFrom.contains(letterWordFragment.getKey())) {
                    letterWordFragment.setNature(letterTranslateRuleFrom.getCodeNature(c));
                    continue;
                }
                letterWordFragment.pop();
                letterWordFragment.setTail(getUnicodeType(c));
                if (letterWordFragment.isBlank()) {
                    throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                            "Not fount the string [" + c + "] in mapper rule");
                }
                letterWord.add(letterWordFragment);
                resetMglWordFragment();
                letterWordFragment.setHead(getUnicodeType(chars0[i - 1]));
                i--;
            } else {
                if (letterWordFragment.isNotBlank()) {
                    letterWordFragment.setTail(CharType.OTHER);
                    letterWord.add(letterWordFragment);
                    resetMglWordFragment();
                    letterWordFragment.setHead(CharType.OTHER);
                }
                if (letterWord.isNotBlank()) {
                    translateWord(builder, letterWord);
                    resetMglWord();
                }
                if (letterTranslateRuleFrom.isTranslateCodePoint(c)) {
                    letterWordFragment.push(c);
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
