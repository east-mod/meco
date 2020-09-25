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
    public static final CodeMapper codeMapper = new CodeMapper(1024);
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
        codeMapper.combine(buildTR());
        codeMapper.combine(buildJ());
        codeMapper.combine(buildY());
        codeMapper.combine(buildR());
        codeMapper.combine(buildW());
        codeMapper.combine(buildF());
        codeMapper.combine(buildK());
        codeMapper.combine(buildTS());
        codeMapper.combine(buildZ());
        codeMapper.combine(buildHH());
        codeMapper.combine(buildRH());
        codeMapper.combine(buildPunctuations());
    }

    private static Map<String, String> buildBase() {
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

    private static Map<String, String> buildN() {
        Map<String, String> n = new HashMap<>(32);
        putAll(n, "\u186f", "\ue027");
        putAll(n, "\u1870", "\ue077");
        putAll(n, "\u1870\u1868", "\ue077");
        putAll(n, "\u1871", "\ue028");
        return n;
    }

    private static Map<String, String> buildB() {
        Map<String, String> b = new HashMap<>(64);
        //b1
        String b1 = "\u1873";
        b.put(b1, "\ue02a");
        b.put(b1 + "\u0020", "\ue011");
        b.put("\u0020" + b1, "\ue029");
        b.put("\u0020" + b1 + "\u0020", "\ue01b");
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

    private static Map<String, String> buildP() {
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

    private static Map<String, String> buildHG() {
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

    private static Map<String, String> buildM() {
        Map<String, String> m = new HashMap<>(16);
        putAll(m, "\u188c", "\ue036");
        putAll(m, "\u188d", "\ue038");
        putAll(m, "\u188e", "\ue037");
        return m;
    }

    private static Map<String, String> buildL() {
        Map<String, String> l = new HashMap<>(16);
        putAll(l, "\u188f", "\ue039");
        putAll(l, "\u1890", "\ue03b");
        putAll(l, "\u1891", "\ue03a");
        return l;
    }

    private static Map<String, String> buildS() {
        Map<String, String> s = new HashMap<>(16);
        putAll(s, "\u1893", "\ue03e");
        s.put("\u0020" + "\u1894", "\ue03c");
        s.put("\u1894", "\ue03d");
        s.put("\u1894" + "\u0020", "\ue03d");
        s.put("\u0020" + "\u1894" + "\u0020", "\ue03c");
        return s;
    }

    private static Map<String, String> buildSH() {
        Map<String, String> sh = new HashMap<>(16);
        putAll(sh, "\u1896", "\ue041");
        sh.put("\u0020" + "\u1897", "\ue03f");
        sh.put("\u1897", "\ue040");
        sh.put("\u1897" + "\u0020", "\ue040");
        sh.put("\u0020" + "\u1897" + "\u0020", "\ue03f");
        return sh;
    }

    private static Map<String, String> buildTD() {
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

    private static Map<String, String> buildTR() {
        Map<String, String> tr = new HashMap<>(16);
        String tr1 = "\u189a";
        tr.put("\u0020" + tr1, "\ue04a");
        tr.put(tr1, "\ue04b");
        tr.put(tr1 + "\u0020", "\ue04b");
        tr.put("\u0020" + tr1 + "\u0020", "\ue04a");

        String trGiiOhorCuul = tr1 + ohorCuul;
        putAll(tr, trGiiOhorCuul, "\ue04c");

        return tr;
    }

    private static Map<String, String> buildJ() {
        Map<String, String> j = new HashMap<>(16);
        String j1 = "\u189b";
        putAll(j, j1, "\ue04e");
        String j1OhorCuul = j1 + ohorCuul;
        putAll(j, j1OhorCuul, "\ue04f");
        return j;
    }

    private static Map<String, String> buildY() {
        Map<String, String> y = new HashMap<>(8);
        String y1 = "\u189c";
        y.put("\u0020" + y1, "\ue050");
        y.put(y1, "\ue051");
        y.put(y1 + "\u0020", "\ue051");
        y.put("\u0020" + y1 + "\u0020", "\ue050");
        return y;
    }

    private static Map<String, String> buildR() {
        Map<String, String> r = new HashMap<>(16);
        String r1 = "\u189e";
        r.put("\u0020" + r1, "\ue053");
        r.put(r1, "\ue054");
        r.put(r1 + "\u0020", "\ue054");
        r.put("\u0020" + r1 + "\u0020", "\ue053");

        String r2 = "\u189d";
        putAll(r, r2, "\ue055");
        return r;
    }

    private static Map<String, String> buildW() {
        Map<String, String> w = new HashMap<>(16);
        String w1 = "\u189f";
        w.put("\u0020" + w1, "\ue056");
        w.put(w1, "\ue057");
        w.put(w1 + "\u0020", "\ue057");
        w.put("\u0020" + w1 + "\u0020", "\ue056");

        String w1OhorCuul = w1 + ohorCuul;
        putAll(w, w1OhorCuul, "\ue058");
        return w;
    }

    private static Map<String, String> buildF() {
        Map<String, String> f = new HashMap<>(64);
        //f1
        String f1 = "\u18a1";
        f.put("\u0020" + f1, "\ue059");
        f.put(f1, "\ue05a");
        f.put(f1 + "\u0020", "\ue05a");
        f.put("\u0020" + f1 + "\u0020", "\ue059");
        //f2
        String f2 = "\u18a2";
        f.put("\u0020" + f2, "\ue059");
        f.put(f2, "\ue05a");
        f.put(f2 + "\u0020", "\ue05a");
        f.put("\u0020" + f2 + "\u0020", "\ue059");
        //f tail
        putAll(f, "\u18a0", "\ue05b");

        //head,middle fa,fe
        String f1Shud = f1 + shud;
        f.put("\u0020" + f1Shud, "\ue0a2");
        f.put(f1Shud, "\ue0a3");
        f.put("\u0020" + f1Shud + "\u0020", "\ue0a2");
        f.put(f1Shud + "\u0020", "\ue0a3");
        //fo
        String f2Gedes = f2 + gedes;
        f.put("\u0020" + f2Gedes, "\ue0a8");
        f.put(f2Gedes, "\ue0a9");
        f.put(f2Gedes + "\u0020", "\ue0aa");
        f.put("\u0020" + f2Gedes + "\u0020", "\ue0a0");
        //fu
        String f2GedesOhorCuul = f2Gedes + ohorCuul;
        f.put("\u0020" + f2GedesOhorCuul, "\ue0a1");
        f.put(f2GedesOhorCuul, "\ue0d0");
        f.put(f2GedesOhorCuul + "\u0020", "\ue0d0");
        f.put("\u0020" + f2GedesOhorCuul + "\u0020", "\ue0a1");
        //middle,top fi
        String f1Shelb = f1 + shelb;
        f.put("\u0020" + f1Shelb, "\ue0a5");
        f.put(f1Shelb, "\ue0a6");
        f.put(f1Shelb + "\u0020", "\ue0a6");
        f.put("\u0020" + f1Shelb + "\u0020", "\ue0a5");
        //bi,tail fi
        String f1ShelbOhorCuul = f1Shelb + ohorCuul;
        f.put("\u0020" + f1ShelbOhorCuul, "\ue09f");
        f.put(f1ShelbOhorCuul, "\ue0a7");
        f.put(f1ShelbOhorCuul + "\u0020", "\ue0a7");
        f.put("\u0020" + f1ShelbOhorCuul + "\u0020", "\ue09f");
        return f;
    }

    private static Map<String, String> buildK() {
        Map<String, String> k = new HashMap<>(64);
        String k1 = "\u18a4";
        k.put("\u0020" + k1, "\ue05c");
        k.put(k1, "\ue05d");
        k.put(k1 + "\u0020", "\ue05d");
        k.put("\u0020" + k1 + "\u0020", "\ue05c");

        String k2 = "\u18a5";
        k.put("\u0020" + k2, "\ue05c");
        k.put(k2, "\ue05d");
        k.put(k2 + "\u0020", "\ue05d");
        k.put("\u0020" + k2 + "\u0020", "\ue05c");

        String k3 = "\u18a3";
        putAll(k, k3, "\ue05e");

        //top,middle ka,ke
        String k1Shud = k1 + shud;
        k.put("\u0020" + k1Shud, "\ue0b0");
        k.put(k1Shud, "\ue0b1");
        k.put(k1Shud + "\u0020", "\ue0b1");
        k.put("\u0020" + k1Shud + "\u0020", "\ue0b0");

        //top,middle ki
        String k1Shelb = k1 + shelb;
        k.put("\u0020" + k1Shelb, "\ue0b6");
        k.put(k1Shelb, "\ue0b7");
        k.put(k1Shelb + "\u0020", "\ue0b7");
        k.put("\u0020" + k1Shelb + "\u0020", "\ue0b6");

        //ki,tail ki
        String k1ShelbOhorCuul = k1Shelb + ohorCuul;
        k.put("\u0020" + k1ShelbOhorCuul, "\ue0ad");
        k.put(k1ShelbOhorCuul, "\ue0b8");
        k.put(k1ShelbOhorCuul + "\u0020", "\ue0b8");
        k.put("\u0020" + k1ShelbOhorCuul + "\u0020", "\ue0ad");

        //ko
        String k2Gedes = k2 + gedes;
        k.put("\u0020" + k2Gedes, "\ue0b9");
        k.put(k2Gedes, "\ue0ba");
        k.put(k2Gedes + "\u0020", "\ue0bb");
        k.put("\u0020" + k2Gedes + "\u0020", "\ue0ae");

        //ku,tail2 ku
        String k2GedesOhorCuul = k2Gedes + ohorCuul;
        k.put("\u0020" + k2GedesOhorCuul, "\ue0af");
        k.put(k2GedesOhorCuul, "\ue0bc");
        k.put(k2GedesOhorCuul + "\u0020", "\ue0bc");
        k.put("\u0020" + k2GedesOhorCuul + "\u0020", "\ue0af");

        return k;
    }

    private static Map<String, String> buildTS() {
        Map<String, String> ts = new HashMap<>(16);

        String ts1 = "\u18a6";
        ts.put("\u0020" + ts1, "\ue05f");
        ts.put(ts1, "\ue060");
        ts.put(ts1 + "\u0020", "\ue060");
        ts.put("\u0020" + ts1 + "\u0020", "\ue05f");

        String ts1OhorCuul = ts1 + ohorCuul;
        putAll(ts, ts1OhorCuul, "\ue061");
        return ts;
    }

    private static Map<String, String> buildZ() {
        Map<String, String> z = new HashMap<>(16);

        String z1 = "\u18a7";
        z.put("\u0020" + z1, "\ue062");
        z.put(z1, "\ue063");
        z.put(z1 + "\u0020", "\ue063");
        z.put("\u0020" + z1 + "\u0020", "\ue062");

        String z1OhorCuul = z1 + ohorCuul;
        putAll(z, z1OhorCuul, "\ue064");

        return z;
    }

    private static Map<String, String> buildHH() {
        Map<String, String> hh = new HashMap<>(16);
        String hh1 = "\u18a8";
        putAll(hh, hh1, "\ue066");

        String hh1OhorCuul = hh1 + ohorCuul;
        putAll(hh, hh1OhorCuul, "\ue067");

        return hh;
    }

    private static Map<String, String> buildRH() {
        Map<String, String> rh = new HashMap<>(16);

        String rh1 = "\u18aa";
        putAll(rh, rh1, "\ue068");

        return rh;
    }

    private static Map<String, String> buildPunctuations() {
        Map<String, String> punctuations = new HashMap<>(512);

        putAll(punctuations, "\u184f", "\u00b7");
        putAll(punctuations, "\u1850", "\u2048");
        putAll(punctuations, "\u1851", "\u2049");
        putAll(punctuations, "\u1852", "\u0021");
        putAll(punctuations, "\u1853", "\u003f");
        putAll(punctuations, "\u1854", "\u003b");
        putAll(punctuations, "\u1855", "\u0028");
        putAll(punctuations, "\u1856", "\u0029");
        putAll(punctuations, "\u1857", "\u3008");
        putAll(punctuations, "\u1858", "\u3009");
        putAll(punctuations, "\u1859", "\u3014");
        putAll(punctuations, "\u185a", "\u3015");
        putAll(punctuations, "\u185b", "\u300a");
        putAll(punctuations, "\u185c", "\u300b");
        putAll(punctuations, "\u185d", "\u300e");
        putAll(punctuations, "\u185e", "\u300f");
        putAll(punctuations, "\u185f", "\u002c");
        putAll(punctuations, "\u1860", "\u00d7");
        putAll(punctuations, "\u1861", "\u203b");
        putAll(punctuations, "\u1862", "\u002d");
        putAll(punctuations, "\u1863", "\u007c");

        return punctuations;
    }

    private static void putAll(Map<String, String> map, String s, String mapperString) {
        map.put("\u0020" + s, mapperString);
        map.put(s, mapperString);
        map.put(s + "\u0020", mapperString);
        map.put("\u0020" + s + "\u0020", mapperString);
    }
}
