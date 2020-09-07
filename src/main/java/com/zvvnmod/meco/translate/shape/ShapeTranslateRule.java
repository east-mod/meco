package com.zvvnmod.meco.translate.shape;

import com.zvvnmod.meco.translate.letter.from.CharType;
import com.zvvnmod.meco.translate.word.ShapeWordFragment;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/27
 * WEEK  : 周四
 * TIME  : 09:12
 */
public interface ShapeTranslateRule {
    boolean isTranslateCodePoint(char c);

    boolean contains(ShapeWordFragment wordFragment);

    String getMapperCode(ShapeWordFragment wordFragment);

    CharType getCharType(char ch);
}
