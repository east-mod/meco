package com.zvvnmod.meco.translate.word;

import java.util.HashSet;
import java.util.Set;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/22
 * WEEK  : 周六
 * TIME  : 23:08
 */
public class ZvvnModUnicodeBlock {
    public static final Set<Character> zvvnModCodes = new HashSet<>(256);
    public static final Set<Character> zvvnModTailCodes = new HashSet<>(128);
    public static final Set<Character> zvvnModPunctuations = new HashSet<>(128);
    public static final Set<Character> toZ52Punctuations = new HashSet<>(128);

    static {
        buildZvvnModCodes();
        buildZvvnModTailCodes();
        buildZvvnModPunctuations();
        buildToZ52Punctuations();
    }

    private static void buildZvvnModCodes() {
        zvvnModCodes.add('\ue000');
        zvvnModCodes.add('\ue001');

        zvvnModCodes.add('\ue005');
        zvvnModCodes.add('\ue006');

        zvvnModCodes.add('\ue008');

        zvvnModCodes.add('\ue00c');
        zvvnModCodes.add('\ue00d');
        zvvnModCodes.add('\ue00e');
        zvvnModCodes.add('\ue00f');
        zvvnModCodes.add('\ue010');
        zvvnModCodes.add('\ue011');

        zvvnModCodes.add('\ue01a');
        zvvnModCodes.add('\ue01b');

        zvvnModCodes.add('\ue027');
        zvvnModCodes.add('\ue028');
        zvvnModCodes.add('\ue029');
        zvvnModCodes.add('\ue02a');
        zvvnModCodes.add('\ue02b');
        zvvnModCodes.add('\ue02c');
        zvvnModCodes.add('\ue02d');
        zvvnModCodes.add('\ue02e');
        zvvnModCodes.add('\ue02f');
        zvvnModCodes.add('\ue030');
        zvvnModCodes.add('\ue031');
        zvvnModCodes.add('\ue032');
        zvvnModCodes.add('\ue034');
        zvvnModCodes.add('\ue036');
        zvvnModCodes.add('\ue037');
        zvvnModCodes.add('\ue038');
        zvvnModCodes.add('\ue039');
        zvvnModCodes.add('\ue03a');
        zvvnModCodes.add('\ue03b');
        zvvnModCodes.add('\ue03c');
        zvvnModCodes.add('\ue03d');
        zvvnModCodes.add('\ue03e');
        zvvnModCodes.add('\ue03f');
        zvvnModCodes.add('\ue040');
        zvvnModCodes.add('\ue041');
        zvvnModCodes.add('\ue042');
        zvvnModCodes.add('\ue043');
        zvvnModCodes.add('\ue044');
        zvvnModCodes.add('\ue045');
        zvvnModCodes.add('\ue046');

        zvvnModCodes.add('\ue049');
        zvvnModCodes.add('\ue04a');
        zvvnModCodes.add('\ue04b');
        zvvnModCodes.add('\ue04c');
        zvvnModCodes.add('\ue04d');
        zvvnModCodes.add('\ue04e');
        zvvnModCodes.add('\ue04f');
        zvvnModCodes.add('\ue050');
        zvvnModCodes.add('\ue051');

        zvvnModCodes.add('\ue053');
        zvvnModCodes.add('\ue054');
        zvvnModCodes.add('\ue055');
        zvvnModCodes.add('\ue056');
        zvvnModCodes.add('\ue057');
        zvvnModCodes.add('\ue058');
        zvvnModCodes.add('\ue059');
        zvvnModCodes.add('\ue05a');
        zvvnModCodes.add('\ue05b');
        zvvnModCodes.add('\ue05c');
        zvvnModCodes.add('\ue05d');
        zvvnModCodes.add('\ue05e');
        zvvnModCodes.add('\ue05f');
        zvvnModCodes.add('\ue060');
        zvvnModCodes.add('\ue061');
        zvvnModCodes.add('\ue062');
        zvvnModCodes.add('\ue063');
        zvvnModCodes.add('\ue064');
        zvvnModCodes.add('\ue066');
        zvvnModCodes.add('\ue067');
        zvvnModCodes.add('\ue068');
        zvvnModCodes.add('\ue069');
        zvvnModCodes.add('\ue06a');
        zvvnModCodes.add('\ue077');
        zvvnModCodes.add('\ue079');
        zvvnModCodes.add('\ue07a');
        zvvnModCodes.add('\ue07b');
        zvvnModCodes.add('\ue07c');
        zvvnModCodes.add('\ue07d');
        zvvnModCodes.add('\ue07f');
        zvvnModCodes.add('\ue080');
        zvvnModCodes.add('\ue081');
        zvvnModCodes.add('\ue082');
        zvvnModCodes.add('\ue083');
        zvvnModCodes.add('\ue084');
        zvvnModCodes.add('\ue086');
        zvvnModCodes.add('\ue087');
        zvvnModCodes.add('\ue088');
        zvvnModCodes.add('\ue089');
        zvvnModCodes.add('\ue08a');
        zvvnModCodes.add('\ue08c');
        zvvnModCodes.add('\ue08d');
        zvvnModCodes.add('\ue08e');
        zvvnModCodes.add('\ue08f');
        zvvnModCodes.add('\ue090');
        zvvnModCodes.add('\ue091');
        zvvnModCodes.add('\ue092');
        zvvnModCodes.add('\ue093');
        zvvnModCodes.add('\ue094');
        zvvnModCodes.add('\ue095');
        zvvnModCodes.add('\ue097');
        zvvnModCodes.add('\ue098');
        zvvnModCodes.add('\ue099');
        zvvnModCodes.add('\ue09a');
        zvvnModCodes.add('\ue09b');
        zvvnModCodes.add('\ue09c');
        zvvnModCodes.add('\ue09d');
        zvvnModCodes.add('\ue09f');
        zvvnModCodes.add('\ue0a0');
        zvvnModCodes.add('\ue0a1');
        zvvnModCodes.add('\ue0a2');
        zvvnModCodes.add('\ue0a3');
        zvvnModCodes.add('\ue0a5');
        zvvnModCodes.add('\ue0a6');
        zvvnModCodes.add('\ue0a7');
        zvvnModCodes.add('\ue0a8');
        zvvnModCodes.add('\ue0a9');
        zvvnModCodes.add('\ue0aa');
        zvvnModCodes.add('\ue0ad');
        zvvnModCodes.add('\ue0ae');
        zvvnModCodes.add('\ue0af');
        zvvnModCodes.add('\ue0b0');
        zvvnModCodes.add('\ue0b1');
        zvvnModCodes.add('\ue0b6');
        zvvnModCodes.add('\ue0b7');
        zvvnModCodes.add('\ue0b8');
        zvvnModCodes.add('\ue0b9');
        zvvnModCodes.add('\ue0ba');
        zvvnModCodes.add('\ue0bb');
        zvvnModCodes.add('\ue0bc');
        zvvnModCodes.add('\ue0cd');
        zvvnModCodes.add('\ue0ce');
        zvvnModCodes.add('\ue0cf');
        zvvnModCodes.add('\ue0d0');

        zvvnModCodes.add('\ue140');
        zvvnModCodes.add('\ue141');
        zvvnModCodes.add('\ue142');
        zvvnModCodes.add('\ue143');
        zvvnModCodes.add('\ue144');
    }

