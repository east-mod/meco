package com.zvvnmod.meco.translate.letter.from;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.translate.exception.TranslateState;
import com.zvvnmod.meco.translate.word.Nature;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : 周一
 * TIME  : 18:18
 * convertible mongolian string context.
 */
@Getter
public class LetterWordFragment {
    @Setter
    private UnicodeType head;
    @Setter
    private UnicodeType tail;
    private final List<Character> content;
    private Nature nature;

    public LetterWordFragment() {
        this.content = new ArrayList<>(8);
        this.nature = Nature.SAARMAG;
    }

    public String getKey() {
        if (CollectionUtils.isEmpty(content)) {
            return Strings.BLANK;
        }
        if (head == null || tail == null) {
            throw new MecoException(TranslateState.UNICODE_TYPE_NOT_BE_NULL);
        }
        StringBuilder builder = new StringBuilder(content.size() + 2);
        if (!head.equals(UnicodeType.MONGOLIAN)) {
            builder.append('\u0020');
        }
        content.forEach(builder::append);
        if (!tail.equals(UnicodeType.MONGOLIAN)) {
            builder.append('\u0020');
        }
        return builder.toString();
    }

    public void setNature(Nature nature) {
        if (this.nature.equals(Nature.SAARMAG) && !nature.equals(Nature.SAARMAG)) {
            this.nature = nature;
        }
    }

    public void push(char ch) {
        content.add(ch);
    }


    public void pop() {
        if (CollectionUtils.isEmpty(content)) {
            throw new MecoException(TranslateState.NOTHING_TO_POP);
        }
        content.remove(content.size() - 1);
    }

    public boolean isBlank() {
        return CollectionUtils.isEmpty(this.content);
    }

    public boolean isNotBlank() {
        return !isBlank();
    }
}
