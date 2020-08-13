package com.zvvnmod.meco.rule.delehi;

import com.zvvnmod.meco.translate.domain.CodeMapper;

import java.util.HashMap;
import java.util.Map;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/5
 * WEEK  : Wed
 * TIME  : 19:42
 */
public class DlhConvertUyeCodeMapper {
    public static CodeMapper mapper;

    static {
        build();
    }

    public static void build() {
        mapper = new CodeMapper(2048);
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
        mapper.combine(getGiiD());
        mapper.combine(getGiiTR());
        mapper.combine(getGiiJ());
        mapper.combine(getGiiY());
        mapper.combine(getGiiR());
        mapper.combine(getGiiW());
        mapper.combine(getGiiF());
        mapper.combine(getGiiK());
        mapper.combine(getGiiKH());
        mapper.combine(getGiiTS());
        mapper.combine(getGiiZ());
        mapper.combine(getGiiHH());
        mapper.combine(getGiiRH());
        mapper.combine(getGiiLH());
    }

    public static Map<String, String> getEhshig() {
        Map<String, String> ehshig = new HashMap<>(64);
        //a
        ehshig.put("\u0020\u1820\u0020", "\ue000");
        //e
        ehshig.put("\u0020\u1821\u0020", "\ue001");
        //i
        ehshig.put("\u0020\u1822\u0020", "\ue002");
        //4o
        ehshig.put("\u0020\u1823\u0020", "\ue003");
        //5o
        ehshig.put("\u0020\u1824\u0020", "\ue003");
        //6u
        ehshig.put("\u0020\u1825\u0020", "\ue004");
        //7u
        ehshig.put("\u0020\u1826\u0020", "\ue004");
        //top,a
        ehshig.put("\u0020\u1820", "\ue005");
        //top,e
        ehshig.put("\u0020\u1821", "\ue006");
        //top,i
        ehshig.put("\u0020\u1822", "\ue007");
        //top,4o
        ehshig.put("\u0020\u1823", "\ue008");
        //top,5o
        ehshig.put("\u0020\u1824", "\ue008");
        //top,6u
        ehshig.put("\u0020\u1825", "\ue009");
        //top,7u
        ehshig.put("\u0020\u1826", "\ue009");
        return ehshig;
    }

    public static Map<String, String> getGiiN() {
        Map<String, String> n = new HashMap<>(64);
        //na,ne
        n.put("\u0020\u1828\u1820\u0020", "\ue00a");
        //ni
        n.put("\u0020\u1828\u1822\u0020", "\ue00b");
        //n4o
        n.put("\u0020\u1828\u1823\u0020", "\ue00c");
        //n5o
        n.put("\u0020\u1828\u1824\u0020", "\ue00c");
        //n6u
        n.put("\u0020\u1828\u1825\u0020", "\ue00d");
        //n7u
        n.put("\u0020\u1828\u1826\u0020", "\ue00d");
        //head na
        n.put("\u0020\u1828\u1820", "\ue00e");
        //head ne
        n.put("\u0020\u1828\u1821", "\ue00e");
        //middle na
        n.put("\u1828\u1820", "\ue00f");
        //middle ne
        n.put("\u1828\u1821", "\ue00f");
        //tail1 na,ne
        n.put("\u1828\u1820\u0020", "\ue010");
        n.put("\u1828\u1821\u0020", "\ue010");
        //tail2 na,ne [180e]
        n.put("\u1828\u180e\u1820\u0020", "\ue011");
        n.put("\u1828\u180e\u1821\u0020", "\ue011");
        //head ni
        n.put("\u0020\u1828\u1822", "\ue012");
        //middle ni
        n.put("\u1828\u1822", "\ue013");
        //tail ni
        n.put("\u1828\u1822\u0020", "\ue014");
        //head n4o
        n.put("\u0020\u1828\u1823", "\ue015");
        //head n5o
        n.put("\u0020\u1828\u1824", "\ue015");
        //middle n4o
        n.put("\u1828\u1823", "\ue016");
        //middle n5o
        n.put("\u1828\u1824", "\ue016");
        //middle n6u
        n.put("\u1828\u1825", "\ue016");
        //middle n7u
        n.put("\u1828\u1826", "\ue016");
        //tail n4o
        n.put("\u1828\u1823\u0020", "\ue017");
        //tail n5o
        n.put("\u1828\u1824\u0020", "\ue017");
        //tail n6u
        n.put("\u1828\u1825\u0020", "\ue017");
        //tail n7u
        n.put("\u1828\u1826\u0020", "\ue017");
        //head n6u
        n.put("\u0020\u1828\u1825", "\ue018");
        //head n7u
        n.put("\u0020\u1828\u1826", "\ue018");
        return n;
    }

