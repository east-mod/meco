package com.zvvnmod.meco.common;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/6/14
 * WEEK  : 周日
 * TIME  : 10:08
 */
public final class Strings {
    public static String BLANK = "";

    public static boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
}
