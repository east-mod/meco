package com.zvvnmod.meco.translate.shape.from.menk;

import com.zvvnmod.meco.translate.word.CodeMapper;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/31
 * WEEK  : 周一
 * TIME  : 01:43
 */
public class FromMenkCodeMapper {
    public static CodeMapper codeMapper;

    static {
        build();
    }

    public static void build() {
        codeMapper.put("\ue264", "\ue000\ue00c");
        codeMapper.put("\ue265", "\ue000\ue00d");
        codeMapper.put("\ue266", "\ue000\ue005");
        codeMapper.put("\ue267", "\ue000");
        codeMapper.put("\ue268", "\ue00c");

    }
}
