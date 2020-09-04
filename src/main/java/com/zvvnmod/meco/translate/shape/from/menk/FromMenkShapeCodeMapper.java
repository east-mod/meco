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

    static {
        build();
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


        codeMapper.put("\ue26e", "\ue005\ue005");
        codeMapper.put("\u0020\ue270\u0020", "\ue000\ue00d");
        codeMapper.put("\u0020\ue271", "\ue000");
        codeMapper.put("\u0020\ue272", "\ue000\ue005");
        codeMapper.put("\ue273\u0020", "\ue00c");

        codeMapper.put("\ue274\u0020", "\ue00d");
        codeMapper.put("\ue275\u0020", "\ue005\ue00d");
        codeMapper.put("\u0020\ue279\u0020", "\ue005");
        codeMapper.put("\u0020\ue27a", "\ue000\ue006");
        codeMapper.put("\ue27b\u0020", "\ue00e");

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
        //eu
        codeMapper.put("\u0020\ue294\u0020", "\ue000\ue011");
        codeMapper.put("\u0020\ue2a1\u0020", "\ue000\ue011");

        //ee
        codeMapper.put("\u0020\ue2ad\u0020", "\ue000\ue058");
        codeMapper.put("\u0020\ue2ae", "\ue000\ue057");
        codeMapper.put("\ue2af\u0020", "\ue058");
        codeMapper.put("\ue2b0", "\ue057");
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
        //bi
        b.put("\u0020\ue2c5\ue27c\u0020", "\ue079");
        b.put("\u0020\ue2c1\ue27c\u0020", "\ue079");
        //tail bi
        b.put("\ue2c5\ue27c\u0020", "\ue081");
        b.put("\ue2c1\ue27c\u0020", "\ue081");
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
        return b;
    }

    private static Map<String, String> buildP() {
        Map<String, String> p = new HashMap<>(64);
        //pi
        p.put("\u0020\ue2c8\ue27c\u0020", "\ue086");
        p.put("\u0020\ue2cb\ue27c\u0020", "\ue086");
        //tail pi
        p.put("\ue2cb\ue27c\u0020", "\ue081");
        p.put("\ue2c8\ue27c\u0020", "\ue081");
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

        //tail g
        //hi,gi
        hg.put("\u0020\ue2d0\ue27c\u0020", "\ue092");
        hg.put("\u0020\ue2da\ue27c\u0020", "\ue092");
        //hi,gi tail
        hg.put("\ue2da\ue27c\u0020", "\ue099");
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
        return s;
    }

    private static Map<String, String> buildSH() {
        Map<String, String> sh = new HashMap<>(64);
        return sh;
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

    private static void buildLocateChar(Map<String, String> map, String s, String mapperString) {
        map.put("\u0020" + s, mapperString);
        map.put(s, mapperString);
        map.put(s + "\u0020", mapperString);
        map.put("\u0020" + s + "\u0020", mapperString);
    }
}
