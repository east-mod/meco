package com.zvvnmod.meco.translate.word;

import java.util.HashSet;
import java.util.Set;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/9/17
 * WEEK  : 周四
 * TIME  : 13:49
 */
public class Z52UnicodeBlock {
    public static final Set<Character> z52Codes = new HashSet<>(256);
    public static final Set<Character> z52CodePunctuations = new HashSet<>(64);

    static {
        build();
        buildZ52CodePunctuations();
    }

    private static void build() {
        z52Codes.add('\u1865');
        z52Codes.add('\u1866');
        z52Codes.add('\u1867');
        z52Codes.add('\u1868');

        z52Codes.add('\u186a');
        z52Codes.add('\u186b');
        z52Codes.add('\u186c');
        z52Codes.add('\u186d');
        z52Codes.add('\u186e');
        z52Codes.add('\u186f');
        z52Codes.add('\u1870');
        z52Codes.add('\u1871');
        z52Codes.add('\u1872');
        z52Codes.add('\u1873');
        z52Codes.add('\u1874');
        z52Codes.add('\u1875');
        z52Codes.add('\u1876');
        z52Codes.add('\u1877');
        z52Codes.add('\u1878');

        z52Codes.add('\u1887');
        z52Codes.add('\u1888');
        z52Codes.add('\u1889');
        z52Codes.add('\u188a');
        z52Codes.add('\u188b');
        z52Codes.add('\u188c');
        z52Codes.add('\u188d');
        z52Codes.add('\u188e');
        z52Codes.add('\u188f');
        z52Codes.add('\u1890');
        z52Codes.add('\u1891');

        z52Codes.add('\u1893');
        z52Codes.add('\u1894');

        z52Codes.add('\u1896');
        z52Codes.add('\u1897');
        z52Codes.add('\u1898');
        z52Codes.add('\u1899');
        z52Codes.add('\u189a');
        z52Codes.add('\u189b');
        z52Codes.add('\u189c');
        z52Codes.add('\u189d');
        z52Codes.add('\u189e');
        z52Codes.add('\u189f');
        z52Codes.add('\u18a0');
        z52Codes.add('\u18a1');
        z52Codes.add('\u18a2');
        z52Codes.add('\u18a3');
        z52Codes.add('\u18a4');
        z52Codes.add('\u18a5');
        z52Codes.add('\u18a6');
        z52Codes.add('\u18a7');
        z52Codes.add('\u18a8');

        z52Codes.add('\u18aa');

    }

    private static void buildZ52CodePunctuations() {
        z52CodePunctuations.add('\u184f');
        z52CodePunctuations.add('\u1850');
        z52CodePunctuations.add('\u1851');
        z52CodePunctuations.add('\u1852');
        z52CodePunctuations.add('\u1853');
        z52CodePunctuations.add('\u1854');
        z52CodePunctuations.add('\u1855');
        z52CodePunctuations.add('\u1856');
        z52CodePunctuations.add('\u1857');
        z52CodePunctuations.add('\u1858');
        z52CodePunctuations.add('\u1859');
        z52CodePunctuations.add('\u185a');
        z52CodePunctuations.add('\u185b');
        z52CodePunctuations.add('\u185c');
        z52CodePunctuations.add('\u185d');
        z52CodePunctuations.add('\u185e');
        z52CodePunctuations.add('\u185f');
        z52CodePunctuations.add('\u1860');
        z52CodePunctuations.add('\u1861');
        z52CodePunctuations.add('\u1862');
        z52CodePunctuations.add('\u1863');
    }
}
