package com.zvvnmod.meco.rule.delehi;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/13
 * WEEK  : Thu
 * TIME  : 14:33
 */
public class DelehiCodeBlock {
    public static boolean isWordConnector(char ch) {
        return ch == '\u202f';
    }
}