    public static Map<String, String> getGiiB() {
        Map<String, String> b = new HashMap<>(64);
        //ba
        b.put("\u0020\u182a\u1820\u0020", "\ue019");
        //be
        b.put("\u0020\u182a\u1821\u0020", "\ue019");
        //bi
        b.put("\u0020\u182a\u1822\u0020", "\ue01a");
        //b4o
        b.put("\u0020\u182a\u1823\u0020", "\ue01b");
        //b5o
        b.put("\u0020\u182a\u1824\u0020", "\ue01b");
        //b6u
        b.put("\u0020\u182a\u1825\u0020", "\ue01c");
        //b7u
        b.put("\u0020\u182a\u1826\u0020", "\ue01c");
        //head ba,be
        b.put("\u0020\u182a\u1820", "\ue01d");
        b.put("\u0020\u182a\u1821", "\ue01d");
        //middle ba,be
        b.put("\u182a\u1820", "\ue01e");
        b.put("\u182a\u1821", "\ue01e");
        //tail ba,be
        b.put("\u182a\u1820\u0020", "\ue01f");
        b.put("\u182a\u1820\u0021", "\ue01f");
        //head bi
        b.put("\u0020\u182a\u1822", "\ue020");
        //middle bi
        b.put("\u182a\u1822", "\ue021");
        //tail bi
        b.put("\u182a\u1822\u0020", "\ue022");
        //head b4o,b5o
        b.put("\u0020\u182a\u1823", "\ue023");
        b.put("\u0020\u182a\u1824", "\ue023");
        //middle b4o,b5o,b6u,b7u
        b.put("\u182a\u1823", "\ue024");
        b.put("\u182a\u1824", "\ue024");
        b.put("\u182a\u1825", "\ue024");
        b.put("\u182a\u1826", "\ue024");
        //tail b4o,b5o,b6u,b7u
        b.put("\u182a\u1823\u0020", "\ue025");
        b.put("\u182a\u1824\u0020", "\ue025");
        b.put("\u182a\u1825\u0020", "\ue025");
        b.put("\u182a\u1826\u0020", "\ue025");
        //head b6u,b7u
        b.put("\u0020\u182a\u1825", "\ue026");
        b.put("\u0020\u182a\u1826", "\ue026");
        return b;
    }

    public static Map<String, String> getGiiP() {
        Map<String, String> p = new HashMap<>(64);
        //pa,pe
        p.put("\u0020\u182b\u1820\u0020", "\ue027");
        p.put("\u0020\u182b\u1821\u0020", "\ue027");
        //pi
        p.put("\u0020\u182b\u1822\u0020", "\ue028");
        //p4o,p5o
        p.put("\u0020\u182b\u1823\u0020", "\ue029");
        p.put("\u0020\u182b\u1824\u0020", "\ue029");
        //p6u,p7u
        p.put("\u0020\u182b\u1825\u0020", "\ue02a");
        p.put("\u0020\u182b\u1826\u0020", "\ue02a");
        //head pa,pe
        p.put("\u0020\u182b\u1820", "\ue02b");
        p.put("\u0020\u182b\u1821", "\ue02b");
        //middle pa,pe
        p.put("\u182b\u1820", "\ue02c");
        p.put("\u182b\u1821", "\ue02c");
        //tail pa,pe
        p.put("\u182b\u1820\u0020", "\ue02d");
        p.put("\u182b\u1820\u0021", "\ue02d");
        //head pi
        p.put("\u0020\u182b\u1822", "\ue02e");
        //middle pi
        p.put("\u182b\u1822", "\ue02f");
        //tail pi
        p.put("\u182b\u1822\u0020", "\ue030");
        //head p4o,p5o
        p.put("\u0020\u182b\u1823", "\ue031");
        p.put("\u0020\u182b\u1824", "\ue031");
        //middle p4o,p5o,p6u,p7u
        p.put("\u182b\u1823", "\ue032");
        p.put("\u182b\u1824", "\ue032");
        p.put("\u182b\u1825", "\ue032");
        p.put("\u182b\u1826", "\ue032");
        //tail p4o,p5o,p6u,p7u
        p.put("\u182b\u1823\u0020", "\ue033");
        p.put("\u182b\u1824\u0020", "\ue033");
        p.put("\u182b\u1825\u0020", "\ue033");
        p.put("\u182b\u1826\u0020", "\ue033");
        //head p6u,p7u
        p.put("\u0020\u182b\u1825", "\ue034");
        p.put("\u0020\u182b\u1826", "\ue034");
        return p;
    }

