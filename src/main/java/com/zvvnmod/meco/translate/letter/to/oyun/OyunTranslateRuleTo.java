package com.zvvnmod.meco.translate.letter.to.oyun;

import com.zvvnmod.meco.translate.annotation.Rule;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import com.zvvnmod.meco.translate.letter.to.LetterTranslateRuleTo;
import com.zvvnmod.meco.translate.word.ShapeWord;
import org.springframework.stereotype.Component;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/15
 * WEEK  : 周六
 * TIME  : 20:36
 */
@Component
@Rule(CodeType.Oyun)
public class OyunTranslateRuleTo implements LetterTranslateRuleTo {

    @Override
    public void getMapperCode(StringBuilder builder, ShapeWord zvvnModWord) {

    }

    @Override
    public boolean contains(String s) {
        return false;
    }

    @Override
    public boolean isTranslateCodePoint(char c) {
        return false;
    }
}
