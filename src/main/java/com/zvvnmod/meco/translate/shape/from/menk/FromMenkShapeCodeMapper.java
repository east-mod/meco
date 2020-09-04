package com.zvvnmod.meco.translate.shape.from.menk;

import com.google.common.collect.Lists;
import com.zvvnmod.meco.translate.word.CodeMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/31
 * WEEK  : 周一
 * TIME  : 01:43
 */
public class FromMenkShapeCodeMapper {
    public static CodeMapper codeMapper;
    private static final List<String> shudList = Lists.newArrayList("\ue26c", "\ue26f",
            "\ue276", "\ue277", "\ue278", "\ue2b8", "\ue2ba", "\ue2c0", "\ue26d");

    private static final List<String> cycleTailUList = Lists.newArrayList("\ue298", "\ue2a5");

    private static final List<String> cycleTailGedesList = Lists.newArrayList("\ue287",
            "\ue28f", "\ue29a", "\ue2a7");

    private static final List<String> cycleNoTailGedesList = Lists.newArrayList("\ue28a",
            "\ue292", "\ue29f", "\ue2ac");

    private static final List<String> cycleGedesForU = Lists.newArrayList("\ue29d", "\ue2aa");

    private static final List<String> shelbList = Lists.newArrayList("\ue27e", "\ue280");

    private static final String cycleShelb = "\ue27f";

    private static final List<String> tsatslagaList = Lists.newArrayList("\ue269",
            "\ue26a", "\ue274");

    private static final List<String> doubleShudList = Lists.newArrayList("\ue26e", "\ue2d8",
            "\ue2dc", "\ue2ee");

    private static final List<String> cycleTsatslagaList = Lists.newArrayList("\ue26b", "\ue275");

