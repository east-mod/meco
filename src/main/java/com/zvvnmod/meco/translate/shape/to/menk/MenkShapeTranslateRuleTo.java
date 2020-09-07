package com.zvvnmod.meco.translate.shape.to.menk;

import com.zvvnmod.meco.translate.annotation.Rule;
import com.zvvnmod.meco.translate.annotation.To;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import com.zvvnmod.meco.translate.letter.from.CharType;
import com.zvvnmod.meco.translate.shape.ShapeTranslateRule;
import com.zvvnmod.meco.translate.word.ShapeWordFragment;
import com.zvvnmod.meco.translate.word.ZvvnModUnicodeBlock;
import org.springframework.stereotype.Component;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/9/7
 * WEEK  : 周一
 * TIME  : 09:46
 */
@Component
@To
@Rule(CodeType.Menk_Shape)
public class MenkShapeTranslateRuleTo implements ShapeTranslateRule {
    @Override
    public boolean isTranslateCodePoint(char c) {
        return ZvvnModUnicodeBlock.zvvnModCodes.contains(c);
    }

    @Override
    public boolean contains(ShapeWordFragment wordFragment) {
        return ToMenkShapeCodeMapper.codeMapper.containsKey(wordFragment.getKey());
    }

    @Override
    public String getMapperCode(ShapeWordFragment wordFragment) {
        return ToMenkShapeCodeMapper.codeMapper.get(wordFragment.getKey());
    }

    @Override
    public CharType getCharType(char ch) {
        return null;
    }
}
