package com.zvvnmod.meco.tranformer;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.rule.delehi.DelehiState;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/9
 * WEEK  : Sun
 * TIME  : 23:12
 */
public class RuleMap<K, V> {
    public Map<K, V> rule;

    public RuleMap() {
        this.rule = new HashMap<>();
    }

    public RuleMap(final Integer size) {
        this.rule = new HashMap<>(size);
    }

    public void put(final K key, final V character) {
        if (rule.containsKey(key)) {
            throw new MecoException(DelehiState.DUPLICATE_KEY);
        } else {
            rule.put(key, character);
        }
    }

    public void combine(final Map<K, V> subRule) {
        if (CollectionUtils.isEmpty(subRule)) {
            return;
        }
        for (Map.Entry<K, V> entry : subRule.entrySet()) {
            if (rule.containsKey(entry.getKey())) {
                throw new MecoException(DelehiState.DUPLICATE_KEY);
            }
            rule.put(entry.getKey(), entry.getValue());
        }
    }

    public boolean containsKey(final K k) {
        return this.rule.containsKey(k);
    }
}