    private static void buildZvvnModTailCodes() {
        zvvnModTailCodes.add('\ue00c');
        zvvnModTailCodes.add('\ue00d');
        zvvnModTailCodes.add('\ue00e');
        zvvnModTailCodes.add('\ue00f');
        zvvnModTailCodes.add('\ue010');
        zvvnModTailCodes.add('\ue011');
        zvvnModTailCodes.add('\ue01a');
        zvvnModTailCodes.add('\ue01b');
        zvvnModTailCodes.add('\ue02b');
        zvvnModTailCodes.add('\ue02e');
        zvvnModTailCodes.add('\ue032');
        zvvnModTailCodes.add('\ue038');
        zvvnModTailCodes.add('\ue03b');
        zvvnModTailCodes.add('\ue03e');
        zvvnModTailCodes.add('\ue041');
        zvvnModTailCodes.add('\ue044');
        zvvnModTailCodes.add('\ue049');
        zvvnModTailCodes.add('\ue04c');
        zvvnModTailCodes.add('\ue04f');
        zvvnModTailCodes.add('\ue055');
        zvvnModTailCodes.add('\ue058');
        zvvnModTailCodes.add('\ue05b');
        zvvnModTailCodes.add('\ue05e');
        zvvnModTailCodes.add('\ue061');
        zvvnModTailCodes.add('\ue064');
        zvvnModTailCodes.add('\ue067');
        zvvnModTailCodes.add('\ue06a');
        zvvnModTailCodes.add('\ue077');
        zvvnModTailCodes.add('\ue079');
        zvvnModTailCodes.add('\ue07a');
        zvvnModTailCodes.add('\ue07b');
        zvvnModTailCodes.add('\ue081');
        zvvnModTailCodes.add('\ue086');
        zvvnModTailCodes.add('\ue087');
        zvvnModTailCodes.add('\ue088');
        zvvnModTailCodes.add('\ue08e');
        zvvnModTailCodes.add('\ue091');
        zvvnModTailCodes.add('\ue092');
        zvvnModTailCodes.add('\ue093');
        zvvnModTailCodes.add('\ue099');
        zvvnModTailCodes.add('\ue09c');
        zvvnModTailCodes.add('\ue09d');
        zvvnModTailCodes.add('\ue09f');
        zvvnModTailCodes.add('\ue0a0');
        zvvnModTailCodes.add('\ue0a1');
        zvvnModTailCodes.add('\ue0a7');
        zvvnModTailCodes.add('\ue0aa');
        zvvnModTailCodes.add('\ue0ad');
        zvvnModTailCodes.add('\ue0ae');
        zvvnModTailCodes.add('\ue0af');
        zvvnModTailCodes.add('\ue0b8');
        zvvnModTailCodes.add('\ue0bb');
        zvvnModTailCodes.add('\ue0bc');
        zvvnModTailCodes.add('\ue0cd');
        zvvnModTailCodes.add('\ue0ce');
        zvvnModTailCodes.add('\ue0cf');
        zvvnModTailCodes.add('\ue0d0');

    }

