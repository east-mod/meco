package com.zvvnmod.meco.translate.shape.from.menk;

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
 * DATE  : 2020/8/30
 * WEEK  : 周日
 * TIME  : 22:35
 */
@Component
@From
@Rule(CodeType.Menk_Shape)
public class MenkShapeTranslateRuleFrom implements ShapeTranslateRule {
    @Override
    public boolean isTranslateCodePoint(char c) {
        return (c >= '\ue263' && c <= '\ue34a') || (c >= '\ue234' && c <= '\ue261');
    }

    @Override
    public boolean contains(ShapeWordFragment wordFragment) {
        return FromMenkShapeCodeMapper.codeMapper.containsKey(wordFragment.getLocateKey());
    }

    @Override
    public String getMapperCode(List<Character> preFragmentContent, ShapeWordFragment wordFragment) {
        return FromMenkShapeCodeMapper.codeMapper.get(wordFragment.getLocateKey());
    }

    private boolean isWordCodePoint(char c) {
        return c >= '\ue264' && c <= '\ue34f';
    }

    public CharType getCharType(char ch) {
        return isWordCodePoint(ch) ? CharType.MONGOLIAN : CharType.OTHER;
    }

}