    public static Map<String, String> getGiiH() {
        Map<String, String> h = new HashMap<>(64);
        //ha
        h.put("\u0020\u182c\u1820\u0020", "\ue035");
        //he
        h.put("\u0020\u182c\u1821\u0020", "\ue036");
        //hi
        h.put("\u0020\u182c\u1822\u0020", "\ue037");
        //h4o,h5o
        h.put("\u0020\u182c\u1823\u0020", "\ue038");
        h.put("\u0020\u182c\u1824\u0020", "\ue038");
        //h6u,h7u
        h.put("\u0020\u182c\u1825\u0020", "\ue039");
        h.put("\u0020\u182c\u1826\u0020", "\ue039");
        //head ha
        h.put("\u0020\u182c\u1820", "\ue03a");
        //middle ha
        h.put("\u182c\u1820", "\ue03b");
        //tail ha
        h.put("\u182c\u1820\u0020", "\ue03c");
        //head he
        h.put("\u0020\u182c\u1821", "\ue03d");
        //middle he
        h.put("\u182c\u1821", "\ue03e");
        //tail he
        h.put("\u182c\u1821\u0020", "\ue03f");
        //head hi
        h.put("\u0020\u182c\u1822", "\ue040");
        //middle hi
        h.put("\u182c\u1822", "\ue041");
        //tail hi
        h.put("\u182c\u1822\u0020", "\ue042");
        //head h4o,h5o
        h.put("\u0020\u182c\u1823", "\ue043");
        h.put("\u0020\u182c\u1824", "\ue043");
        //middle h4o,h5o
        h.put("\u182c\u1823", "\ue044");
        h.put("\u182c\u1824", "\ue044");
        //tail h4o,h5o
        h.put("\u182c\u1823\u0020", "\ue045");
        h.put("\u182c\u1824\u0020", "\ue045");
        //head h6u,h7u
        h.put("\u0020\u182c\u1825", "\ue046");
        h.put("\u0020\u182c\u1826", "\ue046");
        //middle h6u,h7u
        h.put("\u182c\u1825", "\ue047");
        h.put("\u182c\u1826", "\ue047");
        //tail h6u,h7u
        h.put("\u182c\u1825\u0020", "\ue048");
        h.put("\u182c\u1826\u0020", "\ue048");
        return h;
    }

    public static Map<String, String> getGiiG() {
        Map<String, String> g = new HashMap<>(64);
        //ga
        g.put("\u0020\u182d\u1820\u0020", "\ue049");
        //ge
        g.put("\u0020\u182d\u1821\u0020", "\ue036");
        //gi
        g.put("\u0020\u182d\u1822\u0020", "\ue037");
        //g4o,g5o
        g.put("\u0020\u182d\u1823\u0020", "\ue04a");
        g.put("\u0020\u182d\u1824\u0020", "\ue04a");
        //g6u,g7u
        g.put("\u0020\u182d\u1825\u0020", "\ue039");
        g.put("\u0020\u182d\u1826\u0020", "\ue039");
        //head ga
        g.put("\u0020\u182d\u1820", "\ue04b");
        //middle ga
        g.put("\u182d\u1820", "\ue04c");
        //tail ga
        g.put("\u182d\u1820\u0020", "\ue04d");
        //head ge
        g.put("\u0020\u182d\u1821", "\ue03d");
        //middle ge
        g.put("\u182d\u1821", "\ue03e");
        //tail ge
        g.put("\u182d\u1821\u0020", "\ue03f");
        //head gi
        g.put("\u0020\u182d\u1822", "\ue040");
        //middle gi
        g.put("\u182d\u1822", "\ue041");
        //tail gi
        g.put("\u182d\u1822\u0020", "\ue042");
        //head g4o,g5o
        g.put("\u0020\u182d\u1823", "\ue04e");
        g.put("\u0020\u182d\u1824", "\ue04e");
        //middle g4o,g5o
        g.put("\u182d\u1823", "\ue04f");
        g.put("\u182d\u1824", "\ue04f");
        //tail g4o,g5o
        g.put("\u182d\u1823\u0020", "\ue050");
        g.put("\u182d\u1824\u0020", "\ue050");
        //head g6u,g7u
        g.put("\u0020\u182d\u1825", "\ue046");
        g.put("\u0020\u182d\u1826", "\ue046");
        //middle g6u,g7u
        g.put("\u182d\u1825", "\ue047");
        g.put("\u182d\u1826", "\ue047");
        //tail g6u,g7u
        g.put("\u182d\u1825\u0020", "\ue048");
        g.put("\u182d\u1826\u0020", "\ue048");
        return g;
    }

