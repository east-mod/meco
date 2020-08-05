package com.zvvnmod.meco.common.result;

import com.zvvnmod.meco.common.State;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericResult<T> extends ResultBase {
    T data;

    public GenericResult(T data) {
        this.ret = true;
        this.retCode = State.SUCCESS.getCode();
        this.data = data;
    }

    public static <T> GenericResult<T> get(T data) {
        return new GenericResult<>(data);
    }
}
