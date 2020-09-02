package com.zvvnmod.meco.translate.shape.from.menk;

import com.zvvnmod.meco.translate.annotation.Rule;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import com.zvvnmod.meco.translate.shape.ShapeTranslateRule;
import org.springframework.stereotype.Component;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/30
 * WEEK  : 周日
 * TIME  : 22:35
 */
@Component
@Rule(CodeType.Menk_Shape)
public class MenkShapeTranslateRuleFrom implements ShapeTranslateRule {
    @Override
    public boolean isTranslateCodePoint(char c) {
        return c >= '\ue264' && c <= '\ue34f';
    }

    @Override
    public boolean contains(String s) {
        return FromMenkShapeCodeMapper.codeMapper.containsKey(s);
    }

    @Override
    public String getMapperCode(String s) {
        return FromMenkShapeCodeMapper.codeMapper.get(s);
    }

    @Override
    public boolean isWordCodePoint(char c) {
        return c >= '\ue264' && c <= '\ue34f';
    }
}
