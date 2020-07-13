package com.zvvnmod.meco.testing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/7/13
 * WEEK  : Mon
 * TIME  : 09:16
 */
@RestController
@RequestMapping(path = "/meco/testing")
public class TestingController {
    public static Logger logger = LoggerFactory.getLogger(TestingController.class);

    @PostMapping
    public String myPost(@RequestParam("chars") char[] chars) {
        if (chars != null && chars.length > 0) {
            for (char aChar : chars) {
                System.out.println(aChar);
                System.out.println((int)aChar);
            }
        }

        return "success";
    }
}
