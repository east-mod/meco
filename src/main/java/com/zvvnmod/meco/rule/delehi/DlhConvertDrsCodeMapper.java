package com.zvvnmod.meco.rule.delehi;

import com.zvvnmod.meco.translate.domain.CodeMapper;

import java.util.HashMap;
import java.util.Map;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/9
 * WEEK  : Sun
 * TIME  : 23:08
 */
public class DlhConvertDrsCodeMapper {
    public static CodeMapper mapper;
    public static CodeMapper chaghMapper;
    public static CodeMapper hundiiMapper;

    static {
        buildChagh();
        buildHundii();
        buildMapper();
    }

    public static void buildChagh() {
        chaghMapper = new CodeMapper(16);
        //middle h
        chaghMapper.put("\u182c", "\ue005\ue005");
        //tail h
        chaghMapper.put("\u182c\u0020", "\ue032");
        //h+mvs
        chaghMapper.put("\u182c\u180e", "\ue005\ue005\ue143");
        //middle g
        chaghMapper.put("\u182d", "\ue005\ue005");
        //tail g
        chaghMapper.put("\u182d\u0020", "\ue032");
    }

    public static void buildHundii() {
        hundiiMapper = new CodeMapper(16);
        //middle h
        hundiiMapper.put("\u182c", "\ue031");
        //tail h
        hundiiMapper.put("\u182c\u0020", "\ue033");
        //h+mvs
        hundiiMapper.put("\u182c\u180e", "\ue031\ue143");
        //middle g
        hundiiMapper.put("\u182d", "\ue031");
        //tail g
        hundiiMapper.put("\u182d\u0020", "\ue033");
    }

    public static void buildMapper() {
        mapper = new CodeMapper(256);
        mapper.combine(getSeparator());
        mapper.combine(getEhshig());
        mapper.combine(getGiiN());
        mapper.combine(getGiiB());
        mapper.combine(getGiiP());
        mapper.combine(getGiiH());
        mapper.combine(getGiiG());
        mapper.combine(getGiiM());
        mapper.combine(getGiiL());
        mapper.combine(getGiiS());
        mapper.combine(getGiiSH());
        mapper.combine(getGiiT());
//        rule.combine(getGiiD());
//        rule.combine(getGiiTR());
//        rule.combine(getGiiJ());
//        rule.combine(getGiiY());
//        rule.combine(getGiiR());
//        rule.combine(getGiiW());
//        rule.combine(getGiiF());
//        rule.combine(getGiiK());
//        rule.combine(getGiiKH());
//        rule.combine(getGiiTS());
//        rule.combine(getGiiZ());
//        rule.combine(getGiiHH());
//        rule.combine(getGiiRH());
//        rule.combine(getGiiLH());
    }

    public static Map<String, String> getSeparator() {
        Map<String, String> separator = new HashMap<>(8);
        separator.put("\u0020\u180B\u0020", "\ue140");
        separator.put("\u0020\u180C\u0020", "\ue141");
        separator.put("\u0020\u180D\u0020", "\ue142");
        separator.put("\u0020\u180E\u0020", "\ue143");

        separator.put("\u0020\u180B", "\ue140");
        separator.put("\u0020\u180C", "\ue141");
        separator.put("\u0020\u180D", "\ue142");
        separator.put("\u0020\u180E", "\ue143");

        separator.put("\u180B\u0020", "\ue140");
        separator.put("\u180C\u0020", "\ue141");
        separator.put("\u180D\u0020", "\ue142");
        separator.put("\u180E\u0020", "\ue143");
        return separator;
    }

