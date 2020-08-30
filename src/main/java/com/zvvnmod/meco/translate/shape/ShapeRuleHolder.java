package com.zvvnmod.meco.translate.shape;

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
 * DATE  : 2020/8/31
 * WEEK  : 周一
 * TIME  : 01:35
 */
@Component
public class ShapeRuleHolder {
    private static final Logger logger = LoggerFactory.getLogger(ShapeRuleHolder.class);

    private final Map<CodeType, ShapeTranslateRule> ruleMap;

    @Autowired
    public ShapeRuleHolder(List<ShapeTranslateRule> shapeRuleHolderList) {
        this.ruleMap = new LinkedHashMap<>();
        for (ShapeTranslateRule shapeTranslateRule : shapeRuleHolderList) {
            Rule from = shapeTranslateRule.getClass().getAnnotation(Rule.class);
            if (from == null) {
                logger.info("Are you miss add the @Rule annotation to {}",
                        shapeTranslateRule.getClass().getSimpleName());
                throw new MecoException(State.MISS_ANNOTATION);
            }
            ruleMap.put(from.value(), shapeTranslateRule);
        }
    }

    public ShapeTranslateRule getRule(CodeType codeType) {
        return this.ruleMap.get(codeType);
    }
}
