package com.zvvnmod.meco.translate.letter.from.oyun;

import com.zvvnmod.meco.translate.letter.from.Nature;
import com.zvvnmod.meco.translate.letter.from.LetterFromTranslateRule;

import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/11
 * WEEK  : Tue
 * TIME  : 01:56
 */
public class OyunRuleLetterFrom implements LetterFromTranslateRule {

    @Override
    public String getMapperCode(List<Character> pre, String s, Nature nature) {
        return null;
    }

    @Override
    public boolean contains(String s) {
        return false;
    }

    @Override
    public Nature getCodeNature(char c) {
        return null;
    }

    @Override
    public boolean isTranslateCodePoint(char c) {
        return false;
    }

    @Override
    public boolean isMongolianCodePoint(char c) {
        return false;
    }

}
