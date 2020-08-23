package com.zvvnmod.meco.translate.letter.from;

import com.zvvnmod.meco.translate.word.Nature;
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
public class LetterWord {
    @Getter
    private Nature nature;
    @Getter
    private List<LetterWordFragment> letterWordFragments;

    public LetterWord() {
        this.nature = Nature.SAARMAG;
        this.letterWordFragments = new LinkedList<>();
    }

    public void add(final LetterWordFragment letterWordFragment) {
        if (this.nature == Nature.SAARMAG && !letterWordFragment.getNature().equals(Nature.SAARMAG)) {
            this.nature = letterWordFragment.getNature();
        }
        letterWordFragments.add(letterWordFragment);
    }

    public boolean isBlank() {
        return CollectionUtils.isEmpty(letterWordFragments);
    }

    public boolean isNotBlank() {
        return !isBlank();
    }
}
