package com.zvvnmod.meco.translate.letter.from;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.State;
import com.zvvnmod.meco.translate.annotation.Rule;
import com.zvvnmod.meco.translate.enumeration.CodeType;
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
public class LetterFromRuleHolder {
    private static final Logger logger = LoggerFactory.getLogger(LetterFromRuleHolder.class);

    private final Map<CodeType, LetterFromTranslateRule> ruleMap;

    @Autowired
    public LetterFromRuleHolder(List<LetterFromTranslateRule> letterFromTranslateRules) {
        this.ruleMap = new LinkedHashMap<>();

        for (LetterFromTranslateRule letterFromTranslateRule : letterFromTranslateRules) {
            Rule from = letterFromTranslateRule.getClass().getAnnotation(Rule.class);
            if (from == null) {
                logger.info("Are you miss add the @Rule annotation to {}",
                        letterFromTranslateRule.getClass().getSimpleName());
                throw new MecoException(State.MISS_ANNOTATION);
            }
            ruleMap.put(from.value(), letterFromTranslateRule);
        }

    }

    public LetterFromTranslateRule getRule(CodeType codeType) {
        return this.ruleMap.get(codeType);
    }
}
