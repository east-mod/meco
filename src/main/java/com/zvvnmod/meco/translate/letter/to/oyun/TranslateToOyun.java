package com.zvvnmod.meco.translate.letter.to.oyun;

import com.zvvnmod.meco.translate.letter.from.Nature;
import com.zvvnmod.meco.translate.letter.from.TranslateRule;

import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/15
 * WEEK  : 周六
 * TIME  : 20:36
 */
public class TranslateToOyun implements TranslateRule {
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
