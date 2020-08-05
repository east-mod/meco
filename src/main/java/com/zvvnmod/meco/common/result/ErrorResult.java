package com.zvvnmod.meco.common.result;

import com.zvvnmod.meco.common.State;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class ErrorResult extends ResultBase {

    private String message;

    public ErrorResult(Integer retCode, String message) {
        this.ret = false;
        this.retCode = retCode;
        this.message = message;
    }

    public ErrorResult(State state) {
        this.ret = false;
        this.retCode = state.getCode();
        this.message = state.getMessage();
    }

    public static ErrorResult get(Integer retCode, String message) {
        return new ErrorResult(retCode, message);
    }

    public static ErrorResult get(State state) {
        return new ErrorResult(state);
    }
}
