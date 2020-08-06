package com.zvvnmod.meco.transformer.delehi;

import com.zvvnmod.meco.common.MecoException;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/5
 * WEEK  : Wed
 * TIME  : 19:42
 */
public class FromDelehiConvertRule {
    public static Map<String, Character> rule;

    static {
        rule = new HashMap<>(2048);
        combine(getEhshig());
        combine(getGiiN());
        combine(getGiiB());
        combine(getGiiP());
        combine(getGiiH());
        combine(getGiiG());
        combine(getGiiM());
        combine(getGiiL());
        combine(getGiiS());
        combine(getGiiSH());
    }

    public static void combine(Map<String, Character> subRule) {
        if (CollectionUtils.isEmpty(subRule)) {
            return;
        }
        for (Map.Entry<String, Character> entry : subRule.entrySet()) {
            if (rule.containsKey(entry.getKey())) {
                throw new MecoException(DelehiState.DUPLICATE_KEY);
            }
            rule.put(entry.getKey(), entry.getValue());
        }
    }

    public static Map<String, Character> getEhshig() {
        Map<String, Character> ehshig = new HashMap<>(64);
        //a
        ehshig.put("\u0020\u1820\u0020", '\ue000');
        //e
        ehshig.put("\u0020\u1821\u0020", '\ue001');
        //i
        ehshig.put("\u0020\u1822\u0020", '\ue002');
        //4o
        ehshig.put("\u0020\u1823\u0020", '\ue003');
        //5o
        ehshig.put("\u0020\u1824\u0020", '\ue003');
        //6u
        ehshig.put("\u0020\u1825\u0020", '\ue004');
        //7u
        ehshig.put("\u0020\u1826\u0020", '\ue004');
        //top,a
        ehshig.put("\u0020\u1820", '\ue005');
        //top,e
        ehshig.put("\u0020\u1821", '\ue006');
        //top,i
        ehshig.put("\u0020\u1822", '\ue007');
        //top,4o
        ehshig.put("\u0020\u1823", '\ue008');
        //top,5o
        ehshig.put("\u0020\u1824", '\ue008');
        //top,6u
        ehshig.put("\u0020\u1825", '\ue009');
        //top,7u
        ehshig.put("\u0020\u1826", '\ue009');
        return ehshig;
    }

    public static Map<String, Character> getGiiN() {
        Map<String, Character> n = new HashMap<>(64);
        //na,ne
        n.put("\u0020\u1828\u1820\u0020", '\ue00a');
        //ni
        n.put("\u0020\u1828\u1822\u0020", '\ue00b');
        //n4o
        n.put("\u0020\u1828\u1823\u0020", '\ue00c');
        //n5o
        n.put("\u0020\u1828\u1824\u0020", '\ue00c');
        //n6u
        n.put("\u0020\u1828\u1825\u0020", '\ue00d');
        //n7u
        n.put("\u0020\u1828\u1826\u0020", '\ue00d');
        //head na
        n.put("\u0020\u1828\u1820", '\ue00e');
        //head ne
        n.put("\u0020\u1828\u1821", '\ue00e');
        //middle na
        n.put("\u1828\u1820", '\ue00f');
        //middle ne
        n.put("\u1828\u1821", '\ue00f');
        //tail1 na
        n.put("\u1828\u1820\u0020", '\ue010');
        //tail2 na
        n.put("\u1828\u180E\u1820\u0020", '\ue011');
        //tail1 ne
        n.put("\u1828\u1821\u0020", '\ue010');
        //tail2 ne
        n.put("\u1828\u180E\u1821\u0020", '\ue011');
        //head ni
        n.put("\u0020\u1828\u1822", '\ue012');
        //middle ni
        n.put("\u1828\u1822", '\ue013');
        //tail ni
        n.put("\u1828\u1822\u0020", '\ue014');
        //head n4o
        n.put("\u0020\u1828\u1823", '\ue015');
        //head n5o
        n.put("\u0020\u1828\u1824", '\ue015');
        //middle n4o
        n.put("\u1828\u1823", '\ue016');
        //middle n5o
        n.put("\u1828\u1824", '\ue016');
        //middle n6u
        n.put("\u1828\u1825", '\ue016');
        //middle n7u
        n.put("\u1828\u1826", '\ue016');
        //tail n4o
        n.put("\u1828\u1823\u0020", '\ue017');
        //tail n5o
        n.put("\u1828\u1824\u0020", '\ue017');
        //tail n6u
        n.put("\u1828\u1825\u0020", '\ue017');
        //tail n7u
        n.put("\u1828\u1826\u0020", '\ue017');
        //head n6u
        n.put("\u0020\u1828\u1825", '\ue018');
        //head n7u
        n.put("\u0020\u1828\u1826", '\ue018');
        return n;
    }

