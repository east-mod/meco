package com.zvvnmod.meco.translate.letter.from;

import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 19:33
 */
public interface TranslateRule {
    String getMapperCode(List<Character> pre, String s, Nature nature);

    boolean contains(String s);

    Nature getCodeNature(char c);

    boolean isTranslateCodePoint(char c);

    boolean isMongolianCodePoint(char c);
}