    static {
        build();
        codeMapper.combine(buildTailI());
        codeMapper.combine(buildEng());
        codeMapper.combine(buildShud());
        codeMapper.combine(buildDoubleShud());
        codeMapper.combine(buildN());
        codeMapper.combine(buildB());
        codeMapper.combine(buildP());
        codeMapper.combine(buildHG());
        codeMapper.combine(buildM());
        codeMapper.combine(buildL());
        codeMapper.combine(buildF());
        codeMapper.combine(buildS());
        codeMapper.combine(buildSH());
        codeMapper.combine(buildTD());
        codeMapper.combine(buildTR());
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

        codeMapper.put("\u0020\ue270\u0020", "\ue000\ue00d");
        codeMapper.put("\u0020\ue271", "\ue000");
        codeMapper.put("\u0020\ue272", "\ue000\ue005");
        codeMapper.put("\ue273\u0020", "\ue00c");

        codeMapper.put("\ue274\u0020", "\ue00d");
        codeMapper.put("\ue275\u0020", "\ue005\ue00d");
        codeMapper.put("\u0020\ue279\u0020", "\ue005");
        codeMapper.put("\u0020\ue27a", "\ue000\ue006");

        codeMapper.put("\ue27d", "\ue005\ue006");

        codeMapper.put("\ue27e", "\ue006");
        codeMapper.put("\ue27f", "\ue006");
        codeMapper.put("\ue281", "\ue006\ue006");
        codeMapper.put("\u0020\ue282\u0020", "\ue01a");

        //o
        codeMapper.put("\u0020\ue28b\u0020", "\ue000\ue00f");
        codeMapper.put("\u0020\ue283\u0020", "\ue000\ue00f");
        //head1 o
        codeMapper.put("\u0020\ue284", "\ue000\ue008");
        codeMapper.put("\u0020\ue28c", "\ue000\ue008");
        //head2 o
        codeMapper.put("\u0020\uE291", "\ue001");
        codeMapper.put("\u0020\uE2AB", "\ue001");
        //u
        codeMapper.put("\u0020\ue293\u0020", "\ue000\ue010");
        codeMapper.put("\u0020\ue2a0\u0020", "\ue000\ue010");
        //head1 u
        codeMapper.put("\u0020\ue295", "\ue000\ue008\ue006");
        codeMapper.put("\u0020\ue2a2", "\ue000\ue008\ue006");
        //middle o,u
        codeMapper.put("\ue289", "\ue008");
        codeMapper.put("\ue29e", "\ue008");
        codeMapper.put("\ue291", "\ue008");
        codeMapper.put("\ue2ab", "\ue008");
        //middle o
        codeMapper.put("\ue288", "\ue005\ue008");
        codeMapper.put("\ue290", "\ue005\ue008");
        //middle u
        codeMapper.put("\ue29c", "\ue008\ue006");
        codeMapper.put("\ue2a9", "\ue008\ue006");
        //middle u
        codeMapper.put("\ue29b", "\ue005\ue008\ue006");
        codeMapper.put("\ue2a8", "\ue005\ue008\ue006");
        //tail1 o,u
        codeMapper.put("\ue285\u0020", "\ue011");
        codeMapper.put("\ue28d\u0020", "\ue011");
        codeMapper.put("\ue296\u0020", "\ue011");
        codeMapper.put("\ue2a3\u0020", "\ue011");
        codeMapper.put("\ue32b\u0020", "\ue011");
        //tail2 u
        codeMapper.put("\u0020\ue297", "\ue010");
        codeMapper.put("\u0020\ue2a4", "\ue010");
        //tail3 o,u
        codeMapper.put("\ue286\u0020", "\ue00f");
        codeMapper.put("\ue28e\u0020", "\ue00f");
        codeMapper.put("\ue299\u0020", "\ue00f");
        codeMapper.put("\ue2a6\u0020", "\ue00f");
        //dagbvr nu
        codeMapper.put("\u0020\ue285\u0020", "\ue01b");
        codeMapper.put("\u0020\ue28d\u0020", "\ue01b");
        codeMapper.put("\u0020\ue296\u0020", "\ue01b");
        codeMapper.put("\u0020\ue2a3\u0020", "\ue01b");
        codeMapper.put("\u0020\ue32b\u0020", "\ue01b");
        //eu
        codeMapper.put("\u0020\ue294\u0020", "\ue000\ue011");
        codeMapper.put("\u0020\ue2a1\u0020", "\ue000\ue011");

        //ee
        codeMapper.put("\u0020\ue2ad\u0020", "\ue000\ue058");
        codeMapper.put("\u0020\ue2ae", "\ue000\ue057");
        codeMapper.put("\ue2af\u0020", "\ue058");
        codeMapper.put("\ue2b0", "\ue057");
    }

    private static Map<String, String> buildTailI() {
        Map<String, String> i = new HashMap<>(64);
        List<String> tailI = Lists.newArrayList("\ue27b", "\ue31c", "\ue31f");
        tailI.forEach(item -> buildLocateChar(i, item, "\ue00e"));
        return i;
    }

    private static Map<String, String> buildEng() {
        Map<String, String> eng = new HashMap<>(64);
        buildLocateChar(eng, "\ue2bb\u0020", "\ue005\ue006");
        buildLocateChar(eng, "\ue2bc", "\ue015");
        buildLocateChar(eng, "\ue2bd", "\ue015");
        buildLocateChar(eng, "\ue2be", "\ue015");
        return eng;
    }

    private static Map<String, String> buildShud() {
        Map<String, String> shud = new HashMap<>(64);
        shudList.forEach(item -> buildLocateChar(shud, item, "\ue005"));
        return shud;
    }

    private static Map<String, String> buildDoubleShud() {
        Map<String, String> doubleShud = new HashMap<>(64);
        doubleShudList.forEach(item -> buildLocateChar(doubleShud, item, "\ue005\ue005"));
        return doubleShud;
    }

