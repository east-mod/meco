package com.zvvnmod.meco.unicode;

import com.zvvnmod.meco.common.SuperController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/27
 * WEEK  : 周四
 * TIME  : 23:05
 */
@RestController
@RequestMapping(path = "/meco/unicode")
public class UnicodeController extends SuperController {

    @GetMapping("/converter")
    public String convertUnicode(@RequestParam("content") String content) {
        return UnicodeConverter.toCodePoint(content);
    }

}
