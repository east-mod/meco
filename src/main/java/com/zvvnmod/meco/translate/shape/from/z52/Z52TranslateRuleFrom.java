package com.zvvnmod.meco.translate.shape.from.z52;

import com.zvvnmod.meco.translate.annotation.From;
import com.zvvnmod.meco.translate.annotation.Rule;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import com.zvvnmod.meco.translate.letter.from.CharType;
import com.zvvnmod.meco.translate.shape.ShapeTranslateRule;
import com.zvvnmod.meco.translate.word.ShapeWordFragment;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/9/15
 * WEEK  : 周二
 * TIME  : 21:05
 */
@Component
@From
@Rule(CodeType.Z52)
public class Z52TranslateRuleFrom implements ShapeTranslateRule {
    @Override
    public boolean isTranslateCodePoint(char c) {
        return false;
    }

    @Override
    public boolean contains(ShapeWordFragment wordFragment) {
        return false;
    }

    @Override
    public String getMapperCode(List<Character> preFragmentContent, ShapeWordFragment wordFragment) {
        return null;
    }

    @Override
    public CharType getCharType(char ch) {
        return null;
    }
}