    public static Map<String, String> getGiiM() {
        Map<String, String> m = new HashMap<>(64);
        //ma,me
        m.put("\u0020\u182e\u1820\u0020", "\ue051");
        m.put("\u0020\u182e\u1821\u0020", "\ue051");
        //mi
        m.put("\u0020\u182e\u1822\u0020", "\ue052");
        //m4o,m5o
        m.put("\u0020\u182e\u1823\u0020", "\ue053");
        m.put("\u0020\u182e\u1824\u0020", "\ue053");
        //m6u,m7u
        m.put("\u0020\u182e\u1825\u0020", "\ue054");
        m.put("\u0020\u182e\u1826\u0020", "\ue054");
        //head ma,me
        m.put("\u0020\u182e\u1820", "\ue055");
        m.put("\u0020\u182e\u1821", "\ue055");
        //middle ma,me
        m.put("\u182e\u1820", "\ue056");
        m.put("\u182e\u1821", "\ue056");
        //tail1 ma,me
        m.put("\u182e\u1820\u0020", "\ue057");
        m.put("\u182e\u1821\u0020", "\ue057");
        //tail2 ma,me [180e]
        m.put("\u182e\u180e\u1820\u0020", "\ue058");
        m.put("\u182e\u180e\u1821\u0020", "\ue058");
        //head mi
        m.put("\u0020\u182e\u1822", "\ue059");
        //middle mi
        m.put("\u182e\u1822", "\ue05a");
        //tail mi
        m.put("\u182e\u1822\u0020", "\ue05b");
        //head m4o,m5o
        m.put("\u0020\u182e\u1823", "\ue05c");
        m.put("\u0020\u182e\u1824", "\ue05c");
        //middle m4o,m5o,m6u,m7u
        m.put("\u182e\u1823", "\ue05d");
        m.put("\u182e\u1824", "\ue05d");
        m.put("\u182e\u1825", "\ue05d");
        m.put("\u182e\u1826", "\ue05d");
        //tail m4o,m5o,m6u,m7u
        m.put("\u182e\u1823\u0020", "\ue05e");
        m.put("\u182e\u1824\u0020", "\ue05e");
        m.put("\u182e\u1825\u0020", "\ue05e");
        m.put("\u182e\u1826\u0020", "\ue05e");
        //head m6u,m7u
        m.put("\u0020\u182e\u1825", "\ue05f");
        m.put("\u0020\u182e\u1826", "\ue05f");
        return m;
    }

