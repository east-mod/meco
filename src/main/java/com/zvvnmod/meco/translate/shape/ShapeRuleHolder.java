package com.zvvnmod.meco.translate.shape;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.State;
import com.zvvnmod.meco.translate.annotation.From;
import com.zvvnmod.meco.translate.annotation.Rule;
import com.zvvnmod.meco.translate.annotation.To;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/31
 * WEEK  : 周一
 * TIME  : 01:35
 */
@Component
public class ShapeRuleHolder {
    private static final Logger logger = LoggerFactory.getLogger(ShapeRuleHolder.class);

    private final Map<CodeType, ShapeTranslateRule> fromRuleMap;
    private final Map<CodeType, ShapeTranslateRule> toRuleMap;

    @Autowired
    public ShapeRuleHolder(List<ShapeTranslateRule> shapeRuleHolderList) {
        this.fromRuleMap = new HashMap<>(8);
        this.toRuleMap = new HashMap<>(8);
        for (ShapeTranslateRule shapeTranslateRule : shapeRuleHolderList) {
            Rule rule = shapeTranslateRule.getClass().getAnnotation(Rule.class);
            From from = shapeTranslateRule.getClass().getAnnotation(From.class);
            To to = shapeTranslateRule.getClass().getAnnotation(To.class);
            if (rule == null) {
                logger.info("Are you miss add the @Rule annotation to {}",
                        shapeTranslateRule.getClass().getSimpleName());
                throw new MecoException(State.MISS_ANNOTATION);
            }
            if (from == null && to == null) {
                logger.info("Are you miss add the @From/@To annotation to {}",
                        shapeTranslateRule.getClass().getSimpleName());
                throw new MecoException(State.MISS_ANNOTATION);
            }
            if (from != null) {
                fromRuleMap.put(rule.value(), shapeTranslateRule);
            } else {
                toRuleMap.put(rule.value(), shapeTranslateRule);
            }
        }
    }

    public ShapeTranslateRule getFromRule(CodeType codeType) {
        return this.fromRuleMap.get(codeType);
    }

    public ShapeTranslateRule getToRule(CodeType codeType) {
        return this.toRuleMap.get(codeType);
    }
}
