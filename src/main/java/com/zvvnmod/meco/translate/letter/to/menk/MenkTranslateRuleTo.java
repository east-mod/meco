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
        Nature nature = Nature.CHAGH;
        for (ShapeWordFragment wordFragment : zvvnModWord.getWordFragments()) {
            int index = wordFragment.getKey().indexOf('\ue031');
            if (index == 0 || (index > 0 && wordFragment.getKey().charAt(index - 1) != '\ue005')) {
                nature = Nature.HUNDII;
            }

            s = get(s, wordFragment.getKey());
            if (s == null) {
                throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                        "Not fount the string " + wordFragment.getContent() + " in mapper rule");
            }
        }
        if (s.charAt(0) == '\u202f' && builder.charAt(builder.length() - 1) == '\u0020') {
            builder.deleteCharAt(builder.length() - 1);
        }
        if (nature == Nature.HUNDII) {
            s = hundiiString(s);
        }
        builder.append(s);
    }

    private String get(String preLetterCodes, String s) {
        MapperResult mapperResult = resolveUe00c(preLetterCodes, s);
        if (mapperResult.isRet()) {
            return mapperResult.getSb();
        }
        mapperResult = resolveUe031(preLetterCodes, s);
        if (mapperResult.isRet()) {
            return mapperResult.getSb();
        }
        return concatAnd202f(preLetterCodes, ToMenkLetterCodeMapper.mapper.get(s));
    }

    private String concatAnd202f(String s0, String s1) {
        if (s1.charAt(0) == '\u202f' && s0.length() > 0 && s0.charAt(s0.length() - 1) == '\u0020') {
            return s0.substring(0, s0.length() - 1) + s1;
        }
        return s0 + s1;
    }

    public boolean contains(String s) {
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

    private MapperResult resolveUe031(String preLetterCodes, String s) {
        if (!s.equals("\ue031") || Strings.isBlank(preLetterCodes)) {
            return new MapperResult(false);
        }
        char[] chars = preLetterCodes.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == '\u1820') {
                chars[i] = '\u1821';
            } else if (ch == '\u1823' || ch == '\u1824') {
                chars[i] = '\u1826';
            }
        }
        return new MapperResult(true, concatAnd202f(String.valueOf(chars), ToMenkLetterCodeMapper.mapper.get(s)));
    }

    private String hundiiString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == '\u1820') {
                chars[i] = '\u1821';
            } else if (ch == '\u1823' || ch == '\u1824') {
                chars[i] = '\u1826';
            }
        }
        return String.valueOf(chars);
    }
}
