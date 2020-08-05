package com.zvvnmod.meco.testing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/7/13
 * WEEK  : Mon
 * TIME  : 21:51
 */
public class Testing {
    private static final Logger logger = LoggerFactory.getLogger(Testing.class);

    public static void main(String[] args) {
        String str = "我的天空多么的美丽.";
        String a4 = "\uDB80\uDC00";
        logger.info(a4);
        logger.info(String.valueOf(a4.length()));
        System.out.println(0xdb80);
        System.out.println(0xdc00);
        char cha = '\uDB80';

        char[] chars = Character.toChars(0xf0000);
        for (char aChar : chars) {
            System.out.print((int) aChar);
            System.out.print(":");
            System.out.print(Character.isHighSurrogate(aChar));
            System.out.print(",");
            System.out.println(Character.isLowSurrogate(aChar));
        }
    }
}
