package com.zvvnmod.meco.rule.to.delehi;

import com.zvvnmod.meco.translate.domain.CodeMapper;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/17
 * WEEK  : 周一
 * TIME  : 10:54
 */
public class ToDelehiCodeMapper {
    public static CodeMapper mapper = new CodeMapper(1024);

    static {
        buildMapper();
    }

    private static void buildMapper() {
        mapper.put("\ue000", "\u1821");
        mapper.put("\ue000\ue005", "\u1820");
        mapper.put("\ue000\ue006", "\u1822");
        mapper.put("\ue000\ue008", "\u1823");
        mapper.put("\ue000\ue00c", "\u1820");
        mapper.put("\ue000\ue00d", "\u1821");
        mapper.put("\ue000\ue00e", "\u1822");
        mapper.put("\ue000\ue00f", "\u1823");
        mapper.put("\ue000\ue010", "\u1826");
        mapper.put("\ue000\ue011", "\u1826\u180b");

        mapper.put("\ue001\ue008\ue00c", "\u0020\u202f\u1824\u1833\u0020");
        mapper.put("\ue001\ue00c", "\u202f\u1826\u1828\u0020");
        mapper.put("\ue001\ue011", "\u202f\u1824\u1824");
        mapper.put("\ue002\ue006", "\u202f\u1836\u180b\u1822");
        mapper.put("", "");
    }

}
