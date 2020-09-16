package com.zvvnmod.meco.translate.shape.from.z52;

import com.zvvnmod.meco.translate.word.CodeMapper;

import java.util.HashMap;
import java.util.Map;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/9/15
 * WEEK  : 周二
 * TIME  : 21:24
 */
public class FromZ52CodeMapper {
    private static final CodeMapper codeMapper = new CodeMapper(1024);

    static {
        codeMapper.combine(buildCodeMapper());
    }

    public static Map<String, String> buildCodeMapper() {
        Map<String, String> map = new HashMap<>(1024);
        putAll(map, "\u1865", "\ue000");

        putAll(map, "\u1866", "\u1866");

        putAll(map, "\u1867", "\ue00c");
        putAll(map, "\u1868", "\ue00d");
        putAll(map, "\u186a", "\ue005");
        putAll(map, "\u186b", "\ue00e");

        putAll(map, "\u186c", "\ue006");

        return map;
    }

    private static void putAll(Map<String, String> map, String s, String mapperString) {
        map.put("\u0020" + s, mapperString);
        map.put(s, mapperString);
        map.put(s + "\u0020", mapperString);
        map.put("\u0020" + s + "\u0020", mapperString);
    }
}
