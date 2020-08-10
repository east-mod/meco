package com.zvvnmod.meco.rule.delehi;

import com.zvvnmod.meco.tranformer.CodeMapper;

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
        mapper.combine(getEhshig());
//        rule.combine(getGiiN());
//        rule.combine(getGiiB());
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

    public static Map<String, String> getEhshig() {
        Map<String, String> ehshig = new HashMap<>(32);
        //a
        ehshig.put("\u0020\u1820\u0020", "\u0020\ue000\ue00c\u0020");
        //e
        ehshig.put("\u0020\u1821\u0020", "\u0020\ue000\ue00d\u0020");
        //i
        ehshig.put("\u0020\u1822\u0020", "\u0020\ue000\ue00e\u0020");
        //4o,5o
        ehshig.put("\u0020\u1823\u0020", "\u0020\ue000\ue00f\u0020");
        ehshig.put("\u0020\u1824\u0020", "\u0020\ue000\ue00f\u0020");
        //6u,7u
        ehshig.put("\u0020\u1825\u0020", "\u0020\ue000\ue010\u0020");
        ehshig.put("\u0020\u1826\u0020", "\u0020\ue000\ue010\u0020");

        //head a
        ehshig.put("\u0020\u1820", "\u0020\ue000\ue005");
        //head e
        ehshig.put("\u0020\u1821", "\u0020\ue000");
        //head i
        ehshig.put("\u0020\u1822", "\u0020\ue000\ue006");


        return ehshig;
    }
}
