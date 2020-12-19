package com.zvvnmod.meco.translate.letter;

import com.zvvnmod.meco.translate.word.MglUnicodeBlock;
import org.apache.logging.log4j.util.Strings;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/12/19
 * WEEK  : 周六
 * TIME  : 10:30
 */
public class LetterCodeUtils {

    public static String removeInvalidCodePoint(final String s) {
        if (Strings.isNotEmpty(s) && s.length() > 1) {
            char[] chars = s.toCharArray();
            StringBuilder builder = new StringBuilder(s.length());
            builder.append(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                char aChar = chars[i];
                if (aChar != chars[i - 1]) {
                    builder.append(aChar);
                    continue;
                }
                if (!MglUnicodeBlock.isVowelSeparator(aChar) && !MglUnicodeBlock.isFreeVariationSelector(aChar)) {
                    builder.append(aChar);
                }
            }
            return builder.toString();
        }
        return s;
    }
}
