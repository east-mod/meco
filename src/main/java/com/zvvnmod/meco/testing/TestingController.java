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


    /*
        String str="我的天空多么的美丽.";
		String a4 = "\uDB80\uDC00";
		logger.info(a4);
		logger.info(String.valueOf(a4.length()));
		System.out.println(0xdb80);
		System.out.println(0xdc00);

		char[] chars = Character.toChars(0xf0000);
		for (char aChar : chars) {
			System.out.println((int)aChar);
		}
     */
}
