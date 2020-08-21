package com.zvvnmod.meco.translate.letter.to.delehi;

import com.zvvnmod.meco.common.CodeType;
import com.zvvnmod.meco.translate.annotation.To;
import com.zvvnmod.meco.translate.letter.from.Nature;
import com.zvvnmod.meco.translate.letter.from.TranslateRule;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/15
 * WEEK  : 周六
 * TIME  : 20:33
 */
@To(CodeType.delehi)
@Component
public class TranslateToDelehi implements TranslateRule {
    @Override
    public String getMapperCode(List<Character> pre, String s, Nature nature) {
        String result = resolveUe00c(pre, s);
        if (result != null) {
            return result;
        }
        return ToDelehiCodeMapper.mapper.get(s);
    }

    @Override
    public boolean contains(String s) {
        return false;
    }

    @Override
    public Nature getCodeNature(char c) {
        return null;
    }

    @Override
    public boolean isTranslateCodePoint(char c) {
        return false;
    }

    @Override
    public boolean isMongolianCodePoint(char c) {
        return false;
    }


    /**
     * tail n and a
     * @return n and a
     */
    private String resolveUe00c(List<Character> pre, String s) {
        if (!s.equals("\ue00c")) {
            return null;
        }
        if (CollectionUtils.isEmpty(pre)) {
            return null;
        }
        Character c = pre.get(pre.size() - 1);

        return null;
    }
}