    private static Map<String, String> buildN() {
        Map<String, String> n = new HashMap<>(16);
        n.put("\u0020\ue2b1", "\ue027");
        n.put("\u0020\ue2b2", "\ue000");
        n.put("\u0020\ue2b3", "\ue027");
        n.put("\u0020\ue2b4", "\ue000");
        n.put("\ue2b5", "\ue00c");
        n.put("\ue2b5\u0020", "\ue00c");
        n.put("\ue2b6", "\ue077");
        n.put("\ue2b6\ue274\u0020", "\ue077");
        n.put("\ue2b6\ue269\u0020", "\ue077");
        n.put("\ue2b6\ue26a\u0020", "\ue077");
        n.put("\ue2b7", "\ue028");
        n.put("\ue2b9", "\ue028");
        n.put("\ue2bf", "\ue028");
        return n;
    }

    private static Map<String, String> buildB() {
        Map<String, String> b = new HashMap<>(64);
        //top,middle b with a,e,i
        List<String> b1 = Lists.newArrayList("\ue2c1", "\ue2c5");
        //top,middle b with o,u
        List<String> b2 = Lists.newArrayList("\ue2c2", "\ue2c6");
        //b1,b2
        b1.forEach(item -> {
            b.put(item, "\ue02a");
            b.put("\u0020" + item, "\ue029");
            b.put(item + "\u0020", "\ue029");
            b.put("\u0020" + item + "\u0020", "\ue029");
        });
        b2.forEach(item -> {
            b.put(item, "\ue02a");
            b.put("\u0020" + item, "\ue029");
            b.put(item + "\u0020", "\ue029");
            b.put("\u0020" + item + "\u0020", "\ue029");
        });
        //head,middle ba,be
        b1.forEach(item -> {
            for (String shud : shudList) {
                b.put("\u0020" + item + shud, "\ue07c");
                b.put(item + shud, "\ue07d");
                b.put("\u0020" + item + shud + "\u0020", "\ue07c");
                b.put(item + shud + "\u0020", "\ue07d");
            }
        });
        //ba,be tail ba,be
        b1.forEach(item -> {
            for (String s : cycleTsatslagaList) {
                b.put("\u0020" + item + s, "\ue078");
                b.put(item + s, "\ue07e");
                b.put("\u0020" + item + s + "\u0020", "\ue078");
                b.put(item + s + "\u0020", "\ue07e");
            }
        });
        //bu
        b2.forEach(item -> {
            for (String cycleTailU : cycleTailUList) {
                b.put("\u0020" + item + cycleTailU, "\ue07b");
                b.put(item + cycleTailU, "\ue07b");
                b.put("\u0020" + item + cycleTailU + "\u0020", "\ue07b");
                b.put(item + cycleTailU + "\u0020", "\ue07b");
            }
        });
        //bo,tail bo,bu
        b2.forEach(item -> {
            for (String s : cycleTailGedesList) {
                b.put("\u0020" + item + s, "\ue07a");
                b.put(item + s, "\ue084");
                b.put(item + s + "\u0020", "\ue084");
                b.put("\u0020" + item + s + "\u0020", "\ue07a");
            }
        });
        //head bo,middle bo,bu
        b2.forEach(item -> {
            for (String s : cycleNoTailGedesList) {
                b.put("\u0020" + item + s, "\ue082");
                b.put(item + s, "\ue083");
                b.put(item + s + "\u0020", "\ue083");
                b.put("\u0020" + item + s + "\u0020", "\ue082");
            }
        });
        //head bu
        b2.forEach(item -> {
            for (String s : cycleGedesForU) {
                b.put("\u0020" + item + s, "\ue082\ue006");
                b.put(item + s, "\ue082\ue006");
                b.put(item + s + "\u0020", "\ue082\ue006");
                b.put("\u0020" + item + s + "\u0020", "\ue082\ue006");
            }
        });
        //bi,tail bi
        b1.forEach(item -> {
            b.put("\u0020" + item + "\ue27c", "\ue079");
            b.put(item + "\ue27c", "\ue081");
            b.put(item + "\ue27c\u0020", "\ue081");
            b.put("\u0020" + item + "\ue27c" + "\u0020", "\ue079");
        });
        //top,middle bi
        b1.forEach(item -> {
            for (String s : shelbList) {
                b.put("\u0020" + item + s, "\ue07f");
                b.put(item + s, "\ue080");
                b.put(item + s + "\u0020", "\ue080");
                b.put("\u0020" + item + s + "\u0020", "\ue07f");
            }
            b.put("\u0020" + item + cycleShelb, "\ue07f");
            b.put(item + cycleShelb, "\ue080");
            b.put(item + cycleShelb + "\u0020", "\ue080");
            b.put("\u0020" + item + cycleShelb + "\u0020", "\ue07f");
        });
        //b
        b.put("\u0020\ue2c7", "\ue029");
        b.put("\ue2c7", "\ue02a");
        b.put("\ue2c7\u0020", "\ue02a");
        b.put("\u0020\ue2c7\u0020", "\ue029");
        //b
        buildLocateChar(b, "\ue2c3", "\ue02b");
        return b;
    }

