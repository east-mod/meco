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
    private static final String shud = "\u186a";
    private static final String shelb = "\u186c";
    private static final String gedes = "\u186d";
    private static final String orogshilga = "\u1868";

    static {
        codeMapper.combine(buildBase());
        codeMapper.combine(buildN());
        codeMapper.combine(buildB());
    }

    public static Map<String, String> buildBase() {
        Map<String, String> map = new HashMap<>(64);
        putAll(map, "\u1865", "\ue000");

        // TODO: 2020/9/16  
        putAll(map, "\u1866", "\u1866");


        putAll(map, "\u1867", "\ue00c");
        putAll(map, orogshilga, "\ue00d");
        putAll(map, "\u186a", "\ue005");
        putAll(map, "\u186b", "\ue00e");

        //shelb
        map.put("\u0020" + shelb, "\ue04d");
        map.put(shelb, "\ue006");
        map.put(shelb + "\u0020", "\ue006");
        map.put("\u0020" + shelb + "\u0020", "\ue04d");

        //gedes
        map.put("\u0020" + gedes, "\ue001");
        map.put(gedes, "\ue008");
        map.put(gedes + "\u0020", "\ue008");
        map.put("\u0020" + gedes + "\u0020", "\ue001");

        // TODO: 2020/9/16
        putAll(map, "\u186e", "");

        return map;
    }

    public static Map<String, String> buildN() {
        Map<String, String> n = new HashMap<>(32);
        putAll(n, "\u186f", "\ue027");
        putAll(n, "\u1870", "\ue077");
        putAll(n, "\u1870\u1868", "\ue077");
        putAll(n, "\u1871", "\ue028");
        return n;
    }

    public static Map<String, String> buildB() {
        Map<String, String> b = new HashMap<>(32);
        //b1
        String b1 = "\u1873";
        b.put(b1, "\ue02a");
        b.put("\u0020" + b1, "\ue029");
        b.put(b1 + "\u0020", "\ue029");
        b.put("\u0020" + b1 + "\u0020", "\ue029");
        //b2
        String b2 = "\u1874";
        b.put(b2, "\ue02a");
        b.put("\u0020" + b2, "\ue029");
        b.put(b2 + "\u0020", "\ue029");
        b.put("\u0020" + b2 + "\u0020", "\ue029");

        //head,middle ba,be
        String b1Shud = b1 + shud;
        b.put("\u0020" + b1Shud, "\ue07c");
        b.put(b1Shud, "\ue07d");
        b.put("\u0020" + b1Shud + "\u0020", "\ue07c");
        b.put(b1Shud + "\u0020", "\ue07d");

        return b;
    }

    private static void putAll(Map<String, String> map, String s, String mapperString) {
        map.put("\u0020" + s, mapperString);
        map.put(s, mapperString);
        map.put(s + "\u0020", mapperString);
        map.put("\u0020" + s + "\u0020", mapperString);
    }
}
