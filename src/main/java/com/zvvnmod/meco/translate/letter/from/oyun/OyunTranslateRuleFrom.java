package com.zvvnmod.meco.translate.letter.from.oyun;

import com.zvvnmod.meco.translate.annotation.Rule;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import com.zvvnmod.meco.translate.letter.from.LetterTranslateRuleFrom;
import com.zvvnmod.meco.translate.word.Nature;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/11
 * WEEK  : Tue
 * TIME  : 01:56
 */
@Component
@Rule(CodeType.Oyun)
public class OyunTranslateRuleFrom implements LetterTranslateRuleFrom {

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
