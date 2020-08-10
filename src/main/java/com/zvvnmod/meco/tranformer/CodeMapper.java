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
public class CodeMapper {
    public Map<String, String> map;

    public CodeMapper() {
        this.map = new HashMap<>();
    }

    public CodeMapper(final Integer size) {
        this.map = new HashMap<>(size);
    }

    public void put(final String key, final String character) {
        if (map.containsKey(key)) {
            throw new MecoException(DelehiState.DUPLICATE_KEY);
        } else {
            map.put(key, character);
        }
    }

    public void combine(final Map<String, String> subRule) {
        if (CollectionUtils.isEmpty(subRule)) {
            return;
        }
        for (Map.Entry<String, String> entry : subRule.entrySet()) {
            if (map.containsKey(entry.getKey())) {
                throw new MecoException(DelehiState.DUPLICATE_KEY);
            }
            map.put(entry.getKey(), entry.getValue());
        }
    }

    public boolean containsKey(final String k) {
        return this.map.containsKey(k);
    }
}