    public static Map<String, Character> getGiiB() {
        Map<String, Character> b = new HashMap<>(64);
        //ba
        b.put("\u0020\u182a\u1820\u0020", '\ue019');
        //be
        b.put("\u0020\u182a\u1821\u0020", '\ue019');
        //bi
        b.put("\u0020\u182a\u1822\u0020", '\ue01a');
        //b4o
        b.put("\u0020\u182a\u1823\u0020", '\ue01b');
        //b5o
        b.put("\u0020\u182a\u1824\u0020", '\ue01b');
        //b6u
        b.put("\u0020\u182a\u1825\u0020", '\ue01c');
        //b7u
        b.put("\u0020\u182a\u1826\u0020", '\ue01c');
        //head ba,be
        b.put("\u0020\u182a\u1820", '\ue01d');
        b.put("\u0020\u182a\u1821", '\ue01d');
        //middle ba,be
        b.put("\u182a\u1820", '\ue01e');
        b.put("\u182a\u1821", '\ue01e');
        //tail ba,be
        b.put("\u182a\u1820\u0020", '\ue01f');
        b.put("\u182a\u1820\u0021", '\ue01f');
        //head bi
        b.put("\u0020\u182a\u1822", '\ue020');
        //middle bi
        b.put("\u182a\u1822", '\ue021');
        //tail bi
        b.put("\u182a\u1822\u0020", '\ue022');
        //head b4o,b5o
        b.put("\u0020\u182a\u1823", '\ue023');
        b.put("\u0020\u182a\u1824", '\ue023');
        //middle b4o,b5o,b6u,b7u
        b.put("\u182a\u1823", '\ue024');
        b.put("\u182a\u1824", '\ue024');
        b.put("\u182a\u1825", '\ue024');
        b.put("\u182a\u1826", '\ue024');
        //tail b4o,b5o,b6u,b7u
        b.put("\u182a\u1823\u0020", '\ue025');
        b.put("\u182a\u1824\u0020", '\ue025');
        b.put("\u182a\u1825\u0020", '\ue025');
        b.put("\u182a\u1826\u0020", '\ue025');
        //head b6u,b7u
        b.put("\u0020\u182a\u1825", '\ue026');
        b.put("\u0020\u182a\u1826", '\ue026');
        return b;
    }

