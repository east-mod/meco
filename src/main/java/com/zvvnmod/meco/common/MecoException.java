package com.zvvnmod.meco.common;

import lombok.Getter;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/5
 * WEEK  : Wed
 * TIME  : 23:27
 */
@Getter
public class MecoException extends RuntimeException {

    private static final long serialVersionUID = -4328512807639556120L;

    private Integer code;

    public MecoException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public MecoException(State state) {
        super(state.getMessage());
        this.code = state.getCode();
    }
}
