package com.zvvnmod.meco.translate.letter.to;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/22
 * WEEK  : 周六
 * TIME  : 12:02
 */
public class LetterToTranslator {
    private LetterToTranslateRule letterToTranslateRule;

    public LetterToTranslator(final LetterToTranslateRule letterToTranslateRule) {
        this.letterToTranslateRule = letterToTranslateRule;
    }

    public String translate(final String s) {
        return s;
    }
}
