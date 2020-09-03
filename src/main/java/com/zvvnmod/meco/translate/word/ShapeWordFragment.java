package com.zvvnmod.meco.translate.word;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.translate.exception.TranslateState;
import com.zvvnmod.meco.translate.letter.from.CharType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/23
 * WEEK  : 周日
 * TIME  : 09:44
 */
public class ShapeWordFragment {
    @Setter
    private CharType head;
    @Setter
    private CharType tail;
    @Getter
    private List<Character> content;

    public ShapeWordFragment() {
        this.content = new ArrayList<>(16);
    }

    public void push(char c) {
        content.add(c);
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

    public String getKey() {
        if (CollectionUtils.isEmpty(content)) {
            return Strings.BLANK;
        }
        StringBuilder builder = new StringBuilder();
        content.forEach(builder::append);
        return builder.toString();
    }

    public String getLocateKey() {
        if (CollectionUtils.isEmpty(content)) {
            return Strings.BLANK;
        }
        if (head == null || tail == null) {
            throw new MecoException(TranslateState.UNICODE_TYPE_NOT_BE_NULL);
        }
        StringBuilder builder = new StringBuilder(content.size() + 2);
        if (!head.equals(CharType.MONGOLIAN)) {
            builder.append('\u0020');
        }
        content.forEach(builder::append);
        if (!tail.equals(CharType.MONGOLIAN)) {
            builder.append('\u0020');
        }
        return builder.toString();
    }
}
