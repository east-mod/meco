package com.zvvnmod.meco.translate.letter.to.delehi;

import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.translate.annotation.Rule;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import com.zvvnmod.meco.translate.letter.to.LetterTranslateRuleTo;
import com.zvvnmod.meco.translate.word.MglUnicodeBlock;
import com.zvvnmod.meco.translate.word.ZvvnModUnicodeBlock;
import org.springframework.stereotype.Component;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/15
 * WEEK  : 周六
 * TIME  : 20:33
 */
@Component
@Rule(CodeType.Delehi)
public class DelehiTranslateRuleTo implements LetterTranslateRuleTo {

    @Override
    public String getMapperCode(String preLetterCodes, String s) {
        String result = resolveUe00c(preLetterCodes, s);
        if (result != null) {
            return result;
        }
        return ToDelehiCodeMapper.mapper.get(s);
    }

    public boolean contains(String s) {
        return ToDelehiCodeMapper.mapper.containsKey(s);
    }

    public boolean isTranslateCodePoint(char c) {
        return ZvvnModUnicodeBlock.zvvnModCodes.contains(c);
    }

    /**
     * tail n and a
     *
     * @return n and a
     */
    private String resolveUe00c(String preLetterCodes, String s) {
        if (!s.equals("\ue00c")) {
            return null;
        }
        if (Strings.isBlank(preLetterCodes)) {
            return "\u1820";
        }
        Character c = preLetterCodes.charAt(preLetterCodes.length() - 1);
        if (MglUnicodeBlock.isTraditionalEhshig(c)) {
            return "\u1828";
        }
        return "\u1820";
    }
}
