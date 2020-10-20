package com.zvvnmod.meco.draft.translate;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/5/5
 * WEEK  : Tue
 * TIME  : 19:25
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DraftObject {
    private Map<String, Entity> entityMap;

    private List<Block> blocks;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Entity {
        private String type;
        private String mutability;
        private JSONObject data;
    }
}