    public static Map<String, Character> getGiiP() {
        Map<String, Character> p = new HashMap<>(64);
        //pa,pe
        p.put("\u0020\u182b\u1820\u0020", '\ue027');
        p.put("\u0020\u182b\u1821\u0020", '\ue027');
        //pi
        p.put("\u0020\u182b\u1822\u0020", '\ue028');
        //p4o,p5o
        p.put("\u0020\u182b\u1823\u0020", '\ue029');
        p.put("\u0020\u182b\u1824\u0020", '\ue029');
        //p6u,p7u
        p.put("\u0020\u182b\u1825\u0020", '\ue02a');
        p.put("\u0020\u182b\u1826\u0020", '\ue02a');
        //head pa,pe
        p.put("\u0020\u182b\u1820", '\ue02b');
        p.put("\u0020\u182b\u1821", '\ue02b');
        //middle pa,pe
        p.put("\u182b\u1820", '\ue02c');
        p.put("\u182b\u1821", '\ue02c');
        //tail pa,pe
        p.put("\u182b\u1820\u0020", '\ue02d');
        p.put("\u182b\u1820\u0021", '\ue02d');
        //head pi
        p.put("\u0020\u182b\u1822", '\ue02e');
        //middle pi
        p.put("\u182b\u1822", '\ue02f');
        //tail pi
        p.put("\u182b\u1822\u0020", '\ue030');
        //head p4o,p5o
        p.put("\u0020\u182b\u1823", '\ue031');
        p.put("\u0020\u182b\u1824", '\ue031');
        //middle p4o,p5o,p6u,p7u
        p.put("\u182b\u1823", '\ue032');
        p.put("\u182b\u1824", '\ue032');
        p.put("\u182b\u1825", '\ue032');
        p.put("\u182b\u1826", '\ue032');
        //tail p4o,p5o,p6u,p7u
        p.put("\u182b\u1823\u0020", '\ue033');
        p.put("\u182b\u1824\u0020", '\ue033');
        p.put("\u182b\u1825\u0020", '\ue033');
        p.put("\u182b\u1826\u0020", '\ue033');
        //head p6u,p7u
        p.put("\u0020\u182b\u1825", '\ue034');
        p.put("\u0020\u182b\u1826", '\ue034');
        return p;
    }

    public static Map<String, Character> getGiiH() {
        Map<String, Character> h = new HashMap<>(64);
        //ha
        h.put("\u0020\u182c\u1820\u0020", '\ue035');
        //he
        h.put("\u0020\u182c\u1821\u0020", '\ue036');
        //hi
        h.put("\u0020\u182c\u1822\u0020", '\ue037');
        //h4o,h5o
        h.put("\u0020\u182c\u1823\u0020", '\ue038');
        h.put("\u0020\u182c\u1824\u0020", '\ue038');
        //h6u,h7u
        h.put("\u0020\u182c\u1825\u0020", '\ue039');
        h.put("\u0020\u182c\u1826\u0020", '\ue039');
        //head ha
        h.put("\u0020\u182c\u1820", '\ue03a');
        //middle ha
        h.put("\u182c\u1820", '\ue03b');
        //tail ha
        h.put("\u182c\u1820\u0020", '\ue03c');
        //head he
        h.put("\u0020\u182c\u1821", '\ue03d');
        //middle he
        h.put("\u182c\u1821", '\ue03e');
        //tail he
        h.put("\u182c\u1821\u0020", '\ue03f');
        //head hi
        h.put("\u0020\u182c\u1822", '\ue040');
        //middle hi
        h.put("\u182c\u1822", '\ue041');
        //tail hi
        h.put("\u182c\u1822\u0020", '\ue042');
        //head h4o,h5o
        h.put("\u0020\u182c\u1823", '\ue043');
        h.put("\u0020\u182c\u1824", '\ue043');
        //middle h4o,h5o
        h.put("\u182c\u1823", '\ue044');
        h.put("\u182c\u1824", '\ue044');
        //tail h4o,h5o
        h.put("\u182c\u1823\u0020", '\ue045');
        h.put("\u182c\u1824\u0020", '\ue045');
        //head h6u,h7u
        h.put("\u0020\u182c\u1825", '\ue046');
        h.put("\u0020\u182c\u1826", '\ue046');
        //middle h6u,h7u
        h.put("\u182c\u1825", '\ue047');
        h.put("\u182c\u1826", '\ue047');
        //tail h6u,h7u
        h.put("\u182c\u1825\u0020", '\ue048');
        h.put("\u182c\u1826\u0020", '\ue048');
        return h;
    }