    private static void buildZvvnModPunctuations() {
        zvvnModPunctuations.add('\u1800');
        zvvnModPunctuations.add('\u1801');
        zvvnModPunctuations.add('\u1802');
        zvvnModPunctuations.add('\u1803');
        zvvnModPunctuations.add('\u1804');
        zvvnModPunctuations.add('\u1805');
        zvvnModPunctuations.add('\u1806');
        zvvnModPunctuations.add('\u1807');
        zvvnModPunctuations.add('\u1808');
        zvvnModPunctuations.add('\u1809');
        zvvnModPunctuations.add('\u180A');

        //没有匹配
        zvvnModPunctuations.add('\ue23f');
        zvvnModPunctuations.add('\ue240');
        zvvnModPunctuations.add('\ue241');
        zvvnModPunctuations.add('\ue242');


        zvvnModPunctuations.add('\u00b7');

        zvvnModPunctuations.add('\u1810');
        zvvnModPunctuations.add('\u1811');
        zvvnModPunctuations.add('\u1812');
        zvvnModPunctuations.add('\u1813');
        zvvnModPunctuations.add('\u1814');
        zvvnModPunctuations.add('\u1815');
        zvvnModPunctuations.add('\u1816');
        zvvnModPunctuations.add('\u1817');
        zvvnModPunctuations.add('\u1818');
        zvvnModPunctuations.add('\u1819');


        zvvnModPunctuations.add('\u2048');
        zvvnModPunctuations.add('\u2049');
        zvvnModPunctuations.add('\u0021');
        zvvnModPunctuations.add('\u003f');
        zvvnModPunctuations.add('\u003b');
        zvvnModPunctuations.add('\u0028');
        zvvnModPunctuations.add('\u0029');
        zvvnModPunctuations.add('\u3008');
        zvvnModPunctuations.add('\u3009');
        zvvnModPunctuations.add('\u3014');
        zvvnModPunctuations.add('\u3015');
        zvvnModPunctuations.add('\u300a');
        zvvnModPunctuations.add('\u300b');
        zvvnModPunctuations.add('\u300e');
        zvvnModPunctuations.add('\u300f');
        zvvnModPunctuations.add('\u002c');
        zvvnModPunctuations.add('\u00d7');
        zvvnModPunctuations.add('\u203b');
        zvvnModPunctuations.add('\u002d');
        zvvnModPunctuations.add('\u007c');
    }

    private static void buildToZ52Punctuations() {
//        toZ52Punctuations.add('\u00b7');
        toZ52Punctuations.add('\u2048');
        toZ52Punctuations.add('\u2049');
        toZ52Punctuations.add('\u0021');
        toZ52Punctuations.add('\u003f');
//        toZ52Punctuations.add('\u003b');
//        toZ52Punctuations.add('\u0028');
//        toZ52Punctuations.add('\u0029');
//        toZ52Punctuations.add('\u3008');
//        toZ52Punctuations.add('\u3009');
//        toZ52Punctuations.add('\u3014');
//        toZ52Punctuations.add('\u3015');
//        toZ52Punctuations.add('\u300a');
//        toZ52Punctuations.add('\u300b');
//        toZ52Punctuations.add('\u300e');
//        toZ52Punctuations.add('\u300f');
//        toZ52Punctuations.add('\u002c');
//        toZ52Punctuations.add('\u00d7');
//        toZ52Punctuations.add('\u203b');
//        toZ52Punctuations.add('\u002d');
//        toZ52Punctuations.add('\u007c');
    }
}
