package com.zvvnmod.meco.transformer;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.transformer.delehi.DelehiState;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/9
 * WEEK  : Sun
 * TIME  : 23:12
 */
public class RuleMap {
    public Map<String, Character> rule;

    public RuleMap(final Integer size) {
        this.rule = new HashMap<>(size);
    }

    public void put(String key, Character character) {
        if (rule.containsKey(key)) {
            throw new MecoException(DelehiState.DUPLICATE_KEY);
        } else {
            rule.put(key, character);
        }
    }

    public void combine(Map<String, Character> subRule) {
        if (CollectionUtils.isEmpty(subRule)) {
            return;
        }
        for (Map.Entry<String, Character> entry : subRule.entrySet()) {
            if (rule.containsKey(entry.getKey())) {
                throw new MecoException(DelehiState.DUPLICATE_KEY);
            }
            rule.put(entry.getKey(), entry.getValue());
        }
    }
}
