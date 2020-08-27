package com.zvvnmod.meco.translate.letter.to.menk;

import com.zvvnmod.meco.translate.annotation.Rule;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import com.zvvnmod.meco.translate.letter.to.LetterTranslateRuleTo;
import org.springframework.stereotype.Component;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/15
 * WEEK  : 周六
 * TIME  : 20:35
 */
@Component
@Rule(CodeType.Menk_Unicode)
public class MenkTranslateRuleTo implements LetterTranslateRuleTo {
    @Override
    public String getMapperCode(String preLetterCodes, String s) {
        return null;
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