    public static Map<String, Character> getGiiG() {
        Map<String, Character> g = new HashMap<>(64);
        //ga
        g.put("\u0020\u182d\u1820\u0020", '\ue049');
        //ge
        g.put("\u0020\u182d\u1821\u0020", '\ue036');
        //gi
        g.put("\u0020\u182d\u1822\u0020", '\ue037');
        //g4o,g5o
        g.put("\u0020\u182d\u1823\u0020", '\ue04a');
        g.put("\u0020\u182d\u1824\u0020", '\ue04a');
        //g6u,g7u
        g.put("\u0020\u182d\u1825\u0020", '\ue039');
        g.put("\u0020\u182d\u1826\u0020", '\ue039');
        //head ga
        g.put("\u0020\u182d\u1820", '\ue04b');
        //middle ga
        g.put("\u182d\u1820", '\ue04c');
        //tail ga
        g.put("\u182d\u1820\u0020", '\ue04d');
        //head ge
        g.put("\u0020\u182d\u1821", '\ue03d');
        //middle ge
        g.put("\u182d\u1821", '\ue03e');
        //tail ge
        g.put("\u182d\u1821\u0020", '\ue03f');
        //head gi
        g.put("\u0020\u182d\u1822", '\ue040');
        //middle gi
        g.put("\u182d\u1822", '\ue041');
        //tail gi
        g.put("\u182d\u1822\u0020", '\ue042');
        //head g4o,g5o
        g.put("\u0020\u182d\u1823", '\ue04e');
        g.put("\u0020\u182d\u1824", '\ue04e');
        //middle g4o,g5o
        g.put("\u182d\u1823", '\ue04f');
        g.put("\u182d\u1824", '\ue04f');
        //tail g4o,g5o
        g.put("\u182d\u1823\u0020", '\ue050');
        g.put("\u182d\u1824\u0020", '\ue050');
        //head g6u,g7u
        g.put("\u0020\u182d\u1825", '\ue046');
        g.put("\u0020\u182d\u1826", '\ue046');
        //middle g6u,g7u
        g.put("\u182d\u1825", '\ue047');
        g.put("\u182d\u1826", '\ue047');
        //tail g6u,g7u
        g.put("\u182d\u1825\u0020", '\ue048');
        g.put("\u182d\u1826\u0020", '\ue048');
        return g;
    }

    public static Map<String, Character> getGiiM() {
        Map<String, Character> m = new HashMap<>(64);
        //ma,me
        m.put("\u0020\u182e\u1820\u0020", '\ue051');
        m.put("\u0020\u182e\u1821\u0020", '\ue051');
        //mi
        m.put("\u0020\u182e\u1822\u0020", '\ue052');
        //m4o,m5o
        m.put("\u0020\u182e\u1823\u0020", '\ue053');
        m.put("\u0020\u182e\u1824\u0020", '\ue053');
        //m6u,m7u
        m.put("\u0020\u182e\u1825\u0020", '\ue054');
        m.put("\u0020\u182e\u1826\u0020", '\ue054');
        //head ma,me
        m.put("\u0020\u182e\u1820", '\ue055');
        m.put("\u0020\u182e\u1821", '\ue055');
        //middle ma,me
        m.put("\u182e\u1820", '\ue056');
        m.put("\u182e\u1821", '\ue056');
        //tail1 ma,me
        m.put("\u182e\u1820\u0020", '\ue057');
        m.put("\u182e\u1821\u0020", '\ue057');
        //tail2 ma,me
        m.put("\u182e\u180E\u1820\u0020", '\ue058');
        m.put("\u182e\u180E\u1821\u0020", '\ue058');
        //head mi
        m.put("\u0020\u182e\u1822", '\ue059');
        //middle mi
        m.put("\u182e\u1822", '\ue05a');
        //tail mi
        m.put("\u182e\u1822\u0020", '\ue05b');
        //head m4o,m5o
        m.put("\u0020\u182e\u1823", '\ue05c');
        m.put("\u0020\u182e\u1824", '\ue05c');
        //middle m4o,m5o,m6u,m7u
        m.put("\u182e\u1823", '\ue05d');
        m.put("\u182e\u1824", '\ue05d');
        m.put("\u182e\u1825", '\ue05d');
        m.put("\u182e\u1826", '\ue05d');
        //tail m4o,m5o,m6u,m7u
        m.put("\u182e\u1823\u0020", '\ue05e');
        m.put("\u182e\u1824\u0020", '\ue05e');
        m.put("\u182e\u1825\u0020", '\ue05e');
        m.put("\u182e\u1826\u0020", '\ue05e');
        //head m6u,m7u
        m.put("\u0020\u182e\u1825", '\ue05f');
        m.put("\u0020\u182e\u1826", '\ue05f');
        return m;
    }

