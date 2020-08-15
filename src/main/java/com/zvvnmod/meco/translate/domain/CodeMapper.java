package com.zvvnmod.meco.translate.domain;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.rule.from.delehi.DelehiState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger logger = LoggerFactory.getLogger(CodeMapper.class);

    public Map<String, String> map;

    public CodeMapper() {
        this.map = new HashMap<>();
    }

    public CodeMapper(final Integer size) {
        this.map = new HashMap<>(size);
    }

    public void put(final String key, final String character) {
        if (map.containsKey(key)) {
            logger.error("DUPLICATE_KEY:{}", key);
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
                logger.error("DUPLICATE_KEY:{}", entry.getKey());
                throw new MecoException(DelehiState.DUPLICATE_KEY);
            }
            map.put(entry.getKey(), entry.getValue());
        }
    }

    public boolean containsKey(final String k) {
        return this.map.containsKey(k);
    }

    public String get(final String k) {
        return this.map.get(k);
    }
}
