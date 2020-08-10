package com.zvvnmod.meco.tranformer;

import com.zvvnmod.meco.common.Strings;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 18:14
 */
public class Transverter {

    private final TransformRule transformRule;

    private MSC msc;

    public Transverter(final TransformRule transformRule) {
        this.transformRule = transformRule;
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
