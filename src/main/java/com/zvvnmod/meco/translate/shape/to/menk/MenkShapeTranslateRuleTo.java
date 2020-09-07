package com.zvvnmod.meco.translate.shape.to.menk;

import com.zvvnmod.meco.translate.annotation.Rule;
import com.zvvnmod.meco.translate.annotation.To;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import com.zvvnmod.meco.translate.letter.from.CharType;
import com.zvvnmod.meco.translate.shape.ShapeTranslateRule;
import com.zvvnmod.meco.translate.word.ShapeWordFragment;
import com.zvvnmod.meco.translate.word.ZvvnModUnicodeBlock;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

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
        return ToMenkShapeCodeMapper.mapper.containsKey(wordFragment.getKey());
    }

    @Override
    public String getMapperCode(List<Character> preFragmentContent, ShapeWordFragment wordFragment) {
        String result = resloveTsatslaga(preFragmentContent, wordFragment.getKey());
        if (result != null) {
            return result;
        }
        return ToMenkShapeCodeMapper.mapper.get(wordFragment.getKey());
    }

    @Override
    public CharType getCharType(char ch) {
        return null;
    }

    private String resloveTsatslaga(List<Character> preFragmentContent, String s) {
        if (!s.equals("\ue00d") || CollectionUtils.isEmpty(preFragmentContent)) {
            return null;
        }
        Character pre = preFragmentContent.get(preFragmentContent.size() - 1);
        if (ZvvnModUnicodeBlock.zvvnModTailCodes.contains(pre)) {
            return "\ue26a";
        }
        return null;
    }
}