    private static Map<String, String> buildP() {
        Map<String, String> p = new HashMap<>(64);
        //top,middle p with a,e,i
        List<String> p1 = Lists.newArrayList("\ue2c8", "\ue2cb");
        //top,middle p with o,u
        List<String> p2 = Lists.newArrayList("\ue2cc", "\ue2c9");
        //p1,p2
        p1.forEach(item -> {
            p.put(item, "\ue02d");
            p.put("\u0020" + item, "\ue02c");
            p.put(item + "\u0020", "\ue02c");
            p.put("\u0020" + item + "\u0020", "\ue02c");
        });
        p2.forEach(item -> {
            p.put(item, "\ue02d");
            p.put("\u0020" + item, "\ue02c");
            p.put(item + "\u0020", "\ue02c");
            p.put("\u0020" + item + "\u0020", "\ue02c");
        });
        //head,middle pa,pe
        p1.forEach(item -> {
            for (String shud : shudList) {
                p.put("\u0020" + item + shud, "\ue089");
                p.put(item + shud, "\ue08a");
                p.put("\u0020" + item + shud + "\u0020", "\ue089");
                p.put(item + shud + "\u0020", "\ue08a");
            }
        });
        //pa,pe tail pa,pe
        p1.forEach(item -> {
            for (String s : cycleTsatslagaList) {
                p.put("\u0020" + item + s, "\ue085");
                p.put(item + s, "\ue08b");
                p.put("\u0020" + item + s + "\u0020", "\ue085");
                p.put(item + s + "\u0020", "\ue08b");
            }
        });
        //pu
        p2.forEach(item -> {
            for (String cycleTailU : cycleTailUList) {
                p.put("\u0020" + item + cycleTailU, "\ue088");
                p.put(item + cycleTailU, "\ue088");
                p.put("\u0020" + item + cycleTailU + "\u0020", "\ue088");
                p.put(item + cycleTailU + "\u0020", "\ue088");
            }
        });
        //po,tail po,pu
        p2.forEach(item -> {
            for (String s : cycleTailGedesList) {
                p.put("\u0020" + item + s, "\ue087");
                p.put(item + s, "\ue091");
                p.put(item + s + "\u0020", "\ue091");
                p.put("\u0020" + item + s + "\u0020", "\ue087");
            }
        });
        //head po,middle po,pu
        p2.forEach(item -> {
            for (String s : cycleNoTailGedesList) {
                p.put("\u0020" + item + s, "\ue08f");
                p.put(item + s, "\ue090");
                p.put(item + s + "\u0020", "\ue090");
                p.put("\u0020" + item + s + "\u0020", "\ue08f");
            }
        });
        //head pu
        p2.forEach(item -> {
            for (String s : cycleGedesForU) {
                p.put("\u0020" + item + s, "\ue082\ue006");
                p.put(item + s, "\ue082\ue006");
                p.put(item + s + "\u0020", "\ue082\ue006");
                p.put("\u0020" + item + s + "\u0020", "\ue082\ue006");
            }
        });
        //pi,tail pi
        p1.forEach(item -> {
            p.put("\u0020" + item + "\ue27c", "\ue086");
            p.put(item + "\ue27c", "\ue08e");
            p.put(item + "\ue27c\u0020", "\ue08e");
            p.put("\u0020" + item + "\ue27c" + "\u0020", "\ue086");
        });
        //top,middle pi
        p1.forEach(item -> {
            for (String s : shelbList) {
                p.put("\u0020" + item + s, "\ue08c");
                p.put(item + s, "\ue08d");
                p.put(item + s + "\u0020", "\ue08d");
                p.put("\u0020" + item + s + "\u0020", "\ue08c");
            }
            p.put("\u0020" + item + cycleShelb, "\ue08c");
            p.put(item + cycleShelb, "\ue08d");
            p.put(item + cycleShelb + "\u0020", "\ue08d");
            p.put("\u0020" + item + cycleShelb + "\u0020", "\ue08c");
        });
        //p
        p.put("\u0020\ue2c7", "\ue02c");
        p.put("\ue2c7", "\ue02d");
        p.put("\ue2c7\u0020", "\ue02d");
        p.put("\u0020\ue2c7\u0020", "\ue02c");
        //p
        buildLocateChar(p, "\ue2c3", "\ue02e");
        return p;
    }

