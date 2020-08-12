package com.zvvnmod.meco.rule.delehi;

import com.zvvnmod.meco.translate.domain.MglUnicodeBlock;
import com.zvvnmod.meco.translate.domain.Nature;
import com.zvvnmod.meco.translate.domain.TranslateRule;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 19:32
 */
public class DeleteRule implements TranslateRule {
    @Override
    public String getMapperCode(String s, Nature nature) {
        return DlhConvertDrsCodeMapper.mapper.get(s);
    }

    @Override
    public boolean contains(String s) {
        return DlhConvertDrsCodeMapper.mapper.containsKey(s);
    }

    @Override
    public Nature getCodeNature(char c) {
        return Nature.SAARMAG;
    }

    @Override
    public boolean isMongolianCodePoint(char c) {
        return MglUnicodeBlock.isNormalLetter(c) || MglUnicodeBlock.isFreeVariationSelector(c) ||
                MglUnicodeBlock.isVowelSeparator(c);
    }
}
