package com.zvvnmod.meco.translate.domain;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 19:33
 */
public interface TranslateRule {
    CodeMapper getCodesMapper();

    boolean isMongolianCodePoint(char c);
}
