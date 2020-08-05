package com.zvvnmod.meco.common.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> {
    private Integer pageNum;

    private Integer pageSize;

    private Integer totalNum;

    private Collection<T> collection;

    public static <T> PageResult<T> get(Integer pageNum, Integer pageSize, Integer totalNum, Collection<T> collection) {
        return new PageResult<>(pageNum, pageSize, totalNum, collection);
    }
}
