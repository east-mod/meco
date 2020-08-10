package com.zvvnmod.meco.tranformer;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 19:33
 */
public interface TransformRule {
    CodeMapper getCodeMapper();

    boolean isTransferableCode();
}