    public static Map<String, String> getEhshig() {
        Map<String, String> ehshig = new HashMap<>(32);
        //a
        ehshig.put("\u0020\u1820\u0020", "\ue000\ue00c");
        //e
        ehshig.put("\u0020\u1821\u0020", "\ue000\ue00d");
        //i
        ehshig.put("\u0020\u1822\u0020", "\ue000\ue00e");
        //4o,5o
        ehshig.put("\u0020\u1823\u0020", "\ue000\ue00f");
        ehshig.put("\u0020\u1824\u0020", "\ue000\ue00f");
        //6u,7u
        ehshig.put("\u0020\u1825\u0020", "\ue000\ue010");
        ehshig.put("\u0020\u1826\u0020", "\ue000\ue010");

        //head a
        ehshig.put("\u0020\u1820", "\ue000\ue005");
        //head e
        ehshig.put("\u0020\u1821", "\ue000");
        //head i
        ehshig.put("\u0020\u1822", "\ue000\ue006");
        //head 4o,5o
        ehshig.put("\u0020\u1823", "\ue000\ue008");
        ehshig.put("\u0020\u1824", "\ue000\ue008");
        //head 6u,7u
        ehshig.put("\u0020\u1825", "\ue000\ue008\ue006");
        ehshig.put("\u0020\u1826", "\ue000\ue008\ue006");

        //middle a,e
        ehshig.put("\u1820", "\ue005");
        ehshig.put("\u1821", "\ue005");
        //middle i
        ehshig.put("\u1822", "\ue006");
        //middle 4o,5o
        ehshig.put("\u1823", "\ue008");
        ehshig.put("\u1824", "\ue008");
        //middle 6u,7u
        ehshig.put("\u1825", "\ue008\ue006");
        ehshig.put("\u1826", "\ue008\ue006");

        //tail a,e
        ehshig.put("\u1820\u0020", "\ue00c");
        ehshig.put("\u1821\u0020", "\ue00c");
        //tail i
        ehshig.put("\u1822\u0020", "\ue00e");
        //tail 4o,5o
        ehshig.put("\u1823\u0020", "\ue011");
        ehshig.put("\u1824\u0020", "\ue011");
        //tail 6u,7u
        ehshig.put("\u1825\u0020", "\ue011");
        ehshig.put("\u1826\u0020", "\ue011");
        return ehshig;
    }

    public static Map<String, String> getGiiN() {
        Map<String, String> n = new HashMap<>(8);
        //head
        n.put("\u0020\u1828", "\ue027");
        //middle
        n.put("\u1828", "\ue028");
        //tail
        n.put("\u1828\u0020", "\ue00c");

        //n+180e
        n.put("\u1828\u180e", "\ue028\ue143");
        n.put("\u1828\u180e\u0020", "\ue00c\ue143");
        //tail2 na
        n.put("\u1828\u180e\u1820\u0020", "\ue077");
        n.put("\u1828\u180e\u1821\u0020", "\ue077");
        return n;
    }

    public static Map<String, String> getGiiB() {
        Map<String, String> b = new HashMap<>(8);
        //head
        b.put("\u0020\u182a", "\ue029");
        //middle
        b.put("\u182a", "\ue02a");
        //tail
        b.put("\u182a\u0020", "\ue02b");

        //ba
        b.put("\u0020\u182a\u1820\u0020", "\ue078");
        //be
        b.put("\u0020\u182a\u1821\u0020", "\ue078");
        //bi
        b.put("\u0020\u182a\u1822\u0020", "\ue079");
        //b4o
        b.put("\u0020\u182a\u1823\u0020", "\ue07a");
        //b5o
        b.put("\u0020\u182a\u1824\u0020", "\ue07a");
        //b6u
        b.put("\u0020\u182a\u1825\u0020", "\ue07b");
        //b7u
        b.put("\u0020\u182a\u1826\u0020", "\ue07b");
        //head ba,be
        b.put("\u0020\u182a\u1820", "\ue07c");
        b.put("\u0020\u182a\u1821", "\ue07c");
        //middle ba,be
        b.put("\u182a\u1820", "\ue07d");
        b.put("\u182a\u1821", "\ue07d");
        //tail ba,be
        b.put("\u182a\u1820\u0020", "\ue07e");
        b.put("\u182a\u1820\u0021", "\ue07e");
        //head bi
        b.put("\u0020\u182a\u1822", "\ue07f");
        //middle bi
        b.put("\u182a\u1822", "\ue080");
        //tail bi
        b.put("\u182a\u1822\u0020", "\ue081");
        //head b4o,b5o
        b.put("\u0020\u182a\u1823", "\ue082");
        b.put("\u0020\u182a\u1824", "\ue082");
        //middle b4o,b5o,b6u,b7u
        b.put("\u182a\u1823", "\ue083");
        b.put("\u182a\u1824", "\ue083");
        b.put("\u182a\u1825", "\ue083");
        b.put("\u182a\u1826", "\ue083");
        //tail b4o,b5o,b6u,b7u
        b.put("\u182a\u1823\u0020", "\ue084");
        b.put("\u182a\u1824\u0020", "\ue084");
        b.put("\u182a\u1825\u0020", "\ue084");
        b.put("\u182a\u1826\u0020", "\ue084");
        //head b6u,b7u
        b.put("\u0020\u182a\u1825", "\ue082\ue006");
        b.put("\u0020\u182a\u1826", "\ue082\ue006");
        return b;
    }

