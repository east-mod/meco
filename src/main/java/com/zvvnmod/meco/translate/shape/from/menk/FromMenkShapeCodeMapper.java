package com.zvvnmod.meco.translate.shape.from.menk;

import com.zvvnmod.meco.translate.word.CodeMapper;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/31
 * WEEK  : 周一
 * TIME  : 01:43
 */
public class FromMenkShapeCodeMapper {
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
        codeMapper.put("\ue269", "\ue00d");
        codeMapper.put("\ue26a", "\ue00d");
        codeMapper.put("\ue26b", "\ue005\ue00d");

        codeMapper.put("\ue26c", "\ue005");
        codeMapper.put("\ue26d", "\ue005");
        codeMapper.put("\ue26e", "\ue005\ue005");
        codeMapper.put("\ue26f", "\ue005");
        codeMapper.put("\ue270", "\ue000\ue00d");
        codeMapper.put("\ue271", "\ue000");
        codeMapper.put("\ue272", "\ue000\ue005");
        codeMapper.put("\ue273", "\ue00c");

        codeMapper.put("\ue274", "\ue00d");
        codeMapper.put("\ue275", "\ue005\ue00d");
        codeMapper.put("\ue276", "\ue005");
        codeMapper.put("\ue277", "\ue005");
        codeMapper.put("\ue278", "\ue005");
        codeMapper.put("\ue279", "\ue005");

    }
}
