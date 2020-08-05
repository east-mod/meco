package com.zvvnmod.meco.common.result;

import com.zvvnmod.meco.common.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> extends ResultBase {
    private String message;

    private T data;

    private List<T> collection;

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.ret = true;
        result.retCode = State.SUCCESS.getCode();
        result.data = data;
        return result;
    }

    public static <T> Result<T> fail(State state) {
        Result<T> result = new Result<>();
        result.ret = false;
        result.retCode = state.getCode();
        result.message = state.getMessage();
        return result;
    }

    public ErrorResult toErrorResult() {
        return new ErrorResult(this.retCode, this.message);
    }
}
