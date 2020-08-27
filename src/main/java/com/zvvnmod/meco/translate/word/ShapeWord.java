package com.zvvnmod.meco.translate.word;

import lombok.Getter;
import org.springframework.util.CollectionUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/23
 * WEEK  : 周日
 * TIME  : 10:09
 */
public class ShapeWord {
    @Getter
    private List<ShapeWordFragment> wordFragments;

    public ShapeWord() {
        this.wordFragments = new LinkedList<>();
    }

    public void add(final ShapeWordFragment shapeWordFragment) {
        wordFragments.add(shapeWordFragment);
    }

    public boolean isBlank() {
        return CollectionUtils.isEmpty(wordFragments);
    }

    public boolean isNotBlank() {
        return !isBlank();
    }
}
