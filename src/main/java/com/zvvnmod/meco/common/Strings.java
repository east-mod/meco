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

    public static boolean endOf(String s, char c) {
        if (Strings.isBlank(s)) {
            return false;
        }
        return s.charAt(s.length() - 1) == c;
    }

    public static boolean endOf(String s0, String s1) {
        if (Strings.isBlank(s0) || Strings.isBlank(s1)) {
            return false;
        }
        String last = s0.substring(s0.length() - s1.length());
        return last.equals(s1);
    }

}
