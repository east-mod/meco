package com.zvvnmod.meco.translate.service;

import com.zvvnmod.meco.common.CodeType;
import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.rule.RuleHolder;
import com.zvvnmod.meco.translate.domain.Translator;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : Mon
 * TIME  : 23:21
 */
@Component
public class TranslateService {
    @Resource
    private RuleHolder ruleHolder;

    public String translate(CodeType from, CodeType to, String s) {
        if (from == to || Strings.isBlank(s)) {
            return s;
        }
        String s0 = s;
        if (from != CodeType.zvvnmod) {
            s0 = new Translator(ruleHolder.getFromRule(from)).translate(s0);
        }

        if (to != CodeType.zvvnmod) {
            s0 = new Translator(ruleHolder.getToRule(to)).translate(s0);
        }
        return s0;
    }
}
