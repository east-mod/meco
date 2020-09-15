package com.zvvnmod.meco.translate.letter.to.delehi;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.translate.annotation.Rule;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import com.zvvnmod.meco.translate.exception.TranslateState;
import com.zvvnmod.meco.translate.letter.to.LetterTranslateRuleTo;
import com.zvvnmod.meco.translate.letter.to.MapperResult;
import com.zvvnmod.meco.translate.word.MglUnicodeBlock;
import com.zvvnmod.meco.translate.word.ShapeWord;
import com.zvvnmod.meco.translate.word.ShapeWordFragment;
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
    public void getMapperCode(StringBuilder builder, ShapeWord zvvnModWord) {
        String s = "";
        for (ShapeWordFragment wordFragment : zvvnModWord.getWordFragments()) {
            s = get(s, wordFragment.getKey());
            if (s == null) {
                throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                        "Not fount the string " + wordFragment.getContent() + " in mapper rule");
            }
        }
        if (s.charAt(0) == '\u202f' && builder.charAt(builder.length() - 1) == '\u0020') {
            builder.deleteCharAt(builder.length() - 1);
        }
        builder.append(s);
    }

    private String get(String preLetterCodes, String s) {
        MapperResult result = resolveUe00c(preLetterCodes, s);
        if (result.isRet()) {
            return result.getSb();
        }
        return concatAnd202f(preLetterCodes, ToDelehiCodeMapper.mapper.get(s));
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
    private MapperResult resolveUe00c(String preLetterCodes, String s) {
        if (!s.equals("\ue00c")) {
            return new MapperResult(false);
        }
        if (Strings.isEmpty(preLetterCodes)) {
            return new MapperResult(true, preLetterCodes + "\u1820");
        }
        Character c = preLetterCodes.charAt(preLetterCodes.length() - 1);
        if (MglUnicodeBlock.isTraditionalEhshig(c)) {
            return new MapperResult(true, preLetterCodes + "\u1828");
        }
        return new MapperResult(true, preLetterCodes + "\u1820");
    }

    private String concatAnd202f(String s0, String s1) {
        if (s1.charAt(0) == '\u202f' && s0.length() > 0 && s0.charAt(s0.length() - 1) == '\u0020') {
            return s0.substring(0, s0.length() - 1) + s1;
        }
        return s0 + s1;
    }
}