    public static Map<String, Character> getGiiL() {
        Map<String, Character> l = new HashMap<>(64);
        //la,le
        l.put("\u0020\u182f\u1820\u0020", '\ue060');
        l.put("\u0020\u182f\u1821\u0020", '\ue060');
        //li
        l.put("\u0020\u182f\u1822\u0020", '\ue061');
        //l4o,l5o
        l.put("\u0020\u182f\u1823\u0020", '\ue062');
        l.put("\u0020\u182f\u1824\u0020", '\ue062');
        //l6u,l7u
        l.put("\u0020\u182f\u1825\u0020", '\ue063');
        l.put("\u0020\u182f\u1826\u0020", '\ue063');
        //head la,le
        l.put("\u0020\u182f\u1820", '\ue064');
        l.put("\u0020\u182f\u1821", '\ue064');
        //middle la,le
        l.put("\u182f\u1820", '\ue065');
        l.put("\u182f\u1821", '\ue065');
        //tail1 la,le
        l.put("\u182f\u1820\u0020", '\ue066');
        l.put("\u182f\u1821\u0020", '\ue066');
        //tail2 la,le
        l.put("\u182f\u180E\u1820\u0020", '\ue067');
        l.put("\u182f\u180E\u1821\u0020", '\ue067');
        //head li
        l.put("\u0020\u182f\u1822", '\ue068');
        //middle li
        l.put("\u182f\u1822", '\ue069');
        //tail li
        l.put("\u182f\u1822\u0020", '\ue06a');
        //head l4o,l5o
        l.put("\u0020\u182f\u1823", '\ue06b');
        l.put("\u0020\u182f\u1824", '\ue06b');
        //middle l4o,l5o,l6u,l7u
        l.put("\u182f\u1823", '\ue06c');
        l.put("\u182f\u1824", '\ue06c');
        l.put("\u182f\u1825", '\ue06c');
        l.put("\u182f\u1826", '\ue06c');
        //tail l4o,l5o,l6u,l7u
        l.put("\u182f\u1823\u0020", '\ue06d');
        l.put("\u182f\u1824\u0020", '\ue06d');
        l.put("\u182f\u1825\u0020", '\ue06d');
        l.put("\u182f\u1826\u0020", '\ue06d');
        //head l6u,l7u
        l.put("\u0020\u182f\u1825", '\ue06e');
        l.put("\u0020\u182f\u1826", '\ue06e');
        return l;
    }

    public static Map<String, Character> getGiiS() {
        Map<String, Character> s = new HashMap<>(64);
        //sa,se
        s.put("\u0020\u1830\u1820\u0020", '\ue06f');
        s.put("\u0020\u1830\u1821\u0020", '\ue06f');
        //si
        s.put("\u0020\u1830\u1822\u0020", '\ue070');
        //s4o,s5o
        s.put("\u0020\u1830\u1823\u0020", '\ue071');
        s.put("\u0020\u1830\u1824\u0020", '\ue071');
        //s6u,s7u
        s.put("\u0020\u1830\u1825\u0020", '\ue072');
        s.put("\u0020\u1830\u1826\u0020", '\ue072');
        //head sa,se
        s.put("\u0020\u1830\u1820", '\ue073');
        s.put("\u0020\u1830\u1821", '\ue073');
        //middle sa,se
        s.put("\u1830\u1820", '\ue074');
        s.put("\u1830\u1821", '\ue074');
        //tail sa,se
        s.put("\u1830\u1820\u0020", '\ue075');
        s.put("\u1830\u1821\u0020", '\ue075');
        //head si
        s.put("\u0020\u1830\u1822", '\ue076');
        //middle si
        s.put("\u1830\u1822", '\ue077');
        //tail si
        s.put("\u1830\u1822\u0020", '\ue078');
        //head s4o,s5o
        s.put("\u0020\u1830\u1823", '\ue079');
        s.put("\u0020\u1830\u1824", '\ue079');
        //middle s4o,s5o,s6u,s7u
        s.put("\u1830\u1823", '\ue07a');
        s.put("\u1830\u1824", '\ue07a');
        s.put("\u1830\u1825", '\ue07a');
        s.put("\u1830\u1826", '\ue07a');
        //tail s4o,s5o,s6u,s7u
        s.put("\u1830\u1823\u0020", '\ue07b');
        s.put("\u1830\u1824\u0020", '\ue07b');
        s.put("\u1830\u1825\u0020", '\ue07b');
        s.put("\u1830\u1826\u0020", '\ue07b');
        //head s6u,s7u
        s.put("\u0020\u1830\u1825", '\ue07c');
        s.put("\u0020\u1830\u1826", '\ue07c');
        return s;
    }

