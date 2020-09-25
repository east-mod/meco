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
    private Nature nature;
    @Getter
    private List<ShapeWordFragment> wordFragments;

    public ShapeWord() {
        this.nature = Nature.CHAGH;
        this.wordFragments = new LinkedList<>();
    }

    public void add(final ShapeWordFragment shapeWordFragment) {
        if (shapeWordFragment.getKey().equals("\ue006\ue00d") ||
                shapeWordFragment.getKey().equals("\ue031") ||
                shapeWordFragment.getKey().equals("\uE006\uE006\uE00D")) {
            nature = Nature.HUNDII;
        }
        wordFragments.add(shapeWordFragment);
    }

    public boolean isBlank() {
        return CollectionUtils.isEmpty(wordFragments);
    }

    public boolean isNotBlank() {
        return !isBlank();
    }
}
