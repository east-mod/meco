package com.zvvnmod.meco.translate.domain;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.translate.exception.TranslateState;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 18:14
 */
public class Translator {

    private TranslateRule translateRule;

    private MSC msc;

    private Translator() {
    }

    public Translator(final TranslateRule translateRule) {
        this.translateRule = translateRule;
        this.msc = new MSC();
    }

    private boolean containsKey(String s) {
        if (translateRule == null) {
            throw new MecoException(TranslateState.MISS_TRANSLATE_RULE);
        }
        return translateRule.getCodesMapper().containsKey(s);
    }

    private boolean isMongolianCodePoint(char ch) {
        if (translateRule == null) {
            throw new MecoException(TranslateState.MISS_TRANSLATE_RULE);
        }
        return translateRule.isMongolianCodePoint(ch);
    }

    public String translate(final String s0) {
        if (Strings.isBlank(s0)) {
            return Strings.BLANK;
        }
        char[] chars0 = s0.toCharArray();
        StringBuilder builder = new StringBuilder(chars0.length * 2);
        this.msc.setHead(UnicodeType.OTHER);
        for (char c : chars0) {
            boolean isMongolian = isMongolianCodePoint(c);
            if (isMongolian) {
                this.msc.push(c);
                if (!containsKey(this.msc.getKey())) {
                    this.msc.pop();
                    this.msc.setTail(UnicodeType.MONGOLIAN);
                    if (this.msc.contentIsBlank()) {
                        throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                                "NOT_FOUNT_the String " + c + "IN_MAPPER_RULE");
                    }
                    String translateString = translateRule.getCodesMapper().get(this.msc.getKey());
                    builder.append(translateString);
                    this.msc.reset();
                } else {
                    continue;
                }
            }
            if (!isMongolian && !this.msc.contentIsBlank()) {
                this.msc.setTail(UnicodeType.OTHER);
                String translateString = translateRule.getCodesMapper().get(this.msc.getKey());
                builder.append(translateString);
                this.msc.reset();
            }
            this.msc.setHead(isMongolianCodePoint(c) ? UnicodeType.MONGOLIAN : UnicodeType.OTHER);
        }

        return builder.toString();
    }


}
