package com.zvvnmod.meco.translate.letter.to;

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
 * DATE  : 2020/8/22
 * WEEK  : 周六
 * TIME  : 12:06
 */
@Component
public class LetterToRuleHolder {
    private static final Logger logger = LoggerFactory.getLogger(LetterToRuleHolder.class);

    private final Map<CodeType, LetterToTranslateRule> ruleMap;

    @Autowired
    public LetterToRuleHolder(List<LetterToTranslateRule> letterToTranslateRules) {
        this.ruleMap = new LinkedHashMap<>();

        for (LetterToTranslateRule letterToTranslateRule : letterToTranslateRules) {
            Rule from = letterToTranslateRule.getClass().getAnnotation(Rule.class);
            if (from == null) {
                logger.info("Are you miss add the @Rule annotation to {}",
                        letterToTranslateRule.getClass().getSimpleName());
                throw new MecoException(State.MISS_ANNOTATION);
            }
            ruleMap.put(from.value(), letterToTranslateRule);
        }

    }

    public LetterToTranslateRule getRule(CodeType codeType) {
        return this.ruleMap.get(codeType);
    }
}
