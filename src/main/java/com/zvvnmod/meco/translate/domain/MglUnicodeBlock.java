package com.zvvnmod.meco.translate.domain;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 19:06
 */
public class MglUnicodeBlock {
    public static final char MONGOLIAN_A = '\u1820';
    public static final char MONGOLIAN_LHA = '\u1840';

    public static final char FREE_VARIATION_SELECTOR_ONE = '\u180B';
    public static final char FREE_VARIATION_SELECTOR_TWO = '\u180C';
    public static final char FREE_VARIATION_SELECTOR_THREE = '\u180D';

    public static final char VOWEL_SEPARATOR = '\u180E';

    public static boolean isNormalLetter(char character) {
        return MONGOLIAN_A <= character && character <= MONGOLIAN_LHA;
    }

    public static boolean isFreeVariationSelector(char character) {
        return FREE_VARIATION_SELECTOR_ONE <= character && character <= FREE_VARIATION_SELECTOR_THREE;
    }

    public static boolean isVowelSeparator(char character) {
        return character == VOWEL_SEPARATOR;
    }
}
