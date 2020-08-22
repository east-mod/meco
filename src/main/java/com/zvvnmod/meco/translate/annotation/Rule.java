package com.zvvnmod.meco.translate.annotation;

import com.zvvnmod.meco.translate.enumeration.CodeType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/21
 * WEEK  : 周五
 * TIME  : 23:28
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Rule {
    CodeType value();
}
