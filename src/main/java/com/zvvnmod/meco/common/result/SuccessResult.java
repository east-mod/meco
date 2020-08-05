package com.zvvnmod.meco.common.result;

import com.zvvnmod.meco.common.State;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessResult extends ResultBase {
    public SuccessResult() {
        this.ret = true;
        this.retCode = State.SUCCESS.getCode();
    }

    public static SuccessResult get() {
        return new SuccessResult();
    }
}