    private static Map<String, String> buildHG() {
        Map<String, String> hg = new HashMap<>(64);
        //head1 h
        List<String> headGiiH1 = Lists.newArrayList("\ue2ce", "\ue2d2", "\ue2e2", "\ue2e5");
        headGiiH1.forEach(item -> buildLocateChar(hg, item, "\ue02f"));
        //head1 g
        List<String> headGiiG1 = Lists.newArrayList("\ue2cf", "\ue2d3", "\ue2e1", "\ue2e4");
        headGiiG1.forEach(item -> buildLocateChar(hg, item, "\ue034"));
        //tail h,ha
        List<String> tailGiiH = Lists.newArrayList("\ue2d6", "\ue2e7");
        tailGiiH.forEach(item -> buildLocateChar(hg, item, "\ue032"));
        tailGiiH.forEach(item -> {
            for (String s : tsatslagaList) {
                buildLocateChar(hg, item + s, "\ue032\ue00d");
            }
        });
        //tail g,ga
        List<String> tailGiiG = Lists.newArrayList("\ue2d7", "\ue2e9");
        tailGiiG.forEach(item -> buildLocateChar(hg, item, "\ue09d"));
        tailGiiG.forEach(item -> {
            for (String s : tsatslagaList) {
                buildLocateChar(hg, item + s, "\ue09d");
            }
        });
        //tail2 h
        buildLocateChar(hg, "\ue2e8", "\ue033");
        //middle ga
        List<String> middleGa = Lists.newArrayList("\ue2d9", "\ue2ea", "\ue2ec");
        middleGa.forEach(item -> buildLocateChar(hg, item, "\ue035"));

        List<String> h1 = Lists.newArrayList("\ue2d0", "\ue2e3", "\ue2da", "\ue2eb");
        List<String> h2 = Lists.newArrayList("\ue2d4", "\ue2e6", "\ue2ed", "\ue2dd");
        //head,middle he,ge
        h1.forEach(item -> {
            for (String shud : shudList) {
                hg.put("\u0020" + item + shud, "\ue094");
                hg.put(item + shud, "\ue095");
                hg.put("\u0020" + item + shud + "\u0020", "\ue094");
                hg.put(item + shud + "\u0020", "\ue095");
            }
        });
        //he,ge tail ha,ge
        h1.forEach(item -> {
            for (String s : cycleTsatslagaList) {
                hg.put("\u0020" + item + s, "\ue094\ue00d");
                hg.put(item + s, "\ue095\ue00d");
                hg.put("\u0020" + item + s + "\u0020", "\ue094\ue00d");
                hg.put(item + s + "\u0020", "\ue095\ue00d");
            }
        });
        //hu
        h2.forEach(item -> {
            for (String cycleTailU : cycleTailUList) {
                buildLocateChar(hg, item + cycleTailU, "\ue093");
            }
        });
        //tail bu
        h2.forEach(item -> {
            for (String s : cycleTailGedesList) {
                hg.put("\u0020" + item + s, "\ue09c");
                hg.put(item + s, "\ue09b");
                hg.put(item + s + "\u0020", "\ue09c");
                hg.put("\u0020" + item + s + "\u0020", "\ue09c");
            }
        });
        //head hu,middle hu
        h2.forEach(item -> {
            for (String s : cycleNoTailGedesList) {
                hg.put("\u0020" + item + s, "\ue09b");
                hg.put(item + s, "\ue09b");
                hg.put(item + s + "\u0020", "\ue09b");
                hg.put("\u0020" + item + s + "\u0020", "\ue09b");
            }
        });
        //head hu
        h2.forEach(item -> {
            for (String s : cycleGedesForU) {
                hg.put("\u0020" + item + s, "\ue09a");
                hg.put(item + s, "\ue09a");
                hg.put(item + s + "\u0020", "\ue09a");
                hg.put("\u0020" + item + s + "\u0020", "\ue09a");
            }
        });
        //hi,gi,tail hi,gi
        h1.forEach(item -> {
            hg.put("\u0020" + item + "\ue27c", "\ue092");
            hg.put(item + "\ue27c", "\ue099");
            hg.put(item + "\ue27c\u0020", "\ue099");
            hg.put("\u0020" + item + "\ue27c" + "\u0020", "\ue092");
        });
        //top,middle hi,gi
        h1.forEach(item -> {
            for (String s : shelbList) {
                hg.put("\u0020" + item + s, "\ue097");
                hg.put(item + s, "\ue098");
                hg.put(item + s + "\u0020", "\ue098");
                hg.put("\u0020" + item + s + "\u0020", "\ue097");
            }
            hg.put("\u0020" + item + cycleShelb, "\ue097");
            hg.put(item + cycleShelb, "\ue098");
            hg.put(item + cycleShelb + "\u0020", "\ue098");
            hg.put("\u0020" + item + cycleShelb + "\u0020", "\ue097");
        });
        //h,g
        buildLocateChar(hg, "\ue2df", "\ue031");
        buildLocateChar(hg, "\ue2f0", "\ue031");
        buildLocateChar(hg, "\ue2ef", "\ue031");
        return hg;
    }

