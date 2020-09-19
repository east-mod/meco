package com.zvvnmod.meco.translate.letter.from;

import com.zvvnmod.meco.translate.word.Nature;

import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 19:33
 */
public interface LetterTranslateRuleFrom {
    String getMapperCode(List<Character> pre, List<Character> suf, String s, Nature nature);

    boolean contains(String s);

    Nature getCodeNature(char c);

    boolean isTranslateCodePoint(char c);

    boolean isWordCodePoint(char c);
}
