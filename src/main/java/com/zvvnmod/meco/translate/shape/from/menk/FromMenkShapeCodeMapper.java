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
        codeMapper = new CodeMapper(1024);
        codeMapper.put("\u0020\ue264\u0020", "\ue000\ue00c");
        codeMapper.put("\u0020\ue265\u0020", "\ue000\ue00d");
        codeMapper.put("\u0020\ue266", "\ue000\ue005");
        codeMapper.put("\u0020\ue267", "\ue000");
        codeMapper.put("\ue268\u0020", "\ue00c");
        codeMapper.put("\ue269\u0020", "\ue00d");
        codeMapper.put("\ue26a\u0020", "\ue00d");
        codeMapper.put("\ue26b\u0020", "\ue005\ue00d");

        codeMapper.put("\ue26c", "\ue005");
        codeMapper.put("\ue26d", "\ue005");
        codeMapper.put("\ue26e", "\ue005\ue005");
        codeMapper.put("\ue26f", "\ue005");
        codeMapper.put("\u0020\ue270\u0020", "\ue000\ue00d");
        codeMapper.put("\u0020\ue271", "\ue000");
        codeMapper.put("\u0020\ue272", "\ue000\ue005");
        codeMapper.put("\ue273\u0020", "\ue00c");

        codeMapper.put("\ue274\u0020", "\ue00d");
        codeMapper.put("\ue275\u0020", "\ue005\ue00d");
        codeMapper.put("\ue276", "\ue005");
        codeMapper.put("\ue277", "\ue005");
        codeMapper.put("\ue278", "\ue005");
        codeMapper.put("\u0020\ue279\u0020", "\ue005");
        codeMapper.put("\u0020\ue27a", "\ue000\ue006");
        codeMapper.put("\ue27b\u0020", "\ue00e");

        //bi
        codeMapper.put("\u0020\ue2c5\ue27c\u0020", "\ue079");
        codeMapper.put("\u0020\ue2c1\ue27c\u0020", "\ue079");
        //tail bi
        codeMapper.put("\ue2c5\ue27c\u0020", "\ue081");
        codeMapper.put("\ue2c1\ue27c\u0020", "\ue081");
        //pi
        codeMapper.put("\u0020\ue2c8\ue27c\u0020", "\ue086");
        //codeMapper.put("\u0020\ue2cb\ue27c\u0020", "\ue086");
        //tail pi
        codeMapper.put("\ue2cb\ue27c\u0020", "\ue081");
        //codeMapper.put("\ue2c8\ue27c\u0020", "\ue081");

        //hi,gi
        codeMapper.put("\u0020\ue2d0\ue27c\u0020", "\ue092");
        //codeMapper.put("\u0020\ue2da\ue27c\u0020", "\ue092");
        //hi,gi tail
        codeMapper.put("\ue2da\ue27c\u0020", "\ue099");

        //fi
        codeMapper.put("\u0020\ue32d\ue27c\u0020", "\ue09f");
        //codeMapper.put("\u0020\ue330\ue27c\u0020", "\ue09f");
        //tail fi
        //codeMapper.put("\ue32d\ue27c\u0020", "\ue0a7");
        codeMapper.put("\ue330\ue27c\u0020", "\ue0a7");

        codeMapper.put("\ue27e", "\ue006");
        codeMapper.put("\ue27f", "\ue006");
        codeMapper.put("\ue281", "\ue006\ue006");
        codeMapper.put("\u0020\ue282\u0020", "\ue01a");

        //o
        codeMapper.put("\u0020\ue28b\u0020", "\ue000\ue00f");
        codeMapper.put("\u0020\ue283\u0020", "\ue000\ue00f");
        //top1 o
        codeMapper.put("\u0020\ue284", "\ue000\ue008");
        codeMapper.put("\u0020\ue28c", "\ue000\ue008");
        //top2 o
        codeMapper.put("\u0020\uE291", "\ue001");
        codeMapper.put("\u0020\uE2AB", "\ue001");
        //middle o
        codeMapper.put("\ue291", "\ue008");
        codeMapper.put("\ue2ab", "\ue008");
        //tail o
        codeMapper.put("\ue28d\u0020", "\ue011");
        codeMapper.put("\ue296\u0020", "\ue011");
        codeMapper.put("\ue2a3\u0020", "\ue011");
        //dagbvr nu
        codeMapper.put("\u0020\ue285\u0020", "\ue01b");


        codeMapper.put("", "");
        //top h \ue2d0


        //b
        codeMapper.put("\u0020\ue2c5", "\ue029");
        codeMapper.put("\ue2c5", "\ue02a");
        codeMapper.put("\ue2c5\u0020", "\ue02b");

        //bi
        codeMapper.put("\ue2c5\ue27c", "\ue079");
        //hi
        codeMapper.put("", "");

        //head b4o,b5o
        codeMapper.put("\ue2c2\ue292", "\ue082");

        //head h
        codeMapper.put("\ue2ce", "\ue02f");

        //middle m
        codeMapper.put("\ue2f4", "\ue037");


        //tail l
        codeMapper.put("\ue2f9", "\ue03b");

        //top o
        codeMapper.put("\ue2ab", "");

        codeMapper.put("\ue2b5", "\ue00c");
        codeMapper.put("\ue2bd", "\ue015");
        codeMapper.put("\ue2d6", "\ue032");

    }
}