    private static Map<String, String> buildM() {
        Map<String, String> m = new HashMap<>(64);
        buildLocateChar(m, "\ue2f1", "\ue036");
        buildLocateChar(m, "\ue2f2", "\ue036");
        buildLocateChar(m, "\ue2f3", "\ue038");
        tsatslagaList.forEach(item -> buildLocateChar(m, "\ue2f3" + item, "\ue038\ue00d"));
        buildLocateChar(m, "\ue2f4", "\ue037");
        buildLocateChar(m, "\ue2f5", "\ue037");
        buildLocateChar(m, "\ue2f6", "\ue037");
        return m;
    }

    private static Map<String, String> buildL() {
        Map<String, String> L = new HashMap<>(64);
        buildLocateChar(L, "\ue2f7", "\ue039");
        buildLocateChar(L, "\ue2f8", "\ue039");
        buildLocateChar(L, "\ue2f9", "\ue03b");
        tsatslagaList.forEach(item -> buildLocateChar(L, "\ue2f9" + item, "\ue03b\ue00d"));
        buildLocateChar(L, "\ue2fa", "\ue03a");
        buildLocateChar(L, "\ue2fb", "\ue03a");
        buildLocateChar(L, "\ue2fc", "\ue03a");
        return L;
    }

    private static Map<String, String> buildS() {
        Map<String, String> s = new HashMap<>(64);
        buildLocateChar(s, "\ue2fd", "\ue03c");
        buildLocateChar(s, "\ue2fe", "\ue03c");
        buildLocateChar(s, "\ue301", "\ue03d");
        buildLocateChar(s, "\ue302", "\ue03d");
        buildLocateChar(s, "\ue2ff", "\ue03e");
        return s;
    }

