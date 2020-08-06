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
        rule = new HashMap<>(1024);
        combine(getEhshig());
        combine(getGiiN());
        combine(getGiiB());
        combine(getGiiP());
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
//        n.put("\u1828\u1820\u0020", '\ue010');
        //tail2 na
        n.put("\u1828\u1820\u0020", '\ue011');
        //tail1 ne
//        n.put("\u1828\u1820\u0020",'\ue010');
        //tail2 ne
        n.put("\u1828\u1821\u0020", '\ue011');
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
}
