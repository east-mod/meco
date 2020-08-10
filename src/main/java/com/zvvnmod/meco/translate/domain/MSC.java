package com.zvvnmod.meco.translate.domain;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.translate.exception.TranslateState;
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
    private UnicodeType head;
    private List<Character> content;
    private UnicodeType tail;

    public MSC() {
        this.content = new ArrayList<>(8);
    }

    public String getKey() {
        if (CollectionUtils.isEmpty(content)) {
            return Strings.BLANK;
        }
        StringBuilder builder = new StringBuilder(content.size() + 2);
        content.forEach(builder::append);
        if (head == null || tail == null) {
            throw new MecoException(TranslateState.UNICODE_TYPE_NOT_BE_NULL);
        }
        if (!head.equals(UnicodeType.MONGOLIAN)) {
            builder.append('\u0020');
        }
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

    public void setTail(UnicodeType tail) {
        if (this.tail == null) {
            this.tail = tail;
        }
    }

    public void setHead(UnicodeType head) {
        if (this.head == null) {
            this.head = head;
        }
    }

    public boolean contentIsBlank() {
        return CollectionUtils.isEmpty(this.content);
    }
}
