package com.zvvnmod.meco.common;

import lombok.Getter;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/5
 * WEEK  : Wed
 * TIME  : 23:30
 */
@Getter
public class State {
    private Integer code;
    private String message;

    protected State(Integer code) {
        this.code = code;
    }

    protected State(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static State SUCCESS = new State(30200, "Success");
    public static State INTERNAL_SERVER_ERROR = new State(30400, "INTERNAL_SERVER_ERROR");
}
