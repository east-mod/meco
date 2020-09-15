package com.zvvnmod.meco.translate.letter.to;

import lombok.Getter;
import lombok.Setter;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/9/15
 * WEEK  : 周二
 * TIME  : 18:43
 */
@Getter
@Setter
public class MapperResult {
    private boolean ret;
    private String sb;

    public MapperResult(boolean ret, String sb) {
        this.ret = ret;
        this.sb = sb;
    }

    public MapperResult(boolean ret) {
        this.ret = ret;
    }
}