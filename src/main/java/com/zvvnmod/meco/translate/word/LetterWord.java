package com.zvvnmod.meco.translate.word;

import com.zvvnmod.meco.translate.letter.from.CharType;
import lombok.Getter;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
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
        this.letterWordFragments = new ArrayList<>(16);
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

    public void removeInvalidCodePointFromEnd() {
        if (CollectionUtils.isEmpty(letterWordFragments)) {
            return;
        }
        LetterWordFragment wordFragment;
        LetterWordFragment preWordFragment;
        for (int i = letterWordFragments.size() - 1; i > -1; i--) {
            if (i == 0) {
                return;
            }
            wordFragment = letterWordFragments.get(i);
            if (wordFragment.size() != 1) {
                return;
            }
            Character character = wordFragment.getContent().get(0);
            if (!MglUnicodeBlock.isVowelSeparator(character) && !MglUnicodeBlock.isFreeVariationSelector(character)) {
                return;
            }

            preWordFragment = letterWordFragments.get(i - 1);
            Character preLastCharacter = preWordFragment.getLastCharacter();
            if (preLastCharacter.equals(character)) {
                letterWordFragments.remove(i);
                letterWordFragments.get(i - 1).setTail(CharType.OTHER);
            }
        }
    }
}
