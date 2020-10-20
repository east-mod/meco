package com.zvvnmod.meco.draft.translate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/5/5
 * WEEK  : Tue
 * TIME  : 19:34
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Block {
    private String key;
    private String text;
    private String type;
    private Integer depth;
    private List<InlineStyleRange> inlineStyleRanges;
    private List<EntityRange> entityRanges;
    private Object data;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class InlineStyleRange {
        private Long offset;
        private Long length;
        private String style;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class EntityRange {
        private Long offset;
        private Long length;
        private Long key;
    }
}
