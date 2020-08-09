package com.zvvnmod.meco.transformer.delehi;

import com.zvvnmod.meco.transformer.RuleMap;

import java.util.HashMap;
import java.util.Map;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/9
 * WEEK  : Sun
 * TIME  : 23:08
 */
public class DlhConvertDrsRule {
    public static RuleMap rule;

    static {
        build();
    }

    public static void build(){
        rule = new RuleMap(256);
        rule.combine(getEhshig());
        rule.combine(getGiiN());
        rule.combine(getGiiB());
        rule.combine(getGiiP());
        rule.combine(getGiiH());
        rule.combine(getGiiG());
        rule.combine(getGiiM());
        rule.combine(getGiiL());
        rule.combine(getGiiS());
        rule.combine(getGiiSH());
        rule.combine(getGiiT());
        rule.combine(getGiiD());
        rule.combine(getGiiTR());
        rule.combine(getGiiJ());
        rule.combine(getGiiY());
        rule.combine(getGiiR());
        rule.combine(getGiiW());
        rule.combine(getGiiF());
        rule.combine(getGiiK());
        rule.combine(getGiiKH());
        rule.combine(getGiiTS());
        rule.combine(getGiiZ());
        rule.combine(getGiiHH());
        rule.combine(getGiiRH());
        rule.combine(getGiiLH());
    }

    public static Map<String ,Character> getEhshig(){
        Map<String ,Character> ehshig = new HashMap<>(32);
        
    }
}
