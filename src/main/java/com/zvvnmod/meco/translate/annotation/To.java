package com.zvvnmod.meco.translate.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/9/7
 * WEEK  : 周一
 * TIME  : 12:06
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface To {
}
