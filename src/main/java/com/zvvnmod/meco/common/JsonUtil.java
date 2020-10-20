package com.zvvnmod.meco.common;

import com.alibaba.fastjson.JSON;

/**
 * AUTHOR: zorigt
 * DATE  : 19-4-30
 * WEEK  : Tue
 * TIME  : 16:41
 */
public class JsonUtil {

    public static String serialize(Object obj) {
        return JSON.toJSONString(obj);
    }

    public static <T> T deserialize(String s, Class<T> valueType) {
        return JSON.parseObject(s, valueType);
    }

    public static Object deserialize(String s) {
        return JSON.parseObject(s);
    }
}