    public static Map<String, String> getGiiP() {
        Map<String, String> p = new HashMap<>(64);
        //pa,pe
        p.put("\u0020\u182b\u1820\u0020", "\ue085");
        p.put("\u0020\u182b\u1821\u0020", "\ue085");
        //pi
        p.put("\u0020\u182b\u1822\u0020", "\ue086");
        //p4o,p5o
        p.put("\u0020\u182b\u1823\u0020", "\ue087");
        p.put("\u0020\u182b\u1824\u0020", "\ue087");
        //p6u,p7u
        p.put("\u0020\u182b\u1825\u0020", "\ue088");
        p.put("\u0020\u182b\u1826\u0020", "\ue088");
        //head pa,pe
        p.put("\u0020\u182b\u1820", "\ue089");
        p.put("\u0020\u182b\u1821", "\ue089");
        //middle pa,pe
        p.put("\u182b\u1820", "\ue08a");
        p.put("\u182b\u1821", "\ue08a");
        //tail pa,pe
        p.put("\u182b\u1820\u0020", "\ue08b");
        p.put("\u182b\u1820\u0021", "\ue08b");
        //head pi
        p.put("\u0020\u182b\u1822", "\ue08c");
        //middle pi
        p.put("\u182b\u1822", "\ue08d");
        //tail pi
        p.put("\u182b\u1822\u0020", "\ue08e");
        //head p4o,p5o
        p.put("\u0020\u182b\u1823", "\ue08f");
        p.put("\u0020\u182b\u1824", "\ue08f");
        //middle p4o,p5o,p6u,p7u
        p.put("\u182b\u1823", "\ue090");
        p.put("\u182b\u1824", "\ue090");
        p.put("\u182b\u1825", "\ue090");
        p.put("\u182b\u1826", "\ue090");
        //tail p4o,p5o,p6u,p7u
        p.put("\u182b\u1823\u0020", "\ue091");
        p.put("\u182b\u1824\u0020", "\ue091");
        p.put("\u182b\u1825\u0020", "\ue091");
        p.put("\u182b\u1826\u0020", "\ue091");
        //head p6u,p7u
        p.put("\u0020\u182b\u1825", "\ue08f\ue006");
        p.put("\u0020\u182b\u1826", "\ue08f\ue006");
        return p;
    }

    public static Map<String, String> getGiiH() {
        Map<String, String> h = new HashMap<>(64);
        //head
        h.put("\u0020\u182c", "\ue030");

        //ha
        h.put("\u0020\u182c\u1820\u0020", "\ue02f\ue00c");
        //he
        h.put("\u0020\u182c\u1821\u0020", "\ue094\ue00d");
        //hi
        h.put("\u0020\u182c\u1822\u0020", "\ue092");
        //h4o,h5o
        h.put("\u0020\u182c\u1823\u0020", "\ue02f\ue00f");
        h.put("\u0020\u182c\u1824\u0020", "\ue02f\ue00f");
        //h6u,h7u
        h.put("\u0020\u182c\u1825\u0020", "\ue093");
        h.put("\u0020\u182c\u1826\u0020", "\ue093");
        //head ha
        h.put("\u0020\u182c\u1820", "\ue02f\ue005");
        //tail ha
        h.put("\u182c\u180e\u1820\u0020", "\ue032\ue00d");
        //head he
        h.put("\u0020\u182c\u1821", "\ue094");
        //middle he
        h.put("\u182c\u1821", "\ue095");
        //tail he
        h.put("\u182c\u1821\u0020", "\ue096");
        //head hi
        h.put("\u0020\u182c\u1822", "\ue097");
        //middle hi
        h.put("\u182c\u1822", "\ue098");
        //tail hi
        h.put("\u182c\u1822\u0020", "\ue099");
        //head h4o,h5o
        h.put("\u0020\u182c\u1823", "\ue02f\ue008");
        h.put("\u0020\u182c\u1824", "\ue02f\ue008");
        //head h6u,h7u
        h.put("\u0020\u182c\u1825", "\ue09a");
        h.put("\u0020\u182c\u1826", "\ue09a");
        //middle h6u,h7u
        h.put("\u182c\u1825", "\ue09b");
        h.put("\u182c\u1826", "\ue09b");
        //tail h6u,h7u
        h.put("\u182c\u1825\u0020", "\ue09c");
        h.put("\u182c\u1826\u0020", "\ue09c");
        return h;
    }

