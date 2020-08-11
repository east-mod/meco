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

    static {
        build();
    }

    public static void build() {
        mapper = new CodeMapper(256);
        mapper.combine(getSeparator());
        mapper.combine(getEhshig());
        mapper.combine(getGiiN());
        mapper.combine(getGiiB());
//        rule.combine(getGiiP());
//        rule.combine(getGiiH());
//        rule.combine(getGiiG());
//        rule.combine(getGiiM());
//        rule.combine(getGiiL());
//        rule.combine(getGiiS());
//        rule.combine(getGiiSH());
//        rule.combine(getGiiT());
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
        return b;
    }
}
