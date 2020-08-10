package com.zvvnmod.meco.tranformer;

import com.zvvnmod.meco.common.Strings;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 18:14
 */
public class Tranformer {
    private final RuleMap<String, String> rule;

    private MSC msc;

    public Tranformer(final RuleMap<String, String> rule) {
        this.rule = rule;
        this.msc = new MSC();
    }

    public String translate(final String s0) {
        if (Strings.isBlank(s0)) {
            return Strings.BLANK;
        }
        String s1 = null;
        char[] chars = s0.toCharArray();
        for (char aChar : chars) {
//            Character.isSurrogate()
        }
        return s1;
    }
}
