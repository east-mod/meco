package com.zvvnmod.meco.rule.oyun;

import com.zvvnmod.meco.translate.domain.CodeMapper;
import com.zvvnmod.meco.translate.domain.TranslateRule;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/11
 * WEEK  : Tue
 * TIME  : 01:56
 */
public class OyunRule implements TranslateRule {
    @Override
    public CodeMapper getCodesMapper() {
        return null;
    }

    @Override
    public boolean isMongolianCodePoint(char c) {
        return false;
    }
}