    public static Map<String, String> getGiiL() {
        Map<String, String> l = new HashMap<>(64);
        //la,le
        l.put("\u0020\u182f\u1820\u0020", "\ue060");
        l.put("\u0020\u182f\u1821\u0020", "\ue060");
        //li
        l.put("\u0020\u182f\u1822\u0020", "\ue061");
        //l4o,l5o
        l.put("\u0020\u182f\u1823\u0020", "\ue062");
        l.put("\u0020\u182f\u1824\u0020", "\ue062");
        //l6u,l7u
        l.put("\u0020\u182f\u1825\u0020", "\ue063");
        l.put("\u0020\u182f\u1826\u0020", "\ue063");
        //head la,le
        l.put("\u0020\u182f\u1820", "\ue064");
        l.put("\u0020\u182f\u1821", "\ue064");
        //middle la,le
        l.put("\u182f\u1820", "\ue065");
        l.put("\u182f\u1821", "\ue065");
        //tail1 la,le
        l.put("\u182f\u1820\u0020", "\ue066");
        l.put("\u182f\u1821\u0020", "\ue066");
        //tail2 la,le [180e]
        l.put("\u182f\u180e\u1820\u0020", "\ue067");
        l.put("\u182f\u180e\u1821\u0020", "\ue067");
        //head li
        l.put("\u0020\u182f\u1822", "\ue068");
        //middle li
        l.put("\u182f\u1822", "\ue069");
        //tail li
        l.put("\u182f\u1822\u0020", "\ue06a");
        //head l4o,l5o
        l.put("\u0020\u182f\u1823", "\ue06b");
        l.put("\u0020\u182f\u1824", "\ue06b");
        //middle l4o,l5o,l6u,l7u
        l.put("\u182f\u1823", "\ue06c");
        l.put("\u182f\u1824", "\ue06c");
        l.put("\u182f\u1825", "\ue06c");
        l.put("\u182f\u1826", "\ue06c");
        //tail l4o,l5o,l6u,l7u
        l.put("\u182f\u1823\u0020", "\ue06d");
        l.put("\u182f\u1824\u0020", "\ue06d");
        l.put("\u182f\u1825\u0020", "\ue06d");
        l.put("\u182f\u1826\u0020", "\ue06d");
        //head l6u,l7u
        l.put("\u0020\u182f\u1825", "\ue06e");
        l.put("\u0020\u182f\u1826", "\ue06e");
        return l;
    }

    public static Map<String, String> getGiiS() {
        Map<String, String> s = new HashMap<>(64);
        //sa,se
        s.put("\u0020\u1830\u1820\u0020", "\ue06f");
        s.put("\u0020\u1830\u1821\u0020", "\ue06f");
        //si
        s.put("\u0020\u1830\u1822\u0020", "\ue070");
        //s4o,s5o
        s.put("\u0020\u1830\u1823\u0020", "\ue071");
        s.put("\u0020\u1830\u1824\u0020", "\ue071");
        //s6u,s7u
        s.put("\u0020\u1830\u1825\u0020", "\ue072");
        s.put("\u0020\u1830\u1826\u0020", "\ue072");
        //head sa,se
        s.put("\u0020\u1830\u1820", "\ue073");
        s.put("\u0020\u1830\u1821", "\ue073");
        //middle sa,se
        s.put("\u1830\u1820", "\ue074");
        s.put("\u1830\u1821", "\ue074");
        //tail sa,se
        s.put("\u1830\u1820\u0020", "\ue075");
        s.put("\u1830\u1821\u0020", "\ue075");
        //head si
        s.put("\u0020\u1830\u1822", "\ue076");
        //middle si
        s.put("\u1830\u1822", "\ue077");
        //tail si
        s.put("\u1830\u1822\u0020", "\ue078");
        //head s4o,s5o
        s.put("\u0020\u1830\u1823", "\ue079");
        s.put("\u0020\u1830\u1824", "\ue079");
        //middle s4o,s5o,s6u,s7u
        s.put("\u1830\u1823", "\ue07a");
        s.put("\u1830\u1824", "\ue07a");
        s.put("\u1830\u1825", "\ue07a");
        s.put("\u1830\u1826", "\ue07a");
        //tail s4o,s5o,s6u,s7u
        s.put("\u1830\u1823\u0020", "\ue07b");
        s.put("\u1830\u1824\u0020", "\ue07b");
        s.put("\u1830\u1825\u0020", "\ue07b");
        s.put("\u1830\u1826\u0020", "\ue07b");
        //head s6u,s7u
        s.put("\u0020\u1830\u1825", "\ue07c");
        s.put("\u0020\u1830\u1826", "\ue07c");
        return s;
    }

