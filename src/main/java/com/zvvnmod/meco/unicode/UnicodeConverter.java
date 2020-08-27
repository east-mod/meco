package com.zvvnmod.meco.unicode;

import com.zvvnmod.meco.common.Strings;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/27
 * WEEK  : 周四
 * TIME  : 23:08
 */
public class UnicodeConverter {

    public static String toCodePoint(String s) {
        if (Strings.isEmpty(s)) {
            return Strings.BLANK;
        }
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder(s.length() * 6);
        for (char aChar : chars) {
            String hexString = Integer.toHexString(aChar);
            int zeroPrefixCount = 4 - hexString.length();
            builder.append("\\u");
            builder.append("0".repeat(Math.max(0, zeroPrefixCount)));
            builder.append(hexString);
        }
        return builder.toString();
    }

}
