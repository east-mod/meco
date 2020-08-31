package com.zvvnmod.meco.translate.enumeration;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.State;
import lombok.Getter;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/17
 * WEEK  : 周一
 * TIME  : 14:06
 */
public enum CodeType {
    Zvvnmod(CodeSeries.Shape),
    Delehi(CodeSeries.Letter),
    Menk_Shape(CodeSeries.Shape),
    Menk_Unicode(CodeSeries.Letter),
    Oyun(CodeSeries.Letter),
    Bainu(CodeSeries.Letter);

    @Getter
    private final CodeSeries codeSeries;

    CodeType(CodeSeries codeSeries) {
        this.codeSeries = codeSeries;
    }

    public static CodeType[] codeTypes = CodeType.class.getEnumConstants();

    public static CodeType get(final String value) {
        for (CodeType codeType : codeTypes) {
            if (codeType.toString().toLowerCase().equals(value.toLowerCase())) {
                return codeType;
            }
        }
        throw new MecoException(State.NOT_SUPPORT_ENUM_TYPE);
    }
}
