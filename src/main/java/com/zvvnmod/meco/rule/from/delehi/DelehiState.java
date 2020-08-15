package com.zvvnmod.meco.rule.from.delehi;

import com.zvvnmod.meco.common.State;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/5
 * WEEK  : Wed
 * TIME  : 23:33
 */
public class DelehiState extends State {

    public DelehiState(Integer code) {
        super(code);
    }

    public DelehiState(Integer code, String message) {
        super(code, message);
    }

    public static DelehiState DUPLICATE_KEY = new DelehiState(30600, "DUPLICATE_KEY");
}