    private static Map<String, String> buildSH() {
        Map<String, String> sh = new HashMap<>(64);
        buildLocateChar(sh, "\ue303", "\ue03f");
        buildLocateChar(sh, "\ue304", "\ue03f");
        buildLocateChar(sh, "\ue306", "\ue040");
        buildLocateChar(sh, "\ue307", "\ue040");
        buildLocateChar(sh, "\ue305", "\ue041");
        return sh;
    }

    private static Map<String, String> buildTD() {
        Map<String, String> td = new HashMap<>(64);
        List<String> topTList = Lists.newArrayList("\ue308", "\ue309", "\ue30e", "\ue30f");
        topTList.forEach(item -> buildLocateChar(td, item, "\ue042"));
        List<String> middleTList = Lists.newArrayList("\ue30c", "\ue30d");
        middleTList.forEach(item -> buildLocateChar(td, item, "\ue043"));
        buildLocateChar(td, "\ue30a", "\ue044");
        List<String> dList = Lists.newArrayList("\ue30b", "\ue310", "\ue313");
        dList.forEach(item -> {
            td.put("\u0020" + item, "\ue045");
            td.put(item, "\ue046");
            td.put(item + "\u0020", "\ue046");
            td.put("\u0020" + item + "\u0020", "\ue045");
        });
        td.put("\u0020\uE311", "\ue001\ue00c");
        td.put("\uE311", "\ue008\ue00c");
        td.put("\uE311\u0020", "\ue008\ue00c");
        td.put("\u0020\uE311\u0020", "\ue001\ue00c");

        buildLocateChar(td, "\uE312", "\ue049");

        td.put("\u0020\uE314", "\ue001\ue005");
        td.put("\uE314", "\ue008\ue005");
        td.put("\uE314\u0020", "\ue008\ue005");
        td.put("\u0020\uE314\u0020", "\ue001\ue005");
        return td;
    }

    private static Map<String, String> buildTR() {
        Map<String, String> tr = new HashMap<>(64);
        buildLocateChar(tr, "\ue315", "\ue04a");
        buildLocateChar(tr, "\ue317", "\ue04b");
        buildLocateChar(tr, "\ue316", "\ue04c");
        return tr;
    }

    private static Map<String, String> buildJ() {
        Map<String, String> j = new HashMap<>(64);
        return j;
    }

    private static Map<String, String> buildY() {
        Map<String, String> y = new HashMap<>(64);
        return y;
    }

    private static Map<String, String> buildR() {
        Map<String, String> r = new HashMap<>(64);
        return r;
    }

    private static Map<String, String> buildW() {
        Map<String, String> w = new HashMap<>(64);
        return w;
    }

    private static Map<String, String> buildF() {
        Map<String, String> f = new HashMap<>(64);
        //fi
        f.put("\u0020\ue32d\ue27c\u0020", "\ue09f");
        f.put("\u0020\ue330\ue27c\u0020", "\ue09f");
        //tail fi
        f.put("\ue330\ue27c\u0020", "\ue0a7");
        f.put("\ue32d\ue27c\u0020", "\ue0a7");
        return f;
    }

    private static Map<String, String> buildK() {
        Map<String, String> k = new HashMap<>(64);
        return k;
    }

    private static Map<String, String> buildTS() {
        Map<String, String> ts = new HashMap<>(64);
        return ts;
    }

    private static Map<String, String> buildZ() {
        Map<String, String> z = new HashMap<>(64);
        return z;
    }

    private static Map<String, String> buildHH() {
        Map<String, String> hh = new HashMap<>(64);
        return hh;
    }

    private static Map<String, String> buildRH() {
        Map<String, String> rh = new HashMap<>(64);
        return rh;
    }

    private static void buildLocateChar(Map<String, String> map, String s, String mapperString) {
        map.put("\u0020" + s, mapperString);
        map.put(s, mapperString);
        map.put(s + "\u0020", mapperString);
        map.put("\u0020" + s + "\u0020", mapperString);
    }
}
