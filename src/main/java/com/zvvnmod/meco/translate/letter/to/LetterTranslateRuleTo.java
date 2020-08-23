package com.zvvnmod.meco.translate.letter.to;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/22
 * WEEK  : 周六
 * TIME  : 12:05
 */
public interface LetterTranslateRuleTo {

    String getMapperCode(String preLetterCodes, String s);

    boolean contains(String s);

    boolean isTranslateCodePoint(char c);

}
