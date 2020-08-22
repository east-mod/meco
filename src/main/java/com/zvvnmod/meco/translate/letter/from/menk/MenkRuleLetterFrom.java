package com.zvvnmod.meco.translate.letter.from.menk;

import com.zvvnmod.meco.translate.letter.from.LetterFromTranslateRule;
import com.zvvnmod.meco.translate.letter.from.Nature;

import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 19:32
 */
public class MenkRuleLetterFrom implements LetterFromTranslateRule {

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
