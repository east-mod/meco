package com.zvvnmod.meco.translate.word;

import java.util.HashSet;
import java.util.Set;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 19:06
 */
public class MglUnicodeBlock {
    public static final Set<Character> chagh = new HashSet<>(8);
    public static final Set<Character> hundii = new HashSet<>(8);
    public static final Set<Character> ehshig = new HashSet<>(16);
    public static final char MONGOLIAN_A = '\u1820';
    public static final char MONGOLIAN_LHA = '\u1840';
    public static final char FREE_VARIATION_SELECTOR_ONE = '\u180B';
    public static final char FREE_VARIATION_SELECTOR_TWO = '\u180C';
    public static final char FREE_VARIATION_SELECTOR_THREE = '\u180D';
    public static final char VOWEL_SEPARATOR = '\u180E';
    public static final char NIRUGU = '\u180A';

    static {
        chagh.add('\u1820');
        chagh.add('\u1823');
        chagh.add('\u1824');
        hundii.add('\u1821');
        hundii.add('\u1825');
        hundii.add('\u1826');
        ehshig.add('\u1820');
        ehshig.add('\u1821');
        ehshig.add('\u1822');
        ehshig.add('\u1823');
        ehshig.add('\u1824');
        ehshig.add('\u1825');
        ehshig.add('\u1826');
    }

    public static boolean isNormalLetter(char character) {
        return MONGOLIAN_A <= character && character <= MONGOLIAN_LHA;
    }

    public static boolean isFreeVariationSelector(char character) {
        return FREE_VARIATION_SELECTOR_ONE <= character && character <= FREE_VARIATION_SELECTOR_THREE;
    }

    public static boolean isVowelSeparator(char character) {
        return character == VOWEL_SEPARATOR;
    }

    public static Nature getCodeNature(char ch) {
        if (chagh.contains(ch)) {
            return Nature.CHAGH;
        }
        if (hundii.contains(ch)) {
            return Nature.HUNDII;
        }
        return Nature.SAARMAG;
    }

    public static boolean isEhshig(Character ch) {
        if (ch == null) {
            return false;
        }
        return ehshig.contains(ch) || ch.equals('\u1827');
    }

    public static boolean isGiiguulegch(Character ch) {
        if (ch == null) {
            return false;
        }
        return ch >= '\u1828' && ch <= '\u1842';
    }


    public static boolean isTraditionalEhshig(Character ch) {
        if (ch == null) {
            return false;
        }
        return ehshig.contains(ch);
    }

    public static boolean isChagh(char ch) {
        return chagh.contains(ch);
    }

    public static boolean otherMongolianCode(char ch) {
        return NIRUGU == ch;
    }
}
