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

    private UnicodeType getUnicodeType(char ch) {
        return isMongolianCodePoint(ch) ? UnicodeType.MONGOLIAN : UnicodeType.OTHER;
    }

    private String getTranslateString() {
        String translateString = translateRule.getCodesMapper().get(this.msc.getKey());
        if (translateString == null) {
            throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                    "NOT_FOUNT_the String " + this.msc.getContent() + "IN_MAPPER_RULE");
        }
        return translateString.replaceAll(" ", "");
    }

    public String translate(final String s0) {
        if (Strings.isBlank(s0)) {
            return Strings.BLANK;
        }
        char[] chars0 = s0.toCharArray();
        StringBuilder builder = new StringBuilder(chars0.length * 2);
        this.msc.setHead(UnicodeType.OTHER);
        for (int i = 0; i < chars0.length; i++) {
            char c = chars0[i];
            if (isMongolianCodePoint(c)) {
                this.msc.push(c);
                boolean notLast = i + 1 < chars0.length;
                if (notLast) {
                    this.msc.setTail(getUnicodeType(chars0[i + 1]));
                    if (containsKey(this.msc.getKey())) {
                        continue;
                    }
                    this.msc.pop();
                    this.msc.setTail(UnicodeType.MONGOLIAN);
                } else {
                    this.msc.setTail(UnicodeType.OTHER);
                }
                if (this.msc.contentIsBlank()) {
                    throw new MecoException(TranslateState.NOT_FOUNT_IN_MAPPER_RULE.getCode(),
                            "NOT_FOUNT_the String " + c + "IN_MAPPER_RULE");
                }
                builder.append(this.getTranslateString());
                this.msc.reset();
                if (notLast) {
                    this.msc.push(c);
                }
            } else {
                if (!this.msc.contentIsBlank()) {
                    this.msc.setTail(UnicodeType.OTHER);
                    builder.append(this.getTranslateString());
                    this.msc.reset();
                }
                builder.append(c);
            }
            if (this.msc.getHead() == null) {
                this.msc.setHead(getUnicodeType(c));
            }
        }
        return builder.toString();
    }


}
