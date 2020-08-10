package com.zvvnmod.meco.rule.delehi;

import com.zvvnmod.meco.translate.domain.CodeMapper;
import com.zvvnmod.meco.translate.domain.MglUnicodeBlock;
import com.zvvnmod.meco.translate.domain.TranslateRule;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 19:32
 */
public class DeleteRule implements TranslateRule {
    @Override
    public CodeMapper getCodesMapper() {
        return DlhConvertDrsCodeMapper.mapper;
    }

    @Override
    public boolean isMongolianCodePoint(char c) {
        return MglUnicodeBlock.isNormalLetter(c) || MglUnicodeBlock.isFreeVariationSelector(c) ||
                MglUnicodeBlock.isVowelSeparator(c);
    }
}
