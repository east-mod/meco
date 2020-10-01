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

    private static final List<String> shelbList = Lists.newArrayList("\ue27e", "\ue280", "\ue321");

    private static final String cycleShelb = "\ue27f";

    private static final List<String> tsatslagaList = Lists.newArrayList("\ue269",
            "\ue26a", "\ue274");

    private static final List<String> doubleShudList = Lists.newArrayList("\ue26e", "\ue2d8",
            "\ue2dc", "\ue2ee");

    private static final List<String> cycleTsatslagaList = Lists.newArrayList("\ue26b", "\ue275");

    static {
        codeMapper = new CodeMapper(4096);
        codeMapper.combine(buildBase());
        codeMapper.combine(buildTailI());
        codeMapper.combine(buildEng());
        codeMapper.combine(buildShud());
        codeMapper.combine(buildDoubleShud());
        codeMapper.combine(buildShelb());
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
        codeMapper.combine(buildKH());
        codeMapper.combine(buildTS());
        codeMapper.combine(buildZ());
        codeMapper.combine(buildHH());
        codeMapper.combine(buildRH());
        codeMapper.combine(buildOthers());
        codeMapper.combine(buildPunctuations());
    }

    private static Map<String, String> buildBase() {
        Map<String, String> base = new HashMap<>(1024);
        buildLocateChar(base, "\ue264", "\ue000\ue00c");
        buildLocateChar(base, "\ue265", "\ue000\ue00d");
        buildLocateChar(base, "\ue266", "\ue000\ue005");

        List<String> likeEHead = Lists.newArrayList("\ue267", "\ue271", "\ue2b2", "\ue2b4");
        likeEHead.forEach(item -> buildLocateChar(base, item, "\ue000"));

        List<String> likeTailN = Lists.newArrayList("\ue268", "\ue2b5", "\ue273");
        likeTailN.forEach(item -> buildLocateChar(base, item, "\ue00c"));

        buildLocateChar(base, "\ue269", "\ue00d");
        buildLocateChar(base, "\ue26a", "\ue00d");
        buildLocateChar(base, "\ue26b", "\ue005\ue00d");

        buildLocateChar(base, "\ue270", "\ue000\ue00d");
        buildLocateChar(base, "\ue272", "\ue000\ue005");

        buildLocateChar(base, "\ue274", "\ue00d");
        buildLocateChar(base, "\ue275", "\ue005\ue00d");
        buildLocateChar(base, "\ue279", "\ue005");
        buildLocateChar(base, "\ue27a", "\ue000\ue006");

        buildLocateChar(base, "\ue27d", "\ue005\ue006");

        buildLocateChar(base, "\ue281", "\ue006\ue006");
        buildLocateChar(base, "\ue282", "\ue01a");

        //o
        buildLocateChar(base, "\ue28b", "\ue000\ue00f");
        buildLocateChar(base, "\ue283", "\ue000\ue00f");
        //head1 o
        buildLocateChar(base, "\ue284", "\ue000\ue008");
        buildLocateChar(base, "\ue28c", "\ue000\ue008");

        List<String> niruTaiGedes = Lists.newArrayList("\ue289", "\ue291", "\ue29e", "\ue2ab");
        niruTaiGedes.forEach(item -> {
            base.put("\u0020" + item, "\ue001");
            base.put(item, "\ue008");
            base.put(item + "\u0020", "\ue008");
            base.put("\u0020" + item + "\u0020", "\ue001");
        });

        //u
        buildLocateChar(base, "\ue293", "\ue000\ue010");
        buildLocateChar(base, "\ue2a0", "\ue000\ue010");
        //head1 u
        buildLocateChar(base, "\ue295", "\ue000\ue008\ue006");
        buildLocateChar(base, "\ue2a2", "\ue000\ue008\ue006");

        //middle o
        buildLocateChar(base, "\ue288", "\ue005\ue008");
        buildLocateChar(base, "\ue290", "\ue005\ue008");
        //middle u
        buildLocateChar(base, "\ue29c", "\ue008\ue006");
        buildLocateChar(base, "\ue2a9", "\ue008\ue006");
        //middle u
        buildLocateChar(base, "\ue29b", "\ue005\ue008\ue006");
        buildLocateChar(base, "\ue2a8", "\ue005\ue008\ue006");

        List<String> s10 = Lists.newArrayList("\ue285", "\ue28d", "\ue296", "\ue2a3", "\ue32b");
        s10.forEach(item -> {
            //tail1 o,u,
            base.put(item + "\u0020", "\ue011");
            base.put(item, "\ue011");
            //dagbvr nu
            base.put("\u0020" + item, "\ue01b");
            base.put("\u0020" + item + "\u0020", "\ue01b");
        });

        //tail2 u
        buildLocateChar(base, "\ue297", "\ue010");
        buildLocateChar(base, "\ue2a4", "\ue010");
        //tail3 o,u
        buildLocateChar(base, "\ue286", "\ue00f");
        buildLocateChar(base, "\ue28e", "\ue00f");
        buildLocateChar(base, "\ue299", "\ue00f");
        buildLocateChar(base, "\ue2a6", "\ue00f");
        //eu
        buildLocateChar(base, "\ue294", "\ue000\ue011");
        buildLocateChar(base, "\ue2a1", "\ue000\ue011");

        //ee
        buildLocateChar(base, "\ue2ad", "\ue000\ue058");
        buildLocateChar(base, "\ue2ae", "\ue000\ue057");
        buildLocateChar(base, "\ue2af", "\ue058");
        buildLocateChar(base, "\ue2b0", "\ue057");
        return base;
    }

    private static Map<String, String> buildTailI() {
        Map<String, String> i = new HashMap<>(64);
        List<String> tailI = Lists.newArrayList("\ue27b", "\ue31c", "\ue31f");
        tailI.forEach(item -> buildLocateChar(i, item, "\ue00e"));
        return i;
    }

    private static Map<String, String> buildEng() {
        Map<String, String> eng = new HashMap<>(64);
        buildLocateChar(eng, "\ue2bb\u0020", "\ue005\ue006\ue00d");
        buildLocateChar(eng, "\ue2bc", "\ue005\ue031");
        buildLocateChar(eng, "\ue2bd", "\ue005\ue031");
        buildLocateChar(eng, "\ue2be", "\ue005\ue031");
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

    private static Map<String, String> buildShelb() {
        Map<String, String> shelb = new HashMap<>(64);
        shelbList.forEach(item -> {
            shelb.put("\u0020" + item, "\ue04d");
            shelb.put(item, "\ue006");
            shelb.put(item + "\u0020", "\ue006");
            shelb.put("\u0020" + item + "\u0020", "\ue04d");
        });

        shelb.put("\u0020" + cycleShelb, "\ue04d");
        shelb.put(cycleShelb, "\ue006");
        shelb.put(cycleShelb + "\u0020", "\ue006");
        shelb.put("\u0020" + cycleShelb + "\u0020", "\ue04d");

        return shelb;
    }

    private static Map<String, String> buildN() {
        Map<String, String> n = new HashMap<>(16);
        List<String> headN = Lists.newArrayList("\ue2b1", "\ue2b3");
        headN.forEach(item -> buildLocateChar(n, item, "\ue027"));

        buildLocateChar(n, "\ue2b6", "\ue077");
        List<String> tailNaNe = Lists.newArrayList("\ue2b6\ue274", "\ue2b6\ue269", "\ue2b6\ue26a");
        tailNaNe.forEach(item -> buildLocateChar(n, item, "\ue077"));

        List<String> middleN = Lists.newArrayList("\ue2b7", "\ue2b9", "\ue2bf");
        middleN.forEach(item -> buildLocateChar(n, item, "\ue028"));
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
            b.put("\u0020" + item, "\ue029");
            b.put(item, "\ue02a");
            b.put(item + "\u0020", "\ue02a");
            b.put("\u0020" + item + "\u0020", "\ue029");
        });
        b2.forEach(item -> {
            b.put("\u0020" + item, "\ue029");
            b.put(item, "\ue02a");
            b.put(item + "\u0020", "\ue02a");
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
                b.put("\u0020" + item + s, "\ue07c\ue00d");
                b.put(item + s, "\ue07d\ue00d");
                b.put("\u0020" + item + s + "\u0020", "\ue07c\ue00d");
                b.put(item + s + "\u0020", "\ue07d\ue00d");
            }
        });
        //bu
        b2.forEach(item -> {
            for (String cycleTailU : cycleTailUList) {
                b.put("\u0020" + item + cycleTailU, "\ue07b");
                b.put(item + cycleTailU, "\ue0cd");
                b.put(item + cycleTailU + "\u0020", "\ue0cd");
                b.put("\u0020" + item + cycleTailU + "\u0020", "\ue07b");
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
            p.put("\u0020" + item, "\ue02c");
            p.put(item, "\ue02d");
            p.put(item + "\u0020", "\ue02d");
            p.put("\u0020" + item + "\u0020", "\ue02c");
        });
        p2.forEach(item -> {
            p.put("\u0020" + item, "\ue02c");
            p.put(item, "\ue02d");
            p.put(item + "\u0020", "\ue02d");
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
                p.put("\u0020" + item + s, "\ue089\ue00d");
                p.put(item + s, "\ue08a\ue00d");
                p.put("\u0020" + item + s + "\u0020", "\ue089\ue00d");
                p.put(item + s + "\u0020", "\ue08a\ue00d");
            }
        });
        //pu
        p2.forEach(item -> {
            for (String cycleTailU : cycleTailUList) {
                p.put("\u0020" + item + cycleTailU, "\ue088");
                p.put(item + cycleTailU, "\ue0ce");
                p.put("\u0020" + item + cycleTailU + "\u0020", "\ue088");
                p.put(item + cycleTailU + "\u0020", "\ue0ce");
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
        p.put("\u0020\ue2cd", "\ue02c");
        p.put("\ue2cd", "\ue02d");
        p.put("\ue2cd\u0020", "\ue02d");
        p.put("\u0020\ue2cd\u0020", "\ue02c");
        //p
        buildLocateChar(p, "\ue2ca", "\ue02e");
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
        buildLocateChar(hg, "\ue2e8", "\ue006\ue00d");
        //middle ga
        List<String> middleGa = Lists.newArrayList("\ue2d9", "\ue2ea", "\ue2ec");
        middleGa.forEach(item -> buildLocateChar(hg, item, "\ue028\ue028"));

        List<String> h1 = Lists.newArrayList("\ue2d0", "\ue2e3", "\ue2da", "\ue2eb");
        List<String> h2 = Lists.newArrayList("\ue2d4", "\ue2e6", "\ue2ed", "\ue2dd");
        //h1,h2
        h1.forEach(item -> {
            hg.put("\u0020" + item, "\ue030");
            hg.put(item, "\ue031");
            hg.put(item + "\u0020", "\ue031");
            hg.put("\u0020" + item + "\u0020", "\ue030");
        });
        h2.forEach(item -> {
            hg.put("\u0020" + item, "\ue030");
            hg.put(item, "\ue031");
            hg.put(item + "\u0020", "\ue031");
            hg.put("\u0020" + item + "\u0020", "\ue030");
        });
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
                hg.put("\u0020" + item + cycleTailU, "\ue093");
                hg.put(item + cycleTailU, "\ue0cf");
                hg.put(item + cycleTailU + "\u0020", "\ue0cf");
                hg.put("\u0020" + item + cycleTailU + "\u0020", "\ue093");
            }
        });
        //tail hu
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
        List<String> j1 = Lists.newArrayList("\ue318", "\ue319", "\ue31a");

        j1.forEach(item -> buildLocateChar(j, item, "\ue04d"));
        buildLocateChar(j, "\ue31b", "\ue04f");
        buildLocateChar(j, "\ue31d", "\ue04e");
        return j;
    }

    private static Map<String, String> buildY() {
        Map<String, String> y = new HashMap<>(64);
        buildLocateChar(y, "\ue31e", "\ue050");
        buildLocateChar(y, "\ue320", "\ue051");
        return y;
    }

    private static Map<String, String> buildR() {
        Map<String, String> r = new HashMap<>(64);
        List<String> r1 = Lists.newArrayList("\ue322", "\ue323", "\ue324");
        r1.forEach(item -> buildLocateChar(r, item, "\ue053"));
        List<String> r2 = Lists.newArrayList("\ue326", "\ue327", "\ue328");
        r2.forEach(item -> buildLocateChar(r, item, "\ue054"));
        buildLocateChar(r, "\ue325", "\ue055");
        return r;
    }

    private static Map<String, String> buildW() {
        Map<String, String> w = new HashMap<>(64);
        buildLocateChar(w, "\ue329", "\ue056");
        buildLocateChar(w, "\ue32c", "\ue057");
        buildLocateChar(w, "\ue32a", "\ue058");
        return w;
    }

    private static Map<String, String> buildF() {
        Map<String, String> f = new HashMap<>(64);
        //top,middle f with a,e,i
        List<String> f1 = Lists.newArrayList("\ue32d", "\ue330");
        //top,middle f with o,u
        List<String> f2 = Lists.newArrayList("\ue32e", "\ue331");
        //f1,f2
        f1.forEach(item -> {
            f.put("\u0020" + item, "\ue059");
            f.put(item, "\ue05a");
            f.put(item + "\u0020", "\ue05a");
            f.put("\u0020" + item + "\u0020", "\ue059");
        });
        f2.forEach(item -> {
            f.put("\u0020" + item, "\ue059");
            f.put(item, "\ue05a");
            f.put(item + "\u0020", "\ue05a");
            f.put("\u0020" + item + "\u0020", "\ue059");
        });
        //head,middle fa,fe
        f1.forEach(item -> {
            for (String shud : shudList) {
                f.put("\u0020" + item + shud, "\ue0a2");
                f.put(item + shud, "\ue0a3");
                f.put("\u0020" + item + shud + "\u0020", "\ue0a2");
                f.put(item + shud + "\u0020", "\ue0a3");
            }
        });
        //fa,fe tail fa,fe
        f1.forEach(item -> {
            for (String s : cycleTsatslagaList) {
                f.put("\u0020" + item + s, "\ue0a2\ue00d");
                f.put(item + s, "\ue0a3\ue00d");
                f.put("\u0020" + item + s + "\u0020", "\ue0a2\ue00d");
                f.put(item + s + "\u0020", "\ue0a3\ue00d");
            }
        });
        //fu
        f2.forEach(item -> {
            for (String cycleTailU : cycleTailUList) {
                f.put("\u0020" + item + cycleTailU, "\ue0a1");
                f.put(item + cycleTailU, "\ue0d0");
                f.put(item + cycleTailU + "\u0020", "\ue0d0");
                f.put("\u0020" + item + cycleTailU + "\u0020", "\ue0a1");
            }
        });
        //fo,tail fo,fu
        f2.forEach(item -> {
            for (String s : cycleTailGedesList) {
                f.put("\u0020" + item + s, "\ue0a0");
                f.put(item + s, "\ue0aa");
                f.put(item + s + "\u0020", "\ue0aa");
                f.put("\u0020" + item + s + "\u0020", "\ue0a0");
            }
        });
        //head fo,middle fo,fu
        f2.forEach(item -> {
            for (String s : cycleNoTailGedesList) {
                f.put("\u0020" + item + s, "\ue08f");
                f.put(item + s, "\ue090");
                f.put(item + s + "\u0020", "\ue090");
                f.put("\u0020" + item + s + "\u0020", "\ue08f");
            }
        });
        //head fu
        f2.forEach(item -> {
            for (String s : cycleGedesForU) {
                f.put("\u0020" + item + s, "\ue08f\ue006");
                f.put(item + s, "\ue08f\ue006");
                f.put(item + s + "\u0020", "\ue08f\ue006");
                f.put("\u0020" + item + s + "\u0020", "\ue08f\ue006");
            }
        });
        //fi,tail fi
        f1.forEach(item -> {
            f.put("\u0020" + item + "\ue27c", "\ue09f");
            f.put(item + "\ue27c", "\ue0a7");
            f.put(item + "\ue27c\u0020", "\ue0a7");
            f.put("\u0020" + item + "\ue27c" + "\u0020", "\ue09f");
        });
        //top,middle fi
        f1.forEach(item -> {
            for (String s : shelbList) {
                f.put("\u0020" + item + s, "\ue0a5");
                f.put(item + s, "\ue0a6");
                f.put(item + s + "\u0020", "\ue0a6");
                f.put("\u0020" + item + s + "\u0020", "\ue0a5");
            }
            f.put("\u0020" + item + cycleShelb, "\ue0a5");
            f.put(item + cycleShelb, "\ue0a6");
            f.put(item + cycleShelb + "\u0020", "\ue0a6");
            f.put("\u0020" + item + cycleShelb + "\u0020", "\ue0a5");
        });
        //f
        f.put("\u0020\ue332", "\ue059");
        f.put("\ue332", "\ue05a");
        f.put("\ue332\u0020", "\ue05a");
        f.put("\u0020\ue332\u0020", "\ue059");
        //f
        buildLocateChar(f, "\ue32f", "\ue05b");
        return f;
    }

    private static Map<String, String> buildK() {
        Map<String, String> k = new HashMap<>(64);
        //top,middle k with a,e,i
        List<String> k1 = Lists.newArrayList("\ue333", "\ue336");
        //top,middle k with o,u
        List<String> k2 = Lists.newArrayList("\ue334", "\ue337");
        //k1,k2
        k1.forEach(item -> {
            k.put("\u0020" + item, "\ue05c");
            k.put(item, "\ue05d");
            k.put(item + "\u0020", "\ue05d");
            k.put("\u0020" + item + "\u0020", "\ue05c");
        });
        k2.forEach(item -> {
            k.put("\u0020" + item, "\ue05c");
            k.put(item, "\ue05d");
            k.put(item + "\u0020", "\ue05d");
            k.put("\u0020" + item + "\u0020", "\ue05c");
        });
        //head,middle ka,ke
        k1.forEach(item -> {
            for (String shud : shudList) {
                k.put("\u0020" + item + shud, "\ue0b0");
                k.put(item + shud, "\ue0b1");
                k.put("\u0020" + item + shud + "\u0020", "\ue0b0");
                k.put(item + shud + "\u0020", "\ue0b1");
            }
        });
        //ka,ke tail ka,ke
        k1.forEach(item -> {
            for (String s : cycleTsatslagaList) {
                k.put("\u0020" + item + s, "\ue0b0\ue00d");
                k.put(item + s, "\ue0b1\ue00d");
                k.put("\u0020" + item + s + "\u0020", "\ue0b0\ue00d");
                k.put(item + s + "\u0020", "\ue0b1\ue00d");
            }
        });
        //ku
        k2.forEach(item -> {
            for (String cycleTailU : cycleTailUList) {
                k.put("\u0020" + item + cycleTailU, "\ue0af");
                k.put(item + cycleTailU, "\ue0bc");
                k.put("\u0020" + item + cycleTailU + "\u0020", "\ue0af");
                k.put(item + cycleTailU + "\u0020", "\ue0bc");
            }
        });
        //ko,tail ko,ku
        k2.forEach(item -> {
            for (String s : cycleTailGedesList) {
                k.put("\u0020" + item + s, "\ue0ae");
                k.put(item + s, "\ue0bb");
                k.put(item + s + "\u0020", "\ue0bb");
                k.put("\u0020" + item + s + "\u0020", "\ue0ae");
            }
        });
        //head ko,middle ko,ku
        k2.forEach(item -> {
            for (String s : cycleNoTailGedesList) {
                k.put("\u0020" + item + s, "\ue0b9");
                k.put(item + s, "\ue0ba");
                k.put(item + s + "\u0020", "\ue0ba");
                k.put("\u0020" + item + s + "\u0020", "\ue0b9");
            }
        });
        //head ku
        k2.forEach(item -> {
            for (String s : cycleGedesForU) {
                k.put("\u0020" + item + s, "\ue0b9\ue006");
                k.put(item + s, "\ue0b9\ue006");
                k.put(item + s + "\u0020", "\ue0b9\ue006");
                k.put("\u0020" + item + s + "\u0020", "\ue0b9\ue006");
            }
        });
        //ki,tail ki
        k1.forEach(item -> {
            k.put("\u0020" + item + "\ue27c", "\ue0ad");
            k.put(item + "\ue27c", "\ue0b8");
            k.put(item + "\ue27c\u0020", "\ue0b8");
            k.put("\u0020" + item + "\ue27c" + "\u0020", "\ue0ad");
        });
        //top,middle ki
        k1.forEach(item -> {
            for (String s : shelbList) {
                k.put("\u0020" + item + s, "\ue0b6");
                k.put(item + s, "\ue0b7");
                k.put(item + s + "\u0020", "\ue0b7");
                k.put("\u0020" + item + s + "\u0020", "\ue0b6");
            }
            k.put("\u0020" + item + cycleShelb, "\ue0b6");
            k.put(item + cycleShelb, "\ue0b7");
            k.put(item + cycleShelb + "\u0020", "\ue0b7");
            k.put("\u0020" + item + cycleShelb + "\u0020", "\ue0b6");
        });
        //k
        k.put("\u0020\ue338", "\ue05c");
        k.put("\ue338", "\ue05d");
        k.put("\ue338\u0020", "\ue05d");
        k.put("\u0020\ue338\u0020", "\ue05c");
        //k
        buildLocateChar(k, "\ue335", "\ue05e");
        return k;
    }

    private static Map<String, String> buildKH() {
        Map<String, String> kh = new HashMap<>(64);
        //top,middle k with a,e,i
        List<String> kh1 = Lists.newArrayList("\ue339", "\ue33c");
        //top,middle k with o,u
        List<String> kh2 = Lists.newArrayList("\ue33a", "\ue33d");
        //k1,k2
        kh1.forEach(item -> {
            kh.put("\u0020" + item, "\ue05c");
            kh.put(item, "\ue05d");
            kh.put(item + "\u0020", "\ue05d");
            kh.put("\u0020" + item + "\u0020", "\ue05c");
        });
        kh2.forEach(item -> {
            kh.put("\u0020" + item, "\ue05c");
            kh.put(item, "\ue05d");
            kh.put(item + "\u0020", "\ue05d");
            kh.put("\u0020" + item + "\u0020", "\ue05c");
        });
        //head,middle ka,ke
        kh1.forEach(item -> {
            for (String shud : shudList) {
                kh.put("\u0020" + item + shud, "\ue0b0");
                kh.put(item + shud, "\ue0b1");
                kh.put("\u0020" + item + shud + "\u0020", "\ue0b0");
                kh.put(item + shud + "\u0020", "\ue0b1");
            }
        });
        //ka,ke tail ka,ke
        kh1.forEach(item -> {
            for (String s : cycleTsatslagaList) {
                kh.put("\u0020" + item + s, "\ue0b0\ue00d");
                kh.put(item + s, "\ue0b1\ue00d");
                kh.put("\u0020" + item + s + "\u0020", "\ue0b0\ue00d");
                kh.put(item + s + "\u0020", "\ue0b1\ue00d");
            }
        });
        //ku
        kh2.forEach(item -> {
            for (String cycleTailU : cycleTailUList) {
                kh.put("\u0020" + item + cycleTailU, "\ue0af");
                kh.put(item + cycleTailU, "\ue0bc");
                kh.put("\u0020" + item + cycleTailU + "\u0020", "\ue0af");
                kh.put(item + cycleTailU + "\u0020", "\ue0bc");
            }
        });
        //ko,tail ko,ku
        kh2.forEach(item -> {
            for (String s : cycleTailGedesList) {
                kh.put("\u0020" + item + s, "\ue0ae");
                kh.put(item + s, "\ue0bb");
                kh.put(item + s + "\u0020", "\ue0bb");
                kh.put("\u0020" + item + s + "\u0020", "\ue0ae");
            }
        });
        //head ko,middle ko,ku
        kh2.forEach(item -> {
            for (String s : cycleNoTailGedesList) {
                kh.put("\u0020" + item + s, "\ue0b9");
                kh.put(item + s, "\ue0ba");
                kh.put(item + s + "\u0020", "\ue0ba");
                kh.put("\u0020" + item + s + "\u0020", "\ue0b9");
            }
        });
        //head ku
        kh2.forEach(item -> {
            for (String s : cycleGedesForU) {
                kh.put("\u0020" + item + s, "\ue0b9\ue006");
                kh.put(item + s, "\ue0b9\ue006");
                kh.put(item + s + "\u0020", "\ue0b9\ue006");
                kh.put("\u0020" + item + s + "\u0020", "\ue0b9\ue006");
            }
        });
        //ki,tail ki
        kh1.forEach(item -> {
            kh.put("\u0020" + item + "\ue27c", "\ue0ad");
            kh.put(item + "\ue27c", "\ue0b8");
            kh.put(item + "\ue27c\u0020", "\ue0b8");
            kh.put("\u0020" + item + "\ue27c" + "\u0020", "\ue0ad");
        });
        //top,middle ki
        kh1.forEach(item -> {
            for (String s : shelbList) {
                kh.put("\u0020" + item + s, "\ue0b6");
                kh.put(item + s, "\ue0b7");
                kh.put(item + s + "\u0020", "\ue0b7");
                kh.put("\u0020" + item + s + "\u0020", "\ue0b6");
            }
            kh.put("\u0020" + item + cycleShelb, "\ue0b6");
            kh.put(item + cycleShelb, "\ue0b7");
            kh.put(item + cycleShelb + "\u0020", "\ue0b7");
            kh.put("\u0020" + item + cycleShelb + "\u0020", "\ue0b6");
        });
        //k
        kh.put("\u0020\ue33e", "\ue05c");
        kh.put("\ue33e", "\ue05d");
        kh.put("\ue33e\u0020", "\ue05d");
        kh.put("\u0020\ue33e\u0020", "\ue05c");
        //k
        buildLocateChar(kh, "\ue33b", "\ue05e");
        return kh;
    }

    private static Map<String, String> buildTS() {
        Map<String, String> ts = new HashMap<>(64);
        buildLocateChar(ts, "\ue33f", "\ue05f");
        buildLocateChar(ts, "\ue341", "\ue060");
        buildLocateChar(ts, "\ue340", "\ue061");
        return ts;
    }

    private static Map<String, String> buildZ() {
        Map<String, String> z = new HashMap<>(64);
        buildLocateChar(z, "\ue342", "\ue062");
        buildLocateChar(z, "\ue344", "\ue063");
        buildLocateChar(z, "\ue343", "\ue064");
        return z;
    }

    private static Map<String, String> buildHH() {
        Map<String, String> hh = new HashMap<>(64);
        buildLocateChar(hh, "\ue345", "\ue000\ue066");
        buildLocateChar(hh, "\ue347", "\ue066");
        buildLocateChar(hh, "\ue346", "\ue067");
        return hh;
    }

    private static Map<String, String> buildRH() {
        Map<String, String> rh = new HashMap<>(64);
        buildLocateChar(rh, "\ue348", "\ue068");
        buildLocateChar(rh, "\ue349", "\ue069");
        buildLocateChar(rh, "\ue34a", "\ue06a");
        return rh;
    }

    private static Map<String, String> buildOthers() {
        Map<String, String> others = new HashMap<>();
        buildLocateChar(others, "\ue263", "\u0020");
        return others;
    }

    private static Map<String, String> buildPunctuations() {
        Map<String, String> punctuations = new HashMap<>(512);

        buildLocateChar(punctuations, "\ue234", "\u1800");
        buildLocateChar(punctuations, "\ue235", "\u1801");
        buildLocateChar(punctuations, "\ue236", "\u1802");
        buildLocateChar(punctuations, "\ue237", "\u1803");
        buildLocateChar(punctuations, "\ue238", "\u1804");
        buildLocateChar(punctuations, "\ue239", "\u1805");
        buildLocateChar(punctuations, "\ue23a", "\u1806");
        buildLocateChar(punctuations, "\ue23b", "\u1807");
        buildLocateChar(punctuations, "\ue23c", "\u1808");
        buildLocateChar(punctuations, "\ue23d", "\u1809");
        buildLocateChar(punctuations, "\ue23e", "\u180A");

        //没有匹配
        buildLocateChar(punctuations, "\ue23f", "\ue23f");
        buildLocateChar(punctuations, "\ue240", "\ue240");
        buildLocateChar(punctuations, "\ue241", "\ue241");
        buildLocateChar(punctuations, "\ue242", "\ue242");


        buildLocateChar(punctuations, "\ue243", "\u00b7");

        buildLocateChar(punctuations, "\ue244", "\u1810");
        buildLocateChar(punctuations, "\ue245", "\u1811");
        buildLocateChar(punctuations, "\ue246", "\u1812");
        buildLocateChar(punctuations, "\ue247", "\u1813");
        buildLocateChar(punctuations, "\ue248", "\u1814");
        buildLocateChar(punctuations, "\ue249", "\u1815");
        buildLocateChar(punctuations, "\ue24a", "\u1816");
        buildLocateChar(punctuations, "\ue24b", "\u1817");
        buildLocateChar(punctuations, "\ue24c", "\u1818");
        buildLocateChar(punctuations, "\ue24d", "\u1819");


        buildLocateChar(punctuations, "\ue24e", "\u2048");
        buildLocateChar(punctuations, "\ue24f", "\u2049");
        buildLocateChar(punctuations, "\ue250", "\u0021");
        buildLocateChar(punctuations, "\ue251", "\u003f");
        buildLocateChar(punctuations, "\ue252", "\u003b");
        buildLocateChar(punctuations, "\ue253", "\u0028");
        buildLocateChar(punctuations, "\ue254", "\u0029");
        buildLocateChar(punctuations, "\ue255", "\u3008");
        buildLocateChar(punctuations, "\ue256", "\u3009");
        buildLocateChar(punctuations, "\ue257", "\u3014");
        buildLocateChar(punctuations, "\ue258", "\u3015");
        buildLocateChar(punctuations, "\ue259", "\u300a");
        buildLocateChar(punctuations, "\ue25a", "\u300b");
        buildLocateChar(punctuations, "\ue25b", "\u300e");
        buildLocateChar(punctuations, "\ue25c", "\u300f");
        buildLocateChar(punctuations, "\ue25d", "\u002c");
        buildLocateChar(punctuations, "\ue25e", "\u00d7");
        buildLocateChar(punctuations, "\ue25f", "\u203b");
        buildLocateChar(punctuations, "\ue260", "\u002d");
        buildLocateChar(punctuations, "\ue261", "\u007c");

        return punctuations;
    }

    private static void buildLocateChar(Map<String, String> map, String s, String mapperString) {
        map.put("\u0020" + s, mapperString);
        map.put(s, mapperString);
        map.put(s + "\u0020", mapperString);
        map.put("\u0020" + s + "\u0020", mapperString);
    }
}
