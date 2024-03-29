package com.zvvnmod.meco.translate.letter.from.menk;

import com.zvvnmod.meco.translate.annotation.Rule;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import com.zvvnmod.meco.translate.letter.from.LetterTranslateRuleFrom;
import com.zvvnmod.meco.translate.letter.from.delehi.DelehiCodeBlock;
import com.zvvnmod.meco.translate.word.MglUnicodeBlock;
import com.zvvnmod.meco.translate.word.Nature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 19:32
 */
@Component
@Rule(CodeType.Menk_Letter)
public class MenkLetterTranslateRuleFrom implements LetterTranslateRuleFrom {
    private static final Logger logger = LoggerFactory.getLogger(MenkLetterTranslateRuleFrom.class);

    @Override
    public String getMapperCode(List<Character> pre, List<Character> suf, String s, Nature nature) {
        logger.info(nature.toString());
        String result = resolveDevsgerI(pre, s);
        if (result != null) {
            return result;
        }
        result = resoloveW(pre, s);
        if (result != null) {
            return result;
        }
        result = resoloveT(suf, s);
        if (result != null) {
            return result;
        }
        result = resoloveG(suf, s, nature);
        if (result != null) {
            return result;
        }
        result = FromMenkLetterCodeMapper.mapper.get(s);
        if (result != null) {
            return result;
        }
        if (nature.equals(Nature.CHAGH)) {
            return FromMenkLetterCodeMapper.chaghMapper.get(s);
        } else if (nature.equals(Nature.HUNDII)) {
            return FromMenkLetterCodeMapper.hundiiMapper.get(s);
        } else {
            return FromMenkLetterCodeMapper.saarmag.get(s);
        }
    }

    private String resolveDevsgerI(List<Character> pre, String s) {
        if (!s.equals("\u1836") && !s.equals("\u1822")) {
            return null;
        }
        if (CollectionUtils.isEmpty(pre)) {
            return null;
        }
        Character c = pre.get(pre.size() - 1);
        if (s.equals("\u1822") && (c.equals('\u1822') || c.equals('\u1836')) && pre.size() > 2) {
            Character pre2 = pre.get(pre.size() - 2);
            for (char c1 : FromMenkLetterCodeMapper.doubleIEhishig) {
                if (c1 == pre2) {
                    return "";
                }
            }
        }
        for (char c1 : FromMenkLetterCodeMapper.doubleIEhishig) {
            if (c1 == c) {
                return "\ue006\ue006";
            }
        }
        return null;
    }

    private String resoloveW(List<Character> pre, String s) {
        if (!s.contains("\u1838")) {
            return null;
        }
        if (CollectionUtils.isEmpty(pre)) {
            return null;
        }
        Character c = pre.get(pre.size() - 1);
        if (MglUnicodeBlock.isEhshig(c)) {
            return FromMenkLetterCodeMapper.wWithEhshig.get(s);
        }
        return null;
    }

    private String resoloveT(List<Character> suf, String s) {
        if (s.equals("\u1832") && !CollectionUtils.isEmpty(suf)) {
            Character sufFirst = suf.get(0);
            if (MglUnicodeBlock.isGiiguulegch(sufFirst)) {
                return "\ue043";
            }
        }
        return null;
    }

    private String resoloveG(final List<Character> suf, final String s, final Nature nature) {
        if (s.equals("\u182d") && !CollectionUtils.isEmpty(suf)) {
            Character sufFirst = suf.get(0);
            if (MglUnicodeBlock.isGiiguulegch(sufFirst)) {
                return nature == Nature.CHAGH ? "\ue005\ue005" : "\ue031";
            }
        }
        return null;
    }

    @Override
    public boolean contains(String s) {
        if (FromMenkLetterCodeMapper.mapper.containsKey(s)) {
            return true;
        }
        return FromMenkLetterCodeMapper.chaghMapper.containsKey(s);
    }

    @Override
    public Nature getCodeNature(char c) {
        return MglUnicodeBlock.getCodeNature(c);
    }

    @Override
    public boolean isTranslateCodePoint(char c) {
        return MglUnicodeBlock.isNormalLetter(c) || MglUnicodeBlock.isFreeVariationSelector(c) ||
                MglUnicodeBlock.isVowelSeparator(c) || DelehiCodeBlock.isWordConnector(c) ||
                MglUnicodeBlock.otherMongolianCode(c);
    }

    @Override
    public boolean isWordCodePoint(char c) {
        return MglUnicodeBlock.isNormalLetter(c) || MglUnicodeBlock.isFreeVariationSelector(c) ||
                MglUnicodeBlock.isVowelSeparator(c) || MglUnicodeBlock.otherMongolianCode(c);
    }
}
