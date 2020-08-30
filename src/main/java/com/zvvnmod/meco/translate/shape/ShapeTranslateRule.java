package com.zvvnmod.meco.translate.shape;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/27
 * WEEK  : 周四
 * TIME  : 09:12
 */
public interface ShapeTranslateRule {
    boolean isTranslateCodePoint(char c);

    boolean contains(String s);

    String getMapperCode(String s);
}
