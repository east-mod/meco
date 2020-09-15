package com.zvvnmod.meco.translate.letter.to;

import com.zvvnmod.meco.translate.word.ShapeWord;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/22
 * WEEK  : 周六
 * TIME  : 12:05
 */
public interface LetterTranslateRuleTo {

    void getMapperCode(StringBuilder builder, ShapeWord zvvnModWord);

    boolean contains(String s);

    boolean isTranslateCodePoint(char c);

}
