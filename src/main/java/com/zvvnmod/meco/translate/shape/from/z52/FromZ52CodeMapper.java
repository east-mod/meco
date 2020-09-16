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
    private static final String ohorCuul = "\u1866";

    static {
        codeMapper.combine(buildBase());
        codeMapper.combine(buildN());
        codeMapper.combine(buildB());
        codeMapper.combine(buildP());
        codeMapper.combine(buildHG());
        codeMapper.combine(buildM());
        codeMapper.combine(buildL());
        codeMapper.combine(buildS());
        codeMapper.combine(buildSH());
        codeMapper.combine(buildTD());
    }

    public static Map<String, String> buildBase() {
        Map<String, String> map = new HashMap<>(64);
        putAll(map, "\u1865", "\ue000");

        // TODO: 2020/9/16  
        putAll(map, ohorCuul, ohorCuul);

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
        Map<String, String> b = new HashMap<>(64);
        //b1
        String b1 = "\u1873";
        b.put(b1, "\ue02a");
        b.put(b1 + "\u0020", "\ue029");
        b.put("\u0020" + b1, "\ue029");
        b.put("\u0020" + b1 + "\u0020", "\ue029");
        //b2
        String b2 = "\u1874";
        b.put(b2, "\ue02a");
        b.put("\u0020" + b2, "\ue029");
        b.put(b2 + "\u0020", "\ue029");
        b.put("\u0020" + b2 + "\u0020", "\ue029");
        //b tail
        putAll(b, "\u1872", "\ue02b");

        //head,middle ba,be
        String b1Shud = b1 + shud;
        b.put("\u0020" + b1Shud, "\ue07c");
        b.put(b1Shud, "\ue07d");
        b.put("\u0020" + b1Shud + "\u0020", "\ue07c");
        b.put(b1Shud + "\u0020", "\ue07d");
        //bo
        String b2Gedes = b2 + gedes;
        b.put("\u0020" + b2Gedes, "\ue082");
        b.put(b2Gedes, "\ue083");
        b.put(b2Gedes + "\u0020", "\ue084");
        b.put("\u0020" + b2Gedes + "\u0020", "\ue07a");
        //bu
        String b2GedesOhorCuul = b2Gedes + ohorCuul;
        b.put("\u0020" + b2GedesOhorCuul, "\ue07b");
        b.put(b2GedesOhorCuul, "\ue0cd");
        b.put(b2GedesOhorCuul + "\u0020", "\ue0cd");
        b.put("\u0020" + b2GedesOhorCuul + "\u0020", "\ue07b");
        //middle,top bi
        String b1Shelb = b1 + shelb;
        b.put("\u0020" + b1Shelb, "\ue07f");
        b.put(b1Shelb, "\ue080");
        b.put(b1Shelb + "\u0020", "\ue080");
        b.put("\u0020" + b1Shelb + "\u0020", "\ue07f");
        //bi,tail bi
        String b1ShelbOhorCuul = b1Shelb + ohorCuul;
        b.put("\u0020" + b1ShelbOhorCuul, "\ue079");
        b.put(b1ShelbOhorCuul, "\ue081");
        b.put(b1ShelbOhorCuul + "\u0020", "\ue081");
        b.put("\u0020" + b1ShelbOhorCuul + "\u0020", "\ue079");
        return b;
    }

    public static Map<String, String> buildP() {
        Map<String, String> p = new HashMap<>(64);
        //b1
        String p1 = "\u1876";
        p.put(p1, "\ue02d");
        p.put(p1 + "\u0020", "\ue02c");
        p.put("\u0020" + p1, "\ue02c");
        p.put("\u0020" + p1 + "\u0020", "\ue02c");
        //p2
        String p2 = "\u1877";
        p.put(p2, "\ue02d");
        p.put("\u0020" + p2, "\ue02c");
        p.put(p2 + "\u0020", "\ue02c");
        p.put("\u0020" + p2 + "\u0020", "\ue02c");
        //p tail
        putAll(p, "\u1875", "\ue02e");

        //head,middle pa,pe
        String b1Shud = p1 + shud;
        p.put("\u0020" + b1Shud, "\ue089");
        p.put(b1Shud, "\ue08a");
        p.put("\u0020" + b1Shud + "\u0020", "\ue089");
        p.put(b1Shud + "\u0020", "\ue08a");
        //po
        String b2Gedes = p2 + gedes;
        p.put("\u0020" + b2Gedes, "\ue08f");
        p.put(b2Gedes, "\ue090");
        p.put(b2Gedes + "\u0020", "\ue091");
        p.put("\u0020" + b2Gedes + "\u0020", "\ue087");
        //pu
        String b2GedesOhorCuul = b2Gedes + ohorCuul;
        p.put("\u0020" + b2GedesOhorCuul, "\ue088");
        p.put(b2GedesOhorCuul, "\ue0ce");
        p.put(b2GedesOhorCuul + "\u0020", "\ue0ce");
        p.put("\u0020" + b2GedesOhorCuul + "\u0020", "\ue088");
        //middle,top pi
        String b1Shelb = p1 + shelb;
        p.put("\u0020" + b1Shelb, "\ue08c");
        p.put(b1Shelb, "\ue08d");
        p.put(b1Shelb + "\u0020", "\ue08d");
        p.put("\u0020" + b1Shelb + "\u0020", "\ue08c");
        //bi,tail pi
        String b1ShelbOhorCuul = b1Shelb + ohorCuul;
        p.put("\u0020" + b1ShelbOhorCuul, "\ue086");
        p.put(b1ShelbOhorCuul, "\ue08e");
        p.put(b1ShelbOhorCuul + "\u0020", "\ue08e");
        p.put("\u0020" + b1ShelbOhorCuul + "\u0020", "\ue086");
        return p;
    }

    public static Map<String, String> buildHG() {
        Map<String, String> hg = new HashMap<>(64);
        putAll(hg, "\u1878", "\ue02f");
        putAll(hg, "\u1887", "\ue032");
        putAll(hg, "\u1888", "\ue034");
        putAll(hg, "\u1889", "\ue09d");
        putAll(hg, "\u1889" + orogshilga, "\ue09d");
        //hg1,hg2
        String hg1 = "\u188a";
        hg.put("\u0020" + hg1, "\ue030");
        hg.put(hg1, "\ue031");
        hg.put(hg1 + "\u0020", "\ue031");
        hg.put("\u0020" + hg1 + "\u0020", "\ue030");
        String hg2 = "\u188b";
        hg.put("\u0020" + hg2, "\ue030");
        hg.put(hg2, "\ue031");
        hg.put(hg2 + "\u0020", "\ue031");
        hg.put("\u0020" + hg2 + "\u0020", "\ue030");
        //top,middle he
        String hg1Shud = hg1 + shud;
        hg.put("\u0020" + hg1Shud, "\ue094");
        hg.put(hg1Shud, "\ue095");
        hg.put(hg1Shud + "\u0020", "\ue095");
        hg.put("\u0020" + hg1Shud + "\u0020", "\ue094");
        //top,middle hi
        String hg1Shelb = hg1 + shelb;
        hg.put("\u0020" + hg1Shelb, "\ue097");
        hg.put(hg1Shelb, "\ue098");
        hg.put(hg1Shelb + "\u0020", "\ue098");
        hg.put("\u0020" + hg1Shelb + "\u0020", "\ue097");
        //hi,tail hi
        String hg1ShelbOhorCuul = hg1Shelb + ohorCuul;
        hg.put("\u0020" + hg1ShelbOhorCuul, "\ue092");
        hg.put(hg1ShelbOhorCuul, "\ue099");
        hg.put(hg1ShelbOhorCuul + "\u0020", "\ue099");
        hg.put("\u0020" + hg1ShelbOhorCuul + "\u0020", "\ue092");
        //middle,tail hu
        String hg2Gedes = hg2 + gedes;
        hg.put("\u0020" + hg2Gedes, "\ue09b");
        hg.put(hg2Gedes, "\ue09b");
        hg.put(hg2Gedes + "\u0020", "\ue09c");
        hg.put("\u0020" + hg2Gedes + "\u0020", "\ue09c");
        //hu,tail2 hu
        String hg2GedesOhorCuul = hg2Gedes + ohorCuul;
        hg.put("\u0020" + hg2GedesOhorCuul, "\ue093");
        hg.put(hg2GedesOhorCuul, "\ue0cf");
        hg.put(hg2GedesOhorCuul + "\u0020", "\ue0cf");
        hg.put("\u0020" + hg2GedesOhorCuul + "\u0020", "\ue093");
        //top hu
        String hg2GedesShelb = hg2Gedes + shelb;
        hg.put("\u0020" + hg2GedesShelb, "\ue09a");
        hg.put(hg2GedesShelb, "\ue09a");
        hg.put(hg2GedesShelb + "\ue09a", "\ue09a");
        hg.put("\u0020" + hg2GedesShelb + "\u0020", "\ue09a");

        return hg;
    }

    public static Map<String, String> buildM() {
        Map<String, String> m = new HashMap<>(8);
        putAll(m, "\u188c", "\ue036");
        putAll(m, "\u188d", "\ue038");
        putAll(m, "\u188e", "\ue037");
        return m;
    }

    public static Map<String, String> buildL() {
        Map<String, String> l = new HashMap<>(8);
        putAll(l, "\u188f", "\ue039");
        putAll(l, "\u1890", "\ue03b");
        putAll(l, "\u1891", "\ue03a");
        return l;
    }

    public static Map<String, String> buildS() {
        Map<String, String> s = new HashMap<>(8);
        putAll(s, "\u1893", "\ue03e");
        s.put("\u0020" + "\u1894", "\ue03c");
        s.put("\u1894", "\ue03d");
        s.put("\u1894" + "\u0020", "\ue03d");
        s.put("\u0020" + "\u1894" + "\u0020", "\ue03c");
        return s;
    }

    public static Map<String, String> buildSH() {
        Map<String, String> sh = new HashMap<>(8);
        putAll(sh, "\u1896", "\ue041");
        sh.put("\u0020" + "\u1897", "\ue03f");
        sh.put("\u1897", "\ue040");
        sh.put("\u1897" + "\u0020", "\ue040");
        sh.put("\u0020" + "\u1897" + "\u0020", "\ue03f");
        return sh;
    }

    public static Map<String, String> buildTD() {
        Map<String, String> td = new HashMap<>(32);
        String t = "\u1898";
        td.put("\u0020" + t, "\ue042");
        td.put(t, "\ue043");
        td.put(t + "\u0020", "\ue043");
        td.put("\u0020" + t + "\u0020", "\ue042");

        String tOhorCuul = t + ohorCuul;
        putAll(td, tOhorCuul, "\ue044");

        String d = "\u1899";
        td.put("\u0020" + d, "\ue045");
        td.put(d, "\ue046");
        td.put(d + "\u0020", "\ue046");
        td.put("\u0020" + d + "\u0020", "\ue045");

        String dOhorCuul = d + ohorCuul;
        putAll(td, dOhorCuul, "\ue049");
        return td;
    }

    public static Map<String, String> buildTR() {
        Map<String, String> tr = new HashMap<>(8);

        return tr;
    }

    private static void putAll(Map<String, String> map, String s, String mapperString) {
        map.put("\u0020" + s, mapperString);
        map.put(s, mapperString);
        map.put(s + "\u0020", mapperString);
        map.put("\u0020" + s + "\u0020", mapperString);
    }
}
