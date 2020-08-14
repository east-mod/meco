package com.zvvnmod.meco.rule.delehi;

import com.zvvnmod.meco.translate.domain.MglUnicodeBlock;
import com.zvvnmod.meco.translate.domain.Nature;
import com.zvvnmod.meco.translate.domain.TranslateRule;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 19:32
 */
public class DelehiRule implements TranslateRule {

    @Override
    public String getMapperCode(List<Character> pre, String s, Nature nature) {
        Character lastLetter = getLastLetter(pre);
        if (s.equals("\u1822") && lastLetter != null && MglUnicodeBlock.isEhshig(lastLetter)
                && lastLetter != '\u1822') {
            return "\ue006\ue006";
        }
        String s1 = DlhConvertDrsCodeMapper.mapper.get(s);
        if (s1 != null) {
            return s1;
        }
        if (nature.equals(Nature.CHAGH)) {
            return DlhConvertDrsCodeMapper.chaghMapper.get(s);
        } else {
            return DlhConvertDrsCodeMapper.hundiiMapper.get(s);
        }
    }

    private Character getLastLetter(List<Character> pre) {
        if (CollectionUtils.isEmpty(pre)) {
            return null;
        }
        return pre.get(pre.size() - 1);
    }

    @Override
    public boolean contains(String s) {
        if (DlhConvertDrsCodeMapper.mapper.containsKey(s)) {
            return true;
        }
        return DlhConvertDrsCodeMapper.chaghMapper.containsKey(s);
    }

    @Override
    public Nature getCodeNature(char c) {
        return MglUnicodeBlock.getCodeNature(c);
    }

    @Override
    public boolean isTranslateCodePoint(char c) {
        return MglUnicodeBlock.isNormalLetter(c) || MglUnicodeBlock.isFreeVariationSelector(c) ||
                MglUnicodeBlock.isVowelSeparator(c) || DelehiCodeBlock.isWordConnector(c);
    }

    @Override
    public boolean isMongolianCodePoint(char c) {
        return MglUnicodeBlock.isNormalLetter(c) || MglUnicodeBlock.isFreeVariationSelector(c) ||
                MglUnicodeBlock.isVowelSeparator(c);
    }
}
