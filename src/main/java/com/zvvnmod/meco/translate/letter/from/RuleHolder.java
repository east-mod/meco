package com.zvvnmod.meco.translate.letter.from;

import com.zvvnmod.meco.common.CodeType;
import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.State;
import com.zvvnmod.meco.translate.annotation.From;
import com.zvvnmod.meco.translate.annotation.To;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/17
 * WEEK  : 周一
 * TIME  : 14:13
 */
@Component
public class RuleHolder {
    private static final Logger logger = LoggerFactory.getLogger(RuleHolder.class);

    private Map<CodeType, TranslateRule> fromRuleMap;
    private Map<CodeType, TranslateRule> toRuleMap;

    @Autowired
    public RuleHolder(List<TranslateRule> translateRules) {
        this.fromRuleMap = new LinkedHashMap<>();
        this.toRuleMap = new LinkedHashMap<>();

        for (TranslateRule translateRule : translateRules) {
            From from = translateRule.getClass().getAnnotation(From.class);
            if (from != null) {
                fromRuleMap.put(from.value(), translateRule);
                continue;
            }

            To to = translateRule.getClass().getAnnotation(To.class);
            if (to != null) {
                toRuleMap.put(to.value(), translateRule);
                continue;
            }
            logger.info("Are you miss add the @From/@To annotation to {}",
                    translateRule.getClass().getSimpleName());
            throw new MecoException(State.MISS_ANNOTATION);
        }
    }

    public TranslateRule getFromRule(CodeType codeType) {
        return this.fromRuleMap.get(codeType);
    }

    public TranslateRule getToRule(CodeType codeType) {
        return this.toRuleMap.get(codeType);
    }
}
