package com.zvvnmod.meco.common;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/17
 * WEEK  : 周一
 * TIME  : 14:06
 */
public enum CodeType {
    zvvnmod, delehi, menk, oyun, bainu;

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
