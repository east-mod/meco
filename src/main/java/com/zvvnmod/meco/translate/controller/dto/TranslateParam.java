package com.zvvnmod.meco.translate.controller.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : Mon
 * TIME  : 23:34
 */
@Getter
@Setter
public class TranslateParam {
    private String from;
    private String to;
    private String content;
}