    public static Map<String, String> getGiiSH() {
        Map<String, String> sh = new HashMap<>(64);
        //sha,she
        sh.put("\u0020\u1831\u1820\u0020", "\ue07d");
        sh.put("\u0020\u1831\u1821\u0020", "\ue07d");
        //shi
        sh.put("\u0020\u1831\u1822\u0020", "\ue07e");
        //sh4o,sh5o
        sh.put("\u0020\u1831\u1823\u0020", "\ue07f");
        sh.put("\u0020\u1831\u1824\u0020", "\ue07f");
        //sh6u,sh7u
        sh.put("\u0020\u1831\u1825\u0020", "\ue080");
        sh.put("\u0020\u1831\u1826\u0020", "\ue080");
        //head sha,she
        sh.put("\u0020\u1831\u1820", "\ue081");
        sh.put("\u0020\u1831\u1821", "\ue081");
        //middle sha,she
        sh.put("\u1831\u1820", "\ue082");
        sh.put("\u1831\u1821", "\ue082");
        //tail sha,she
        sh.put("\u1831\u1820\u0020", "\ue083");
        sh.put("\u1831\u1821\u0020", "\ue083");
        //head shi
        sh.put("\u0020\u1831\u1822", "\ue084");
        //middle shi
        sh.put("\u1831\u1822", "\ue085");
        //tail shi
        sh.put("\u1831\u1822\u0020", "\ue086");
        //head sh4o,sh5o
        sh.put("\u0020\u1831\u1823", "\ue087");
        sh.put("\u0020\u1831\u1824", "\ue087");
        //middle sh4o,sh5o,sh6u,sh7u
        sh.put("\u1831\u1823", "\ue088");
        sh.put("\u1831\u1824", "\ue088");
        sh.put("\u1831\u1825", "\ue088");
        sh.put("\u1831\u1826", "\ue088");
        //tail sh4o,sh5o,sh6u,sh7u
        sh.put("\u1831\u1823\u0020", "\ue089");
        sh.put("\u1831\u1824\u0020", "\ue089");
        sh.put("\u1831\u1825\u0020", "\ue089");
        sh.put("\u1831\u1826\u0020", "\ue089");
        //head sh6u,sh7u
        sh.put("\u0020\u1831\u1825", "\ue08a");
        sh.put("\u0020\u1831\u1826", "\ue08a");
        return sh;
    }

    public static Map<String, String> getGiiT() {
        Map<String, String> t = new HashMap<>(64);
        return t;
    }

    public static Map<String, String> getGiiD() {
        Map<String, String> d = new HashMap<>(64);
        return d;
    }

    public static Map<String, String> getGiiTR() {
        Map<String, String> tr = new HashMap<>(64);
        //tra tre
        tr.put("\u0020\u1834\u1820\u0020", "\ue0a8");
        tr.put("\u0020\u1834\u1821\u0020", "\ue0a8");
        //tri
        tr.put("\u0020\u1834\u1822\u0020", "\ue0a9");
        //tr4o,tr5o
        tr.put("\u0020\u1834\u1823\u0020", "\ue0aa");
        tr.put("\u0020\u1834\u1824\u0020", "\ue0aa");
        //tr6u,tr7u
        tr.put("\u0020\u1834\u1825\u0020", "\ue0ab");
        tr.put("\u0020\u1834\u1826\u0020", "\ue0ab");
        //head tra,tre
        tr.put("\u0020\u1834\u1820", "\ue0ac");
        tr.put("\u0020\u1834\u1821", "\ue0ac");
        //middle tra,tre
        tr.put("\u1834\u1820", "\ue0ad");
        tr.put("\u1834\u1821", "\ue0ad");
        //tail tra,tre
        tr.put("\u1834\u1820\u0020", "\ue0ae");
        tr.put("\u1834\u1821\u0020", "\ue0ae");
        //head tri
        tr.put("\u0020\u1834\u1822", "\ue0af");
        //middle tri
        tr.put("\u1834\u1822", "\ue0b0");
        //tail tri
        tr.put("\u1834\u1822\u0020", "\ue0b1");
        //head tr4o,tr5o
        tr.put("\u0020\u1834\u1823", "\ue0b2");
        tr.put("\u0020\u1834\u1824", "\ue0b2");
        //middle tr4o,tr5o,tr6u,tr7u
        tr.put("\u1834\u1823", "\ue0b3");
        tr.put("\u1834\u1824", "\ue0b3");
        tr.put("\u1834\u1825", "\ue0b3");
        tr.put("\u1834\u1826", "\ue0b3");
        //tail tr4o,tr5o,tr6u,tr7u
        tr.put("\u1834\u1823\u0020", "\ue0b4");
        tr.put("\u1834\u1824\u0020", "\ue0b4");
        tr.put("\u1834\u1825\u0020", "\ue0b4");
        tr.put("\u1834\u1826\u0020", "\ue0b4");
        //head tr6u,tr7u
        tr.put("\u0020\u1834\u1825", "\ue0b5");
        tr.put("\u0020\u1834\u1826", "\ue0b5");
        return tr;
    }

