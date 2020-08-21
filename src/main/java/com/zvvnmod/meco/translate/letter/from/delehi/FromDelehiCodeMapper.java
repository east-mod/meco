package com.zvvnmod.meco.translate.letter.from.delehi;

import com.zvvnmod.meco.translate.letter.from.CodeMapper;

import java.util.HashMap;
import java.util.Map;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/9
 * WEEK  : Sun
 * TIME  : 23:08
 */
public class FromDelehiCodeMapper {
    public static CodeMapper mapper;
    public static CodeMapper chaghMapper;
    public static CodeMapper hundiiMapper;
    public static char[] doubleIEhishig = {'\u1820', '\u1821', '\u1822', '\u1823', '\u1824'};

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
        chaghMapper.put("\u182d\u180e", "\ue005\ue005\ue143");
        //tail g
        chaghMapper.put("\u182d\u0020", "\ue032");
        chaghMapper.put("\u182d\u180e\u0020", "\ue032\ue143");
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
        hundiiMapper.put("\u182d\u180e", "\ue031\ue143");
        //tail g
        hundiiMapper.put("\u182d\u0020", "\ue033");
        hundiiMapper.put("\u182d\u180e\u0020", "\ue033\ue143");
    }

    public static void buildMapper() {
        mapper = new CodeMapper(1024);
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
        mapper.combine(getGiiD());
        mapper.combine(getGiiTR());
        mapper.combine(getGiiJ());
        mapper.combine(getGiiY());
        mapper.combine(getGiiR());
        mapper.combine(getGiiW());
        mapper.combine(getGiiF());
        mapper.combine(getGiiK());
//        mapper.combine(getGiiKH());
        mapper.combine(getGiiTS());
        mapper.combine(getGiiZ());
        mapper.combine(getGiiHH());
        mapper.combine(getGiiRH());
//        rule.combine(getGiiLH());
        mapper.combine(getDagbor());
        mapper.combine(getDevsger());
        mapper.combine(getOthers());
        mapper.combine(whatTheFuck());
    }

    public static Map<String, String> getSeparator() {
        Map<String, String> separator = new HashMap<>(16);
        separator.put("\u0020\u180B\u0020", "\ue140");
        separator.put("\u0020\u180C\u0020", "\ue141");
        separator.put("\u0020\u180D\u0020", "\ue142");
        separator.put("\u0020\u180E\u0020", "\ue143");
        separator.put("\u0020\u202f\u0020", "\u0020");

        separator.put("\u0020\u180B", "\ue140");
        separator.put("\u0020\u180C", "\ue141");
        separator.put("\u0020\u180D", "\ue142");
        separator.put("\u0020\u180E", "\ue143");
        separator.put("\u0020\u202f", "\u0020");

        separator.put("\u180B\u0020", "\ue140");
        separator.put("\u180C\u0020", "\ue141");
        separator.put("\u180D\u0020", "\ue142");
        separator.put("\u180E\u0020", "\ue143");
        separator.put("\u202f\u0020", "\u0020");

        separator.put("\u180B", "\ue140");
        separator.put("\u180C", "\ue141");
        separator.put("\u180D", "\ue142");
        separator.put("\u180E", "\ue143");
        separator.put("\u202f", "\u0020");
        return separator;
    }

    public static Map<String, String> getEhshig() {
        Map<String, String> ehshig = new HashMap<>(32);
        //a
        ehshig.put("\u0020\u1820\u0020", "\ue000\ue00c");
        ehshig.put("\u0020\u180e\u1820\u0020", "\ue00d");
        //e
        ehshig.put("\u0020\u1821\u0020", "\ue000\ue00d");
        ehshig.put("\u0020\u180e\u1821\u0020", "\ue00d");
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
        ehshig.put("\u0020\u202f\u1822", "\u0020\ue000\ue006");
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
        ehshig.put("\u1825", "\ue008");
        ehshig.put("\u1826", "\ue008");
        ehshig.put("\u1825\u180b", "\ue008\ue006");
        ehshig.put("\u1826\u180b", "\ue008\ue006");
        ehshig.put("\u1825\u180c", "\ue005\ue008\ue006");
        ehshig.put("\u1826\u180c", "\ue005\ue008\ue006");

        //tail a,e
        ehshig.put("\u1820\u0020", "\ue00c");
        ehshig.put("\u1821\u0020", "\ue00c");
        ehshig.put("\u0020\u202f\u1820\u0020", "\u0020\ue00d");
        ehshig.put("\u0020\u202f\u1821\u0020", "\u0020\ue00d");
        ehshig.put("\u180e\u1820\u0020", "\ue00d");
        ehshig.put("\u180e\u1821\u0020", "\ue00d");
        //tail i
        ehshig.put("\u1822\u0020", "\ue00e");
        //tail1 4o,5o
        ehshig.put("\u1823\u0020", "\ue011");
        ehshig.put("\u1824\u0020", "\ue011");
        ehshig.put("\u1823\u180c\u0020", "\ue011");
        ehshig.put("\u1824\u180c\u0020", "\ue011");
        //tail1 6u,7u
        ehshig.put("\u1825\u0020", "\ue011");
        ehshig.put("\u1826\u0020", "\ue011");
        ehshig.put("\u1825\u180c\u0020", "\ue011");
        ehshig.put("\u1826\u180c\u0020", "\ue011");
        return ehshig;
    }

    public static Map<String, String> getGiiN() {
        Map<String, String> n = new HashMap<>(64);
        //n
        n.put("\u0020\u1828\u0020", "\ue027");
        //head
        n.put("\u0020\u1828", "\ue027");
        //middle
        n.put("\u1828", "\ue005");
        //tail
        n.put("\u1828\u0020", "\ue00c");

        //n6u,n7u
        n.put("\u0020\u1828\u1825", "\ue027\ue008\ue006");
        n.put("\u0020\u1828\u1826", "\ue027\ue008\ue006");

        //middle na
        n.put("\u1828\u1820", "\ue028\ue005");
        //middle ne
        n.put("\u1828\u1821", "\ue028\ue005");
        //middle ni
        n.put("\u1828\u1822", "\ue028\ue006");
        //middle n4o,n5o
        n.put("\u1828\u1823", "\ue028\ue008");
        n.put("\u1828\u1824", "\ue028\ue008");

        //middle n6u,n7u
        n.put("\u1828\u1825", "\ue028\ue008");
        n.put("\u1828\u1826", "\ue028\ue008");
        n.put("\u1828\u1825\u180b", "\ue028\ue008\ue006");
        n.put("\u1828\u1826\u180b", "\ue028\ue008\ue006");
        n.put("\u1828\u1825\u180c", "\ue028\ue005\ue008\ue006");
        n.put("\u1828\u1826\u180c", "\ue028\ue005\ue008\ue006");

        //tail1 na
        n.put("\u1828\u1820\u0020", "\ue028\ue00c");
        //tail ne
        n.put("\u1828\u1821\u0020", "\ue028\ue00c");
        //tail ni
        n.put("\u1828\u1822\u0020", "\ue028\ue00e");
        //tail n4o,n5o
        n.put("\u1828\u1823\u0020", "\ue028\ue011");
        n.put("\u1828\u1824\u0020", "\ue028\ue011");

        n.put("\u1828\u1823\u180b\u0020", "\ue028\ue00f");
        n.put("\u1828\u1824\u180b\u0020", "\ue028\ue00f");
        //tail n6u,n7u
        n.put("\u1828\u1825\u0020", "\ue028\ue011");
        n.put("\u1828\u1826\u0020", "\ue028\ue011");

        n.put("\u1828\u1825\u180b\u0020", "\ue028\ue010");
        n.put("\u1828\u1826\u180b\u0020", "\ue028\ue010");

        //n+180e
        n.put("\u1828\u180e", "\ue028\ue143");
        n.put("\u1828\u180e\u0020", "\ue00c\ue143");
        //tail2 na,ne
        n.put("\u1828\u180e\u1820\u0020", "\ue077");
        n.put("\u1828\u180e\u1821\u0020", "\ue077");
        return n;
    }

    public static Map<String, String> getGiiB() {
        Map<String, String> b = new HashMap<>(64);
        //b
        b.put("\u0020\u182a\u0020", "\ue029");
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
        //bee
        b.put("\u0020\u182a\u1827\u0020", "\ue0c1");
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
        b.put("\u182a\u1821\u0020", "\ue07e");
        //head baa
        b.put("\u0020\u182a\u1827", "\ue0c2");
        //middle baa
        b.put("\u182a\u1827", "\ue0c3");
        //tail baa
        b.put("\u182a\u1827\u0020", "\ue0c4");
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
        b.put("\u182a\u1825\u180b", "\ue083\ue006");
        b.put("\u182a\u1826\u180b", "\ue083\ue006");

        //tail b4o,b5o,b6u,b7u
        b.put("\u182a\u1823\u0020", "\ue084");
        b.put("\u182a\u1824\u0020", "\ue084");
        b.put("\u182a\u1825\u0020", "\ue084");
        b.put("\u182a\u1826\u0020", "\ue084");
        b.put("\u182a\u1823\u180b\u0020", "\ue084");
        b.put("\u182a\u1824\u180b\u0020", "\ue084");
        b.put("\u182a\u1825\u180b\u0020", "\ue0cd");
        b.put("\u182a\u1826\u180b\u0020", "\ue0cd");

        //head b6u,b7u
        b.put("\u0020\u182a\u1825", "\ue082\ue006");
        b.put("\u0020\u182a\u1826", "\ue082\ue006");
        return b;
    }

    public static Map<String, String> getGiiP() {
        Map<String, String> p = new HashMap<>(64);
        //p
        p.put("\u0020\u182b\u0020", "\ue02c");
        //head
        p.put("\u0020\u182b", "\ue02c");
        //middle
        p.put("\u182b", "\ue02d");
        //tail
        p.put("\u182b\u0020", "\ue02e");
        //pa,pe
        p.put("\u0020\u182b\u1820\u0020", "\ue085");
        p.put("\u0020\u182b\u1821\u0020", "\ue085");
        //paa
        p.put("\u0020\u182b\u1827\u0020", "\ue0c5");
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
        p.put("\u182b\u1821\u0020", "\ue08b");
        //head pee
        p.put("\u0020\u182b\u1827", "\ue0c6");
        //middle pee
        p.put("\u182b\u1827", "\ue0c7");
        //middle pee
        p.put("\u182b\u1827\u0020", "\ue0c8");
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
        p.put("\u182b\u1825\u180b", "\ue090\ue006");
        p.put("\u182b\u1826\u180b", "\ue090\ue006");
        //tail p4o,p5o,p6u,p7u
        p.put("\u182b\u1823\u0020", "\ue091");
        p.put("\u182b\u1824\u0020", "\ue091");
        p.put("\u182b\u1825\u0020", "\ue091");
        p.put("\u182b\u1826\u0020", "\ue091");
        p.put("\u182b\u1823\u180b\u0020", "\ue091");
        p.put("\u182b\u1824\u180b\u0020", "\ue091");
        p.put("\u182b\u1825\u180b\u0020", "\ue0ce");
        p.put("\u182b\u1826\u180b\u0020", "\ue0ce");
        //head p6u,p7u
        p.put("\u0020\u182b\u1825", "\ue08f\ue006");
        p.put("\u0020\u182b\u1826", "\ue08f\ue006");
        return p;
    }

    public static Map<String, String> getGiiH() {
        Map<String, String> h = new HashMap<>(64);
        //h
        h.put("\u0020\u182c\u0020", "\ue02f");
        //head
        h.put("\u0020\u182c", "\ue030");
        h.put("\u0020\u182c\u180d", "\ue030");
        //middle
        h.put("\u182c\u180d", "\ue031");
        //tail
        h.put("\u182c\u180c\u0020", "\ue033");
        h.put("\u180c\u180d\u0020", "\ue032");
        //ha
        h.put("\u0020\u182c\u1820\u0020", "\ue02f\ue00c");
        //he
        h.put("\u0020\u182c\u1821\u0020", "\ue094\ue00d");
        //hee
        h.put("\u0020\u182c\u1827\u0020", "\ue0bd");
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
        //head hee
        h.put("\u0020\u182c\u1827", "\ue0be");
        //middle hee
        h.put("\u182c\u1827", "\ue0bf");
        //tail hee
        h.put("\u182c\u1827\u0020", "\ue0c0");
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
        //middle h4o,h5o
        h.put("\u182c\u1823", "\ue005\ue005\ue008");
        h.put("\u182c\u1824", "\ue005\ue005\ue008");
        //middle h6u,h7u
        h.put("\u182c\u1825", "\ue09b");
        h.put("\u182c\u1826", "\ue09b");
        h.put("\u182c\u1825\u180b", "\ue09b\ue006");
        h.put("\u182c\u1826\u180b", "\ue09b\ue006");
        h.put("\u182c\u1825\u180c", "\ue005\ue005\ue005\ue008\ue006");
        h.put("\u182c\u1826\u180c", "\ue005\ue005\ue005\ue008\ue006");

        //tail h4o,h5o
        h.put("\u182c\u1823\u0020", "\ue005\ue005\ue011");
        h.put("\u182c\u1824\u0020", "\ue005\ue005\ue011");
        //tail h6u,h7u
        h.put("\u182c\u1825\u0020", "\ue09c");
        h.put("\u182c\u1826\u0020", "\ue09c");

        h.put("\u182c\u1823\u180b\u0020", "\ue005\ue005\ue00f");
        h.put("\u182c\u1824\u180b\u0020", "\ue005\ue005\ue00f");
        h.put("\u182c\u1825\u180b\u0020", "\ue0cf");
        h.put("\u182c\u1826\u180b\u0020", "\ue0cf");

        h.put("\u0020\u182c\u1823\u180b\u0020", "\ue02f\ue00f");
        h.put("\u0020\u182c\u1824\u180b\u0020", "\ue02f\ue00f");
        h.put("\u0020\u182c\u1825\u180b\u0020", "\ue093");
        h.put("\u0020\u182c\u1826\u180b\u0020", "\ue093");
        return h;
    }

    public static Map<String, String> getGiiG() {
        Map<String, String> g = new HashMap<>(64);
        //g
        g.put("\u0020\u182d\u0020", "\ue034");
        //head
        g.put("\u0020\u182d", "\ue030");
        g.put("\u0020\u182d\u180d", "\ue030");
        //middle
        g.put("\u182d\u180d", "\ue031");
        //tail
        g.put("\u182d\u180c\u0020", "\ue033");
        g.put("\u182d\u180d\u0020", "\ue032");
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
        //tail1 ga
        g.put("\u182d\u1820\u0020", "\ue09d");
        //tail2 ga
        g.put("\u182d\u180e\u1820\u0020", "\ue09d");
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
        g.put("\u182d\u1825\u180b", "\ue09b\ue006");
        g.put("\u182d\u1826\u180b", "\ue09b\ue006");
        g.put("\u182d\u1825\u180c", "\ue035\ue005\ue008\ue006");
        g.put("\u182d\u1826\u180c", "\ue035\ue005\ue008\ue006");
        //tail g6u,g7u
        g.put("\u182d\u1825\u0020", "\ue09c");
        g.put("\u182d\u1826\u0020", "\ue09c");

        g.put("\u182d\u1823\u180b\u0020", "\ue035\ue00f");
        g.put("\u182d\u1824\u180b\u0020", "\ue035\ue00f");
        g.put("\u182d\u1825\u180b\u0020", "\ue0cf");
        g.put("\u182d\u1826\u180b\u0020", "\ue0cf");

        g.put("\u0020\u182d\u1823\u180b\u0020", "\ue034\ue00f");
        g.put("\u0020\u182d\u1824\u180b\u0020", "\ue034\ue00f");
        g.put("\u0020\u182d\u1825\u180b\u0020", "\ue093");
        g.put("\u0020\u182d\u1826\u180b\u0020", "\ue093");
        return g;
    }

    public static Map<String, String> getGiiM() {
        Map<String, String> m = new HashMap<>(16);
        //m
        m.put("\u0020\u182E\u0020", "\ue036");
        //head
        m.put("\u0020\u182E", "\ue036");
        //middle
        m.put("\u182E", "\ue037");
        //tail
        m.put("\u182E\u0020", "\ue038");
        //tail2 ma
        m.put("\u182e\u180e", "\ue037");
        m.put("\u182e\u180e\u1820\u0020", "\ue038\ue00d");
        //tail2 me
        m.put("\u182e\u180e\u1821\u0020", "\ue038\ue00d");

        //m6u,m7u
        m.put("\u0020\u182e\u1825", "\ue036\ue008\ue006");
        m.put("\u0020\u182e\u1826", "\ue036\ue008\ue006");

        return m;
    }

    public static Map<String, String> getGiiL() {
        Map<String, String> l = new HashMap<>(16);
        //l
        l.put("\u0020\u182f\u0020", "\ue039");
        //head
        l.put("\u0020\u182f", "\ue039");
        //middle
        l.put("\u182f", "\ue03a");
        //tail
        l.put("\u182f\u0020", "\ue03b");
        //tail la
        l.put("\u182f\u180e", "\ue03a");
        l.put("\u182f\u180e\u1820\u0020", "\ue03b\ue00d");
        //tail le
        l.put("\u182f\u180e\u1821\u0020", "\ue03b\ue00d");

        //l6u,l7u
        l.put("\u0020\u182f\u1825", "\ue039\ue008\ue006");
        l.put("\u0020\u182f\u1826", "\ue039\ue008\ue006");

        return l;
    }

    public static Map<String, String> getGiiS() {
        Map<String, String> s = new HashMap<>(8);
        //s
        s.put("\u0020\u1830\u0020", "\ue03c");
        //head
        s.put("\u0020\u1830", "\ue03c");
        //middle
        s.put("\u1830", "\ue03d");
        //tail
        s.put("\u1830\u0020", "\ue03e");

        //s6u,s7u
        s.put("\u0020\u1830\u1825", "\ue03c\ue008\ue006");
        s.put("\u0020\u1830\u1826", "\ue03c\ue008\ue006");

        return s;
    }

    public static Map<String, String> getGiiSH() {
        Map<String, String> sh = new HashMap<>(8);
        //sh
        sh.put("\u0020\u1831\u0020", "\ue03f");
        //head
        sh.put("\u0020\u1831", "\ue03f");
        //middle
        sh.put("\u1831", "\ue040");
        //tail
        sh.put("\u1831\u0020", "\ue041");

        //sh6u,sh7u
        sh.put("\u0020\u1831\u1825", "\ue03f\ue008\ue006");
        sh.put("\u0020\u1831\u1826", "\ue03f\ue008\ue006");

        return sh;
    }

    public static Map<String, String> getGiiT() {
        Map<String, String> t = new HashMap<>(16);
        //head
        t.put("\u0020\u1832\u0020", "\ue042");
        //head
        t.put("\u0020\u1832", "\ue042");
        //middle1
        t.put("\u1832", "\ue046");
        //middle2
        t.put("\u1832\u180b", "\ue043");
        //tail
        t.put("\u1832\u0020", "\ue044");
        t.put("\u1832\u180b\u0020", "\ue044");

        //t6u,t7u
        t.put("\u0020\u1832\u1825", "\ue042\ue008\ue006");
        t.put("\u0020\u1832\u1826", "\ue042\ue008\ue006");

        return t;
    }

    public static Map<String, String> getGiiD() {
        Map<String, String> d = new HashMap<>(64);
        //d
        d.put("\u0020\u1833\u0020", "\ue045");
        //head
        d.put("\u0020\u1833", "\ue045");
        d.put("\u0020\u202f\u1833", "\u0020\ue045");
        d.put("\u0020\u1833\u180b", "\ue045");
        d.put("\u0020\u202f\u1833\u180b", "\ue045");
        //middle
        d.put("\u1833", "\ue008\ue005");
        d.put("\u1833\u180b", "\ue046");
        //tail
        d.put("\u1833\u0020", "\ue008\ue00c");
        d.put("\u1833\u180b\u0020", "\ue049");

        //da,de
        d.put("\u0020\u1833\u1820\u0020", "\ue042\ue00c");
        d.put("\u0020\u1833\u1821\u0020", "\ue042\ue00c");
        d.put("\u0020\u1833\u180b\u1820\u0020", "\ue045\ue00c");
        d.put("\u0020\u1833\u180b\u1821\u0020", "\ue045\ue00c");
        //di
        d.put("\u0020\u1833\u1822\u0020", "\ue042\ue00e");
        d.put("\u0020\u1833\u180b\u1822\u0020", "\ue045\ue00e");
        //d4o,d5o
        d.put("\u0020\u1833\u1823\u0020", "\ue042\ue011");
        d.put("\u0020\u1833\u1824\u0020", "\ue042\ue011");
        d.put("\u0020\u1833\u180b\u1823\u0020", "\ue045\ue011");
        d.put("\u0020\u1833\u180b\u1824\u0020", "\ue045\ue011");
        //d6u,d7u
        d.put("\u0020\u1833\u1825\u0020", "\ue042\ue011");
        d.put("\u0020\u1833\u1826\u0020", "\ue042\ue011");
        d.put("\u0020\u1833\u180b\u1825\u0020", "\ue045\ue011");
        d.put("\u0020\u1833\u180b\u1826\u0020", "\ue045\ue011");

        //head da,de
        d.put("\u0020\u1833\u1820", "\ue042\ue005");
        d.put("\u0020\u1833\u1821", "\ue042\ue005");
        d.put("\u0020\u1833\u180b\u1820", "\ue045\ue005");
        d.put("\u0020\u1833\u180b\u1821", "\ue045\ue005");
        //head di
        d.put("\u0020\u1833\u1822", "\ue042\ue006");
        d.put("\u0020\u1833\u180b\u1822", "\ue045\ue006");
        //head d4o,d5o
        d.put("\u0020\u1833\u1823", "\ue042\ue008");
        d.put("\u0020\u1833\u1824", "\ue042\ue008");
        d.put("\u0020\u1833\u180b\u1823", "\ue045\ue008");
        d.put("\u0020\u1833\u180b\u1824", "\ue045\ue008");
        //head d6u,d7u
        d.put("\u0020\u1833\u1825", "\ue042\ue008\ue006");
        d.put("\u0020\u1833\u1826", "\ue042\ue008\ue006");
        d.put("\u0020\u1833\u180b\u1825", "\ue045\ue008\ue006");
        d.put("\u0020\u1833\u180b\u1826", "\ue045\ue008\ue006");

        //middle da,de
        d.put("\u1833\u1820", "\ue046\ue005");
        d.put("\u1833\u1821", "\ue046\ue005");
        d.put("\u1833\u180b\u1820", "\ue046\ue005");
        d.put("\u1833\u180b\u1821", "\ue046\ue005");
        //middle di
        d.put("\u1833\u1822", "\ue046\ue006");
        d.put("\u1833\u180b\u1822", "\ue046\ue006");
        //middle d4o,d5o,d6u,d7u
        d.put("\u1833\u1823", "\ue046\ue008");
        d.put("\u1833\u1824", "\ue046\ue008");
        d.put("\u1833\u1825", "\ue046\ue008");
        d.put("\u1833\u1826", "\ue046\ue008");
        d.put("\u1833\u180b\u1823", "\ue046\ue008");
        d.put("\u1833\u180b\u1824", "\ue046\ue008");
        d.put("\u1833\u180b\u1825", "\ue046\ue008");
        d.put("\u1833\u180b\u1826", "\ue046\ue008");

        d.put("\u1833\u1825\u180b", "\ue046\ue008\ue006");
        d.put("\u1833\u1826\u180b", "\ue046\ue008\ue006");
        d.put("\u1833\u1825\u180c", "\ue008\ue005\ue005\ue008\ue006");
        d.put("\u1833\u1826\u180c", "\ue008\ue005\ue005\ue008\ue006");

        //tail da,de
        d.put("\u1833\u1820\u0020", "\ue046\ue00c");
        d.put("\u1833\u1821\u0020", "\ue046\ue00c");
        d.put("\u1833\u180b\u1820\u0020", "\ue046\ue00c");
        d.put("\u1833\u180b\u1821\u0020", "\ue046\ue00c");
        //tail di
        d.put("\u1833\u1822\u0020", "\ue046\ue00e");
        d.put("\u1833\u180b\u1822\u0020", "\ue046\ue00e");
        //tail d4o,d5o,d6u,d7u
        d.put("\u1833\u1823\u0020", "\ue046\ue011");
        d.put("\u1833\u1824\u0020", "\ue046\ue011");
        d.put("\u1833\u1825\u0020", "\ue046\ue011");
        d.put("\u1833\u1826\u0020", "\ue046\ue011");
        d.put("\u1833\u180b\u1823\u0020", "\ue046\ue011");
        d.put("\u1833\u180b\u1824\u0020", "\ue046\ue011");
        d.put("\u1833\u180b\u1825\u0020", "\ue046\ue011");
        d.put("\u1833\u180b\u1826\u0020", "\ue046\ue011");
        return d;
    }

    public static Map<String, String> getGiiTR() {
        Map<String, String> tr = new HashMap<>(8);
        //tr
        tr.put("\u0020\u1834\u0020", "\ue04a");
        //head
        tr.put("\u0020\u1834", "\ue04a");
        //middle
        tr.put("\u1834", "\ue04b");
        //tail
        tr.put("\u1834\u0020", "\ue04c");

        //tr6u,tr7u
        tr.put("\u0020\u1834\u1825", "\ue04a\ue008\ue006");
        tr.put("\u0020\u1834\u1826", "\ue04a\ue008\ue006");

        return tr;
    }

    public static Map<String, String> getGiiJ() {
        Map<String, String> j = new HashMap<>(8);
        //j
        j.put("\u0020\u1835\u0020", "\ue04d");
        //head
        j.put("\u0020\u1835", "\ue04d");
        //middle
        j.put("\u1835", "\ue04e");
        //tail
        j.put("\u1835\u0020", "\ue04f");

        //ya,ye ??
        j.put("\u0020\u1835\u180e\u1820\u0020", "\ue01a\ue00d");
        j.put("\u0020\u1835\u180e\u1821\u0020", "\ue01a\ue00d");

        //tr6u,tr7u
        j.put("\u0020\u1835\u1825", "\ue04d\ue008\ue006");
        j.put("\u0020\u1835\u1826", "\ue04d\ue008\ue006");

        return j;
    }

    public static Map<String, String> getGiiY() {
        Map<String, String> y = new HashMap<>(8);
        //y
        y.put("\u0020\u1836\u0020", "\ue050");
        //head
        y.put("\u0020\u1836", "\ue050");
        y.put("\u0020\u202f\u1836\u180b", "\u0020\ue050");
        //middle
        y.put("\u1836", "\ue051");
        //tail
        y.put("\u1836\u0020", "\ue00e");
        //tail2 ya
        y.put("\u1836\u180e", "\ue051");
        y.put("\u1836\u180e\u1820\u0020", "\ue00e\ue00d");
        //tail2 ye
        y.put("\u1836\u180e\u1821\u0020", "\ue00e\ue00d");

        //y6u,y7u
        y.put("\u0020\u1836\u1825", "\ue050\ue008\ue006");
        y.put("\u0020\u1836\u1826", "\ue050\ue008\ue006");
        return y;
    }

    public static Map<String, String> getGiiR() {
        Map<String, String> r = new HashMap<>(16);
        //r
        r.put("\u0020\u1837\u0020", "\ue053");
        //head
        r.put("\u0020\u1837", "\ue053");
        //middle
        r.put("\u1837", "\ue054");
        //tail
        r.put("\u1837\u0020", "\ue055");
        //tail ra
        r.put("\u1837\u180e", "\ue054");
        r.put("\u1837\u180e\u1820\u0020", "\ue055\ue00d");
        //tail re
        r.put("\u1837\u180e\u1821\u0020", "\ue055\ue00d");

        //r6u,r7u
        r.put("\u0020\u1837\u1825", "\ue053\ue008\ue006");
        r.put("\u0020\u1837\u1826", "\ue053\ue008\ue006");
        return r;
    }

    public static Map<String, String> getGiiW() {
        Map<String, String> w = new HashMap<>(8);
        //w
        w.put("\u0020\u1838\u0020", "\ue056");
        //head
        w.put("\u0020\u1838", "\ue056");
        //middle
        w.put("\u1838", "\ue057");
        //tail
        w.put("\u1838\u0020", "\ue058");

        //w6u,w7u
        w.put("\u0020\u1838\u1825", "\ue056\ue008\ue006");
        w.put("\u0020\u1838\u1826", "\ue056\ue008\ue006");
        return w;
    }

    public static Map<String, String> getGiiF() {
        Map<String, String> f = new HashMap<>(64);
        //f
        f.put("\u0020\u1839\u0020", "\ue059");
        //head
        f.put("\u0020\u1839", "\ue059");
        //middle
        f.put("\u1839", "\ue05a");
        //tail
        f.put("\u1839\u0020", "\ue05b");

        //fa
        f.put("\u0020\u1839\u1820\u0020", "\ue09e");
        //fe
        f.put("\u0020\u1839\u1821\u0020", "\ue09e");
        //fee
        f.put("\u0020\u1839\u1827\u0020", "\ue0c9");
        //fi
        f.put("\u0020\u1839\u1822\u0020", "\ue09f");
        //f4o
        f.put("\u0020\u1839\u1823\u0020", "\ue0a0");
        //f5o
        f.put("\u0020\u1839\u1824\u0020", "\ue0a0");
        //f6u
        f.put("\u0020\u1839\u1825\u0020", "\ue0a1");
        //f7u
        f.put("\u0020\u1839\u1826\u0020", "\ue0a1");
        //head fa,fe
        f.put("\u0020\u1839\u1820", "\ue0a2");
        f.put("\u0020\u1839\u1821", "\ue0a2");
        //middle fa,fe
        f.put("\u1839\u1820", "\ue0a3");
        f.put("\u1839\u1821", "\ue0a3");
        //tail fa,fe
        f.put("\u1839\u1820\u0020", "\ue0a4");
        f.put("\u1839\u1821\u0020", "\ue0a4");
        //head fee
        f.put("\u0020\u1839\u1827", "\ue0ca");
        //middle fee
        f.put("\u1839\u1827", "\ue0cb");
        //tail fee
        f.put("\u1839\u1827\u0020", "\ue0cc");
        //head fi
        f.put("\u0020\u1839\u1822", "\ue0a5");
        //middle fi
        f.put("\u1839\u1822", "\ue0a6");
        //tail fi
        f.put("\u1839\u1822\u0020", "\ue0a7");
        //head f4o,f5o
        f.put("\u0020\u1839\u1823", "\ue0a8");
        f.put("\u0020\u1839\u1824", "\ue0a8");
        //middle f4o,f5o,f6u,f7u
        f.put("\u1839\u1823", "\ue0a9");
        f.put("\u1839\u1824", "\ue0a9");
        f.put("\u1839\u1825", "\ue0a9");
        f.put("\u1839\u1826", "\ue0a9");

        f.put("\u1839\u1825\u180b", "\ue0a9\ue006");
        f.put("\u1839\u1826\u180b", "\ue0a9\ue006");

        //tail f4o,f5o,f6u,f7u
        f.put("\u1839\u1823\u0020", "\ue0aa");
        f.put("\u1839\u1824\u0020", "\ue0aa");
        f.put("\u1839\u1825\u0020", "\ue0aa");
        f.put("\u1839\u1826\u0020", "\ue0aa");
        //head f6u,f7u
        f.put("\u0020\u1839\u1825", "\ue0a8\ue006");
        f.put("\u0020\u1839\u1826", "\ue0a8\ue006");

        f.put("\u1839\u1823\u180b\u0020", "\ue0aa");
        f.put("\u1839\u1824\u180b\u0020", "\ue0aa");
        f.put("\u1839\u1825\u180b\u0020", "\ue0d0");
        f.put("\u1839\u1826\u180b\u0020", "\ue0d0");
        return f;
    }

    public static Map<String, String> getGiiK() {
        Map<String, String> k = new HashMap<>(64);
        //k
        k.put("\u0020\u183a\u0020", "\ue05c");
        //head
        k.put("\u0020\u183a", "\ue05c");
        //middle
        k.put("\u183a", "\ue05d");
        //tail
        k.put("\u183a\u0020", "\ue05e");

        //ka,ke
        k.put("\u0020\u183a\u1820\u0020", "\ue0ab");
        k.put("\u0020\u183a\u1821\u0020", "\ue0ab");
        //kee
        k.put("\u0020\u183a\u1827\u0020", "\ue0ac");
        //ki
        k.put("\u0020\u183a\u1822\u0020", "\ue0ad");
        //k4o,k5o
        k.put("\u0020\u183a\u1823\u0020", "\ue0ae");
        k.put("\u0020\u183a\u1824\u0020", "\ue0ae");
        //k6u,k7u
        k.put("\u0020\u183a\u1825\u0020", "\ue0af");
        k.put("\u0020\u183a\u1826\u0020", "\ue0af");
        //head ka,ke
        k.put("\u0020\u183a\u1820", "\ue0b0");
        k.put("\u0020\u183a\u1821", "\ue0b0");
        //middle ka,ke
        k.put("\u183a\u1820", "\ue0b1");
        k.put("\u183a\u1821", "\ue0b1");
        //tail ka,ke
        k.put("\u183a\u1820\u0020", "\ue0b2");
        k.put("\u183a\u1821\u0020", "\ue0b2");
        //head kee
        k.put("\u0020\u183a\u1827", "\ue0b3");
        //middle kee
        k.put("\u183a\u1827", "\ue0b4");
        //tail kee
        k.put("\u183a\u1827\u0020", "\ue0b5");
        //head ki
        k.put("\u0020\u183a\u1822", "\ue0b6");
        //middle ki
        k.put("\u183a\u1822", "\ue0b7");
        //tail ki
        k.put("\u183a\u1822\u0020", "\ue0b8");
        //head k4o,k5o
        k.put("\u0020\u183a\u1823", "\ue0b9");
        k.put("\u0020\u183a\u1824", "\ue0b9");
        //middle k4o,k5o,k6u,k7u
        k.put("\u183a\u1823", "\ue0ba");
        k.put("\u183a\u1824", "\ue0ba");
        k.put("\u183a\u1825", "\ue0ba");
        k.put("\u183a\u1826", "\ue0ba");

        k.put("\u183a\u1825\u180b", "\ue0ba\ue006");
        k.put("\u183a\u1826\u180b", "\ue0ba\ue006");

        //tail k4o,k5o
        k.put("\u183a\u1823\u0020", "\ue0bb");
        k.put("\u183a\u1824\u0020", "\ue0bb");
        //tail k6u,k7u
        k.put("\u183a\u1825\u0020", "\ue0bc");
        k.put("\u183a\u1826\u0020", "\ue0bc");
        //head k6u,k7u
        k.put("\u0020\u183a\u1825", "\ue0b9\ue006");
        k.put("\u0020\u183a\u1826", "\ue0b9\ue006");
        return k;
    }

    public static Map<String, String> getGiiTS() {
        Map<String, String> ts = new HashMap<>(8);
        //ts
        ts.put("\u0020\u183c\u0020", "\ue05f");
        //head
        ts.put("\u0020\u183c", "\ue05f");
        //middle
        ts.put("\u183c", "\ue060");
        //tail
        ts.put("\u183c\u0020", "\ue061");

        //ts6u,ts7u
        ts.put("\u0020\u183c\u1825", "\ue05f\ue008\ue006");
        ts.put("\u0020\u183c\u1826", "\ue05f\ue008\ue006");
        return ts;
    }

    public static Map<String, String> getGiiZ() {
        Map<String, String> z = new HashMap<>(8);
        //z
        z.put("\u0020\u183d\u0020", "\ue062");
        //head
        z.put("\u0020\u183d", "\ue062");
        //middle
        z.put("\u183d", "\ue063");
        //tail
        z.put("\u183d\u0020", "\ue064");

        //ts6u,ts7u
        z.put("\u0020\u183d\u1825", "\ue062\ue008\ue006");
        z.put("\u0020\u183d\u1826", "\ue062\ue008\ue006");
        return z;
    }

    public static Map<String, String> getGiiHH() {
        Map<String, String> hh = new HashMap<>(8);
        //hh
        hh.put("\u0020\u183e\u0020", "\ue065");
        //head
        hh.put("\u0020\u183e", "\ue065");
        //middle
        hh.put("\u183e", "\ue066");
        //tail
        hh.put("\u183e\u0020", "\ue067");

        //ts6u,ts7u
        hh.put("\u0020\u183e\u1825", "\ue065\ue008\ue006");
        hh.put("\u0020\u183e\u1826", "\ue065\ue008\ue006");
        return hh;
    }

    public static Map<String, String> getGiiRH() {
        Map<String, String> rh = new HashMap<>(8);
        //rh
        rh.put("\u0020\u183f\u0020", "\ue068");
        //head
        rh.put("\u0020\u183f", "\ue068");
        //middle
        rh.put("\u183f", "\ue068");
        //tail
        rh.put("\u183f\u0020", "\ue068");

        //ts6u,ts7u
        rh.put("\u0020\u183f\u1825", "\ue068\ue008\ue006");
        rh.put("\u0020\u183f\u1826", "\ue068\ue008\ue006");
        return rh;
    }

    public static Map<String, String> getDagbor() {
        Map<String, String> dagbor = new HashMap<>(32);
        //i
        dagbor.put("\u0020\u1822\u180b\u0020", "\ue01a");
        dagbor.put("\u0020\u202f\u1822\u0020", "\u0020\ue01a");
        dagbor.put("\u0020\u1835\u180e", "\ue01a");
        dagbor.put("\u0020\u1835\u180e\u0020", "\ue01a");

        //etre
        dagbor.put("\u0020\u202f\u1820", "\u0020\ue000");
        dagbor.put("\u0020\u202f\u1820\u180b", "\u0020\ue000");
        dagbor.put("\u0020\u1820\u180b", "\ue000");

        //ood
        dagbor.put("\u0020\u202f\u1823", "\u0020\ue000\ue008");
        dagbor.put("\u0020\u202f\u1824", "\u0020\ue000\ue008");
        dagbor.put("\u0020\u202f\u1825", "\u0020\ue000\ue008\ue006");
        dagbor.put("\u0020\u202f\u1826", "\u0020\ue000\ue008\ue006");
        dagbor.put("\u0020\u202f\u1824\u1833\u0020", "\u0020\ue001\ue008\ue00c");

        //on
        dagbor.put("\u0020\u202f\u1823\u180b", "\u0020\ue001");
        dagbor.put("\u0020\u202f\u1824\u180b", "\u0020\ue001");
        dagbor.put("\u0020\u202f\u1825\u180b", "\u0020\ue001");
        dagbor.put("\u0020\u202f\u1826\u180b", "\u0020\ue001");
        dagbor.put("\u0020\u202f\u1824\u1828\u0020", "\u0020\ue001\ue00c");
        dagbor.put("\u0020\u202f\u1826\u1828\u0020", "\u0020\ue001\ue00c");

        //nu
        dagbor.put("\u0020\u202f\u1823\u180b\u0020", "\u0020\ue01b");
        dagbor.put("\u0020\u202f\u1824\u180b\u0020", "\u0020\ue01b");
        dagbor.put("\u0020\u202f\u1825\u180b\u0020", "\u0020\ue01b");
        dagbor.put("\u0020\u202f\u1826\u180b\u0020", "\u0020\ue000\ue011");

        dagbor.put("\u0020\u202f\u1824\u180c\u0020", "\u0020\ue01b");
        dagbor.put("\u0020\u202f\u1826\u180c\u0020", "\u0020\ue01b");

        dagbor.put("\u0020\u202f\u1824\u0020", "\u0020\ue01b");
        dagbor.put("\u0020\u202f\u1826\u0020", "\u0020\ue01b");

        //start yin,gi
        dagbor.put("\u0020\u1836\u180b", "\ue002");
        dagbor.put("\u0020\u1822\u180b", "\ue002");
        dagbor.put("\u0020\u202f\u1836", "\u0020\ue002");

        dagbor.put("\u0020\u202f\u1836\u180b\u1822", "\u0020\ue002\ue006");

        //gi
        dagbor.put("\u0020\u202f\u1836\u180b\u1822\u0020", "\u0020\ue002\ue00e");
        dagbor.put("\u0020\u202f\u1822\u1822\u0020", "\u0020\ue002\ue00e");
        return dagbor;
    }

    public static Map<String, String> getDevsger() {
        Map<String, String> devsger = new HashMap<>(64);
        //eng
        devsger.put("\u0020\u1829\u0020", "\ue015");
        devsger.put("\u0020\u1829", "\ue015");
        devsger.put("\u1829", "\ue015");
        devsger.put("\u1829\u0020", "\ue016");

        //i
        devsger.put("\u1836\u180b", "\ue006");
        devsger.put("\u1822\u180c", "\ue006\ue006");
        devsger.put("\u1822\u180d", "\ue006");
        devsger.put("\u180d\u1822", "\ue006");
        return devsger;
    }

    public static Map<String, String> getOthers() {
        Map<String, String> others = new HashMap<>(128);
        // (4o,5o,6u,7u)*180b
        //head o
        others.put("\u0020\u1823\u180b", "\ue001");
        others.put("\u0020\u1824\u180b", "\ue001");
        others.put("\u0020\u1825\u180b", "\ue001");
        others.put("\u0020\u1826\u180b", "\ue001");
        //middle o
        others.put("\u1823\u180b", "\ue008");
        others.put("\u1824\u180b", "\ue008");
        //tail2 4o,5o
        others.put("\u1823\u180b\u0020", "\ue00f");
        others.put("\u1824\u180b\u0020", "\ue00f");
        //tail2 6u,7u
        others.put("\u1825\u180b\u0020", "\ue010");
        others.put("\u1826\u180b\u0020", "\ue010");
        //nu
        others.put("\u0020\u1823\u180b\u0020", "\ue01b");
        others.put("\u0020\u1824\u180b\u0020", "\ue01b");
        others.put("\u0020\u1825\u180b\u0020", "\ue01b");
        //eu
        others.put("\u0020\u1826\u180b\u0020", "\ue000\ue011");

        others.put("\u202f\u1824\u1824", "\ue001\ue011");
        return others;
    }

    public static Map<String, String> whatTheFuck() {
        Map<String, String> fuck = new HashMap<>(128);
        //ee
        fuck.put("\u0020\u1827\u0020", "\ue000\ue058");
        //head ee
        fuck.put("\u0020\u1827", "\ue000\ue057");
        //middle ee
        fuck.put("\u1827", "\ue057");
        //tail ee
        fuck.put("\u1827\u0020", "\ue058");
        return fuck;
    }

}
