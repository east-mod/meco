package com.zvvnmod.meco.translate.letter.to.delehi;

import com.zvvnmod.meco.translate.annotation.Rule;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import com.zvvnmod.meco.translate.letter.from.Nature;
import com.zvvnmod.meco.translate.letter.to.LetterToTranslateRule;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/15
 * WEEK  : 周六
 * TIME  : 20:33
 */
@Rule(CodeType.Delehi)
@Component
public class TranslateToDelehiRule implements LetterToTranslateRule {

    public String getMapperCode(List<Character> pre, String s) {
//        String result = resolveUe00c(pre, s);
//        if (result != null) {
//            return result;
//        }
//        return ToDelehiCodeMapper.mapper.get(s);
        return null;
    }

    public boolean contains(String s) {
        return false;
    }

    public Nature getCodeNature(char c) {
        return null;
    }

    public boolean isTranslateCodePoint(char c) {
        return false;
    }

    public boolean isMongolianCodePoint(char c) {
        return false;
    }

    /**
     * tail n and a
     *
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
