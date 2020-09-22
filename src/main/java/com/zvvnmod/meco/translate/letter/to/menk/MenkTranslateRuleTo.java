package com.zvvnmod.meco.translate.letter.to.menk;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.translate.annotation.Rule;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import com.zvvnmod.meco.translate.exception.TranslateState;
import com.zvvnmod.meco.translate.letter.to.LetterTranslateRuleTo;
import com.zvvnmod.meco.translate.letter.to.MapperResult;
import com.zvvnmod.meco.translate.word.MglUnicodeBlock;
import com.zvvnmod.meco.translate.word.Nature;
import com.zvvnmod.meco.translate.word.ShapeWord;
import com.zvvnmod.meco.translate.word.ShapeWordFragment;
import com.zvvnmod.meco.translate.word.ZvvnModUnicodeBlock;
import org.springframework.stereotype.Component;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/15
 * WEEK  : 周六
 * TIME  : 20:35
 */
@Component
@Rule(CodeType.Menk_Letter)
public class MenkTranslateRuleTo implements LetterTranslateRuleTo {

    @Override
    public void getMapperCode(StringBuilder builder, ShapeWord zvvnModWord) {
        String s = "";
        for (ShapeWordFragment wordFragment : zvvnModWord.getWordFragments()) {
            s = get(s, wordFragment.getKey(), zvvnModWord.getNature());
            if (s == null) {
                throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                        "Not fount the string " + wordFragment.getContent() + " in mapper rule");
            }
            if (s.charAt(0) == '\u202f' && builder.charAt(builder.length() - 1) == '\u0020') {
                builder.deleteCharAt(builder.length() - 1);
            }
            builder.append(s);
        }
    }

    private String get(String preLetterCodes, String s, Nature nature) {
        MapperResult mapperResult = resolveUe00c(preLetterCodes, s, nature);
        if (mapperResult.isRet()) {
            return mapperResult.getSb();
        }

        String mapperString;
        if (nature == Nature.CHAGH) {
            mapperString = ToMenkLetterCodeMapper.chaghMapper.get(s);
        } else {
            mapperString = ToMenkLetterCodeMapper.hundiiMapper.get(s);
        }
        if (Strings.isEmpty(mapperString)) {
            mapperString = ToMenkLetterCodeMapper.mapper.get(s);
        }
        return mapperString;
    }

    public boolean contains(String s) {
        if (ToMenkLetterCodeMapper.chaghMapper.containsKey(s)) {
            return true;
        }
        return ToMenkLetterCodeMapper.mapper.containsKey(s);
    }

    public boolean isTranslateCodePoint(char c) {
        return ZvvnModUnicodeBlock.zvvnModCodes.contains(c);
    }

    /**
     * tail n and a
     *
     * @return n and a
     */
    private MapperResult resolveUe00c(String preLetterCodes, String s, Nature nature) {
        if (!s.equals("\ue00c")) {
            return new MapperResult(false);
        }
        if (Strings.isEmpty(preLetterCodes)) {
            if (nature == Nature.CHAGH) {
                return new MapperResult(true, "\u1820");
            }
            return new MapperResult(true, "\u1821");
        }
        Character c = preLetterCodes.charAt(preLetterCodes.length() - 1);
        if (MglUnicodeBlock.isTraditionalEhshig(c)) {
            return new MapperResult(true, "\u1828");
        }
        if (nature == Nature.CHAGH) {
            return new MapperResult(true, "\u1820");
        }
        return new MapperResult(true, "\u1821");
    }
}