    public static Map<String, String> getGiiG() {
        Map<String, String> g = new HashMap<>(64);
        //head
        g.put("\u0020\u182d", "\ue030");

        //ga
        g.put("\u0020\u182d\u1820\u0020", "\ue034\ue00c");
        //ge
        g.put("\u0020\u182d\u1821\u0020", "\ue094\ue00d");
        //gi
        g.put("\u0020\u182d\u1822\u0020", "\ue092");
        //g4o,g5o
        g.put("\u0020\u182d\u1823\u0020", "\ue034\ue00f");
        g.put("\u0020\u182d\u1824\u0020", "\ue034\ue00f");
        //g6u,g7u
        g.put("\u0020\u182d\u1825\u0020", "\ue093");
        g.put("\u0020\u182d\u1826\u0020", "\ue093");
        //head ga
        g.put("\u0020\u182d\u1820", "\ue034\ue005");
        //middle ga
        g.put("\u182d\u1820", "\ue035\ue005");
        //tail ga
        g.put("\u182d\u1820\u0020", "\ue09d");
        //head ge
        g.put("\u0020\u182d\u1821", "\ue094");
        //middle ge
        g.put("\u182d\u1821", "\ue095");
        //tail ge
        g.put("\u182d\u1821\u0020", "\ue096");
        //head gi
        g.put("\u0020\u182d\u1822", "\ue097");
        //middle gi
        g.put("\u182d\u1822", "\ue098");
        //tail gi
        g.put("\u182d\u1822\u0020", "\ue099");
        //head g4o,g5o
        g.put("\u0020\u182d\u1823", "\ue034\ue008");
        g.put("\u0020\u182d\u1824", "\ue034\ue008");
        //middle g4o,g5o
        g.put("\u182d\u1823", "\ue035\ue008");
        g.put("\u182d\u1824", "\ue035\ue008");
        //tail g4o,g5o
        g.put("\u182d\u1823\u0020", "\ue035\ue011");
        g.put("\u182d\u1824\u0020", "\ue035\ue011");
        //head g6u,g7u
        g.put("\u0020\u182d\u1825", "\ue09a");
        g.put("\u0020\u182d\u1826", "\ue09a");
        //middle g6u,g7u
        g.put("\u182d\u1825", "\ue09b");
        g.put("\u182d\u1826", "\ue09b");
        //tail g6u,g7u
        g.put("\u182d\u1825\u0020", "\ue09c");
        g.put("\u182d\u1826\u0020", "\ue09c");
        return g;
    }

    public static Map<String, String> getGiiM() {
        Map<String, String> m = new HashMap<>(8);
        //head
        m.put("\u0020\u182E", "\ue036");
        //middle
        m.put("\u182E", "\ue037");
        //tail
        m.put("\u182E\u0020", "\ue038");
        return m;
    }

    public static Map<String, String> getGiiL() {
        Map<String, String> l = new HashMap<>(8);
        //head
        l.put("\u0020\u182f", "\ue039");
        //middle
        l.put("\u182f", "\ue03a");
        //tail
        l.put("\u182f\u0020", "\ue03b");
        return l;
    }

    public static Map<String, String> getGiiS() {
        Map<String, String> s = new HashMap<>(8);
        //head
        s.put("\u0020\u1830", "\ue03c");
        //middle
        s.put("\u1830", "\ue03d");
        //tail
        s.put("\u1830\u0020", "\ue03e");
        return s;
    }

    public static Map<String, String> getGiiSH() {
        Map<String, String> sh = new HashMap<>(8);
        //head
        sh.put("\u0020\u1831", "\ue03f");
        //middle
        sh.put("\u1831", "\ue040");
        //tail
        sh.put("\u1831\u0020", "\ue041");
        return sh;
    }

    public static Map<String, String> getGiiT() {
        Map<String, String> t = new HashMap<>(8);
        return t;
    }
}