    public static Map<String, String> getGiiJ() {
        Map<String, String> j = new HashMap<>(64);
        //ja,je
        j.put("\u0020\u1835\u1820\u0020", "\ue0b6");
        j.put("\u0020\u1835\u1821\u0020", "\ue0b6");
        //ji
        j.put("\u0020\u1835\u1822\u0020", "\ue0b7");
        //j4o,j5o
        j.put("\u0020\u1835\u1823\u0020", "\ue0b8");
        j.put("\u0020\u1835\u1824\u0020", "\ue0b8");
        //j6u,j7u
        j.put("\u0020\u1835\u1825\u0020", "\ue0b9");
        j.put("\u0020\u1835\u1826\u0020", "\ue0b9");
        //head ja,je
        j.put("\u0020\u1835\u1820", "\ue0ba");
        j.put("\u0020\u1835\u1821", "\ue0ba");
        //middle ja,je
        j.put("\u1835\u1820", "\ue0bb");
        j.put("\u1835\u1821", "\ue0bb");
        //tail ja,je
        j.put("\u1835\u1820\u0020", "\ue0bc");
        j.put("\u1835\u1821\u0020", "\ue0bc");
        //head ji
        j.put("\u0020\u1835\u1822", "\ue0bd");
        //middle ji
        j.put("\u1835\u1822", "\ue0be");
        //tail ji
        j.put("\u1835\u1822\u0020", "\ue0bf");
        //head j4o,j5o
        j.put("\u0020\u1835\u1823", "\ue0c0");
        j.put("\u0020\u1835\u1824", "\ue0c0");
        //middle j4o,j5o,j6u,j7u
        j.put("\u1835\u1823", "\ue0c1");
        j.put("\u1835\u1824", "\ue0c1");
        j.put("\u1835\u1825", "\ue0c1");
        j.put("\u1835\u1826", "\ue0c1");
        //tail j4o,j5o,j6u,j7u
        j.put("\u1835\u1823\u0020", "\ue0c2");
        j.put("\u1835\u1824\u0020", "\ue0c2");
        j.put("\u1835\u1825\u0020", "\ue0c2");
        j.put("\u1835\u1826\u0020", "\ue0c2");
        //head j6u,j7u
        j.put("\u0020\u1835\u1825", "\ue0c3");
        j.put("\u0020\u1835\u1826", "\ue0c3");
        return j;
    }

    public static Map<String, String> getGiiY() {
        Map<String, String> y = new HashMap<>(64);
        //ya,ye
        y.put("\u0020\u1836\u1820\u0020", "\ue0c4");
        y.put("\u0020\u1836\u1821\u0020", "\ue0c4");
        //yi
        y.put("\u0020\u1836\u1822\u0020", "\ue0c5");
        //y4o,y5o
        y.put("\u0020\u1836\u1823\u0020", "\ue0c6");
        y.put("\u0020\u1836\u1824\u0020", "\ue0c6");
        //y6u,y7u
        y.put("\u0020\u1836\u1825\u0020", "\ue0c7");
        y.put("\u0020\u1836\u1826\u0020", "\ue0c7");
        //head ya,ye
        y.put("\u0020\u1836\u1820", "\ue0c8");
        y.put("\u0020\u1836\u1821", "\ue0c8");
        //middle ya,ye
        y.put("\u1836\u1820", "\ue0c9");
        y.put("\u1836\u1821", "\ue0c9");
        //tail1 ya,ye
        y.put("\u1836\u1820\u0020", "\ue0ca");
        y.put("\u1836\u1821\u0020", "\ue0ca");
        //tail2 ya,ye  180e
        y.put("\u1836\u180e\u1820\u0020", "\ue0cb");
        y.put("\u1836\u180e\u1821\u0020", "\ue0cb");
        //head yi
        y.put("\u0020\u1836\u1822", "\ue0cc");
        //middle yi
        y.put("\u1836\u1822", "\ue0cd");
        //tail yi
        y.put("\u1836\u1822\u0020", "\ue0ce");
        //head y4o,y5o
        y.put("\u0020\u1836\u1823", "\ue0cf");
        y.put("\u0020\u1836\u1824", "\ue0cf");
        //middle y4o,y5o,y6u,y7u
        y.put("\u1836\u1823", "\ue0d0");
        y.put("\u1836\u1824", "\ue0d0");
        y.put("\u1836\u1825", "\ue0d0");
        y.put("\u1836\u1826", "\ue0d0");
        //tail y4o,y5o,y6u,y7u
        y.put("\u1836\u1823\u0020", "\ue0d1");
        y.put("\u1836\u1824\u0020", "\ue0d1");
        y.put("\u1836\u1825\u0020", "\ue0d1");
        y.put("\u1836\u1826\u0020", "\ue0d1");
        //head y6u,y7u
        y.put("\u0020\u1836\u1825", "\ue0d2");
        y.put("\u0020\u1836\u1826", "\ue0d2");
        return y;
    }