    public static Map<String, Character> getGiiSH() {
        Map<String, Character> sh = new HashMap<>(64);
        //sha,she
        sh.put("\u0020\u1831\u1820\u0020", '\ue07d');
        sh.put("\u0020\u1831\u1821\u0020", '\ue07d');
        //shi
        sh.put("\u0020\u1831\u1822\u0020", '\ue07e');
        //sh4o,sh5o
        sh.put("\u0020\u1831\u1823\u0020", '\ue07f');
        sh.put("\u0020\u1831\u1824\u0020", '\ue07f');
        //sh6u,sh7u
        sh.put("\u0020\u1831\u1825\u0020", '\ue080');
        sh.put("\u0020\u1831\u1826\u0020", '\ue080');
        //head sha,she
        sh.put("\u0020\u1831\u1820", '\ue081');
        sh.put("\u0020\u1831\u1821", '\ue081');
        //middle sha,she
        sh.put("\u1831\u1820", '\ue082');
        sh.put("\u1831\u1821", '\ue082');
        //tail sha,she
        sh.put("\u1831\u1820\u0020", '\ue083');
        sh.put("\u1831\u1821\u0020", '\ue083');
        //head shi
        sh.put("\u0020\u1831\u1822", '\ue084');
        //middle shi
        sh.put("\u1831\u1822", '\ue085');
        //tail shi
        sh.put("\u1831\u1822\u0020", '\ue086');
        //head sh4o,sh5o
        sh.put("\u0020\u1831\u1823", '\ue087');
        sh.put("\u0020\u1831\u1824", '\ue087');
        //middle sh4o,sh5o,sh6u,sh7u
        sh.put("\u1831\u1823", '\ue088');
        sh.put("\u1831\u1824", '\ue088');
        sh.put("\u1831\u1825", '\ue088');
        sh.put("\u1831\u1826", '\ue088');
        //tail sh4o,sh5o,sh6u,sh7u
        sh.put("\u1831\u1823\u0020", '\ue089');
        sh.put("\u1831\u1824\u0020", '\ue089');
        sh.put("\u1831\u1825\u0020", '\ue089');
        sh.put("\u1831\u1826\u0020", '\ue089');
        //head sh6u,sh7u
        sh.put("\u0020\u1831\u1825", '\ue08a');
        sh.put("\u0020\u1831\u1826", '\ue08a');
        return sh;
    }

    public static Map<String, Character> getGiiT() {
        Map<String, Character> t = new HashMap<>(64);
        return t;
    }

    public static Map<String, Character> getGiiD() {
        Map<String, Character> d = new HashMap<>(64);
        return d;
    }

    public static Map<String, Character> getGiiTR() {
        Map<String, Character> tr = new HashMap<>(64);
        return tr;
    }

    public static Map<String, Character> getGiiJ() {
        Map<String, Character> j = new HashMap<>(64);
        return j;
    }

    public static Map<String, Character> getGiiY() {
        Map<String, Character> y = new HashMap<>(64);
        return y;
    }

    public static Map<String, Character> getGiiR() {
        Map<String, Character> r = new HashMap<>(64);
        return r;
    }

    public static Map<String, Character> getGiiF() {
        Map<String, Character> f = new HashMap<>(64);
        return f;
    }

    public static void main(String[] args) {
        System.out.println(FromDelehiConvertRule.rule);
    }
}
