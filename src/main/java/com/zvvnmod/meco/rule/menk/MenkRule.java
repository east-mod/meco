package com.zvvnmod.meco.rule.menk;

import com.zvvnmod.meco.tranformer.CodeMapper;
import com.zvvnmod.meco.tranformer.TransformRule;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 19:32
 */
public class MenkRule implements TransformRule {
    @Override
    public CodeMapper getCodeMapper() {
        return null;
    }

    @Override
    public boolean isTransferableCode() {
        return false;
    }
}