    public static Map<String, String> getGiiR() {
        Map<String, String> r = new HashMap<>(64);
        //ra,re
        r.put("\u0020\u1837\u1820\u0020", "\ue0d3");
        r.put("\u0020\u1837\u1821\u0020", "\ue0d3");
        //ri
        r.put("\u0020\u1837\u1822\u0020", "\ue0d4");
        //r4o,r5o
        r.put("\u0020\u1837\u1823\u0020", "\ue0d5");
        r.put("\u0020\u1837\u1824\u0020", "\ue0d5");
        //r6u,r7u
        r.put("\u0020\u1837\u1825\u0020", "\ue0d6");
        r.put("\u0020\u1837\u1826\u0020", "\ue0d6");
        //head ra,re
        r.put("\u0020\u1837\u1820", "\ue0d7");
        r.put("\u0020\u1837\u1821", "\ue0d7");
        //middle ra,re
        r.put("\u1837\u1820", "\ue0d8");
        r.put("\u1837\u1821", "\ue0d8");
        //tail1 ra,re
        r.put("\u1837\u1820\u0020", "\ue0d9");
        r.put("\u1837\u1821\u0020", "\ue0d9");
        //tail2 ra,re  180e
        r.put("\u1837\u180e\u1820\u0020", "\ue0da");
        r.put("\u1837\u180e\u1821\u0020", "\ue0da");
        //head ri
        r.put("\u0020\u1837\u1822", "\ue0db");
        //middle ri
        r.put("\u1837\u1822", "\ue0dc");
        //tail ri
        r.put("\u1837\u1822\u0020", "\ue0dd");
        //head r4o,r5o
        r.put("\u0020\u1837\u1823", "\ue0de");
        r.put("\u0020\u1837\u1824", "\ue0de");
        //middle r4o,r5o,r6u,r7u
        r.put("\u1837\u1823", "\ue0df");
        r.put("\u1837\u1824", "\ue0df");
        r.put("\u1837\u1825", "\ue0df");
        r.put("\u1837\u1826", "\ue0df");
        //tail r4o,r5o,r6u,r7u
        r.put("\u1837\u1823\u0020", "\ue0e0");
        r.put("\u1837\u1824\u0020", "\ue0e0");
        r.put("\u1837\u1825\u0020", "\ue0e0");
        r.put("\u1837\u1826\u0020", "\ue0e0");
        //head r6u,r7u
        r.put("\u0020\u1837\u1825", "\ue0e1");
        r.put("\u0020\u1837\u1826", "\ue0e1");
        return r;
    }

    public static Map<String, String> getGiiW() {
        Map<String, String> w = new HashMap<>(64);
        //wa,we
        //wi
        //w4o,w5o
        //w6u,w7u
        return w;
    }

    public static Map<String, String> getGiiF() {
        Map<String, String> f = new HashMap<>(64);
        //fa,fe
        //fi
        //f40,f50
        //f6u,f7u
        return f;
    }

    public static Map<String, String> getGiiK() {
        Map<String, String> k = new HashMap<>(64);
        //ka,ke
        //ki
        //k4o,k5o
        //k6u,k7u
        return k;
    }

    public static Map<String, String> getGiiKH() {
        Map<String, String> kh = new HashMap<>(64);
        return kh;
    }

    public static Map<String, String> getGiiTS() {
        Map<String, String> ts = new HashMap<>(64);
        return ts;
    }

    public static Map<String, String> getGiiZ() {
        Map<String, String> z = new HashMap<>(64);
        return z;
    }

    public static Map<String, String> getGiiHH() {
        Map<String, String> hh = new HashMap<>(64);
        return hh;
    }

    public static Map<String, String> getGiiRH() {
        Map<String, String> rh = new HashMap<>(64);
        return rh;
    }

    public static Map<String, String> getGiiLH() {
        Map<String, String> rh = new HashMap<>(64);
        return rh;
    }
}
