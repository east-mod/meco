package com.zvvnmod.meco.translate.domain;

import lombok.Getter;
import org.springframework.util.CollectionUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/12
 * WEEK  : 周三
 * TIME  : 18:23
 * mongolian word
 */
public class MglWord {
    @Getter
    private Nature nature;
    @Getter
    private List<MglWordFragment> mglWordFragments;

    public MglWord() {
        this.nature = Nature.SAARMAG;
        this.mglWordFragments = new LinkedList<>();
    }

    public void add(final MglWordFragment mglWordFragment) {
        if (this.nature == Nature.SAARMAG && !mglWordFragment.getNature().equals(Nature.SAARMAG)) {
            this.nature = mglWordFragment.getNature();
        }
        mglWordFragments.add(mglWordFragment);
    }

    public boolean isEmpty() {
        return CollectionUtils.isEmpty(mglWordFragments);
    }
}
