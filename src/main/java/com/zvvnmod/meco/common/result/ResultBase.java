package com.zvvnmod.meco.common.result;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ResultBase {
    protected Boolean ret;
    protected Integer retCode;
}
