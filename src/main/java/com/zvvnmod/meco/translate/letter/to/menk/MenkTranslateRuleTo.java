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
        boolean ue031 = false;
        for (ShapeWordFragment wordFragment : zvvnModWord.getWordFragments()) {
            String s1 = get(s, wordFragment.getKey(), zvvnModWord.getNature());

            if (wordFragment.getKey().equals("\ue031")) {
                ue031 = true;
                if (!Strings.isEmpty(s) && s.endsWith("\u180d\u1822")) {
                    s = s.substring(0, s.length() - 2) + "\u1822";
                }
            }
            if (ue031 && s1.contains("\u180d\u1822")) {
                ue031 = false;
                s1 = s1.replace("\u180d\u1822", "\u1822");
            }

            if (s1 == null) {
                throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                        "Not fount the string " + wordFragment.getContent() + " in mapper rule");
            }
            s = concatAnd202f(s, s1);
        }
        if (s.charAt(0) == '\u202f' && !Strings.isEmpty(builder) && builder.charAt(builder.length() - 1) == '\u0020') {
            builder.deleteCharAt(builder.length() - 1);
        }
        builder.append(s);
    }

    private String concatAnd202f(String s0, String s1) {
        if (s1.charAt(0) == '\u202f' && s0.length() > 0 && s0.charAt(s0.length() - 1) == '\u0020') {
            return s0.substring(0, s0.length() - 1) + s1;
        }
        return s0 + s1;
    }

    private String get(String preLetterCodes, String s, Nature nature) {
        MapperResult mapperResult = resolveUe00c(preLetterCodes, s, nature);
        if (mapperResult.isRet()) {
            return mapperResult.getSb();
        }
        mapperResult = resolveSingleGiiAndUe011(preLetterCodes, s, nature);
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

    private MapperResult resolveSingleGiiAndUe011(String preLetterCodes, String s, Nature nature) {
        if (!s.equals("\ue011") || Strings.isEmpty(preLetterCodes)) {
            return new MapperResult(false);
        }

        if (preLetterCodes.length() == 1) {
            char ch = preLetterCodes.charAt(0);
            if (MglUnicodeBlock.isGiiguulegch(ch)) {
                String result;
                if (ch >= '\u1832' && ch <= '\u1834') {
                    result = "\u1824";
                } else {
                    result = "\u1824\u180b";
                }
                return new MapperResult(true, result);
            }
        }
        return new MapperResult(false);
    }
}
