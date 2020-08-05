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
        rule.putAll(getEhshig());
        rule.putAll(getGiiN());
        rule.putAll(getGiiB());
        rule.putAll(getGiiF());
    }

    public static void combine(Map<String, Character> subRule) {
        if (CollectionUtils.isEmpty(subRule)) {
            return;
        }
        for (Map.Entry<String, Character> entry : subRule.entrySet()) {
            if (rule.containsKey(entry.getKey())) {
                throw new MecoException(DelehiState.DUPLICATE_KEY);
            }
        }
    }

    public static Map<String, Character> getEhshig() {
        Map<String, Character> ehshig = new HashMap<>(32);
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
        Map<String, Character> n = new HashMap<>(32);
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
        //tail na
        n.put("\u1828\u1820\u0020", '\ue010');
        return n;
    }

    public static Map<String, Character> getGiiB() {
        Map<String, Character> b = new HashMap<>(32);

        return b;
    }

    public static Map<String, Character> getGiiF() {
        Map<String, Character> f = new HashMap<>(32);

        return f;
    }
}
