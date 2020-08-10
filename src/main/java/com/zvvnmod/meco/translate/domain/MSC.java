package com.zvvnmod.meco.translate.domain;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.translate.exception.TranslateState;
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
public class MSC {
    @Getter
    @Setter
    private UnicodeType head;
    private List<Character> content;
    @Getter
    @Setter
    private UnicodeType tail;

    public MSC() {
        this.content = new ArrayList<>(8);
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

    public void push(char ch) {
        content.add(ch);
    }

    public void pop() {
        if (CollectionUtils.isEmpty(content)) {
            throw new MecoException(TranslateState.MSC_NOTHING_TO_POP);
        }
        content.remove(content.size() - 1);
    }

    public void reset() {
        this.head = null;
        this.content = new ArrayList<>(8);
        this.tail = null;
    }

    public boolean contentIsBlank() {
        return CollectionUtils.isEmpty(this.content);
    }
}
