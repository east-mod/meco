package com.zvvnmod.meco.translate.exception;

import com.zvvnmod.meco.common.State;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : Mon
 * TIME  : 21:24
 */
public class TranslateState extends State {
    public TranslateState(Integer code) {
        super(code);
    }

    public TranslateState(Integer code, String message) {
        super(code, message);
    }

    public static TranslateState UNICODE_TYPE_NOT_BE_NULL = new TranslateState(30900,
            "UNICODE_TYPE_NOT_BE_NULL");
    public static TranslateState MISS_TRANSLATE_RULE = new TranslateState(309001,
            "MISS_TRANSLATE_RULE");
    public static TranslateState MSC_NOTHING_TO_POP = new TranslateState(309002,
            "MSC_NOTHING_TO_POP");
    public static TranslateState NOT_FOUNT_IN_MAPPER_RULE = new TranslateState(309003,
            "NOT_FOUNT_IN_MAPPER_RULE");
}
