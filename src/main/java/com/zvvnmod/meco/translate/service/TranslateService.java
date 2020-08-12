package com.zvvnmod.meco.translate.service;

import com.zvvnmod.meco.rule.delehi.DelehiRule;
import com.zvvnmod.meco.translate.domain.TranslateRule;
import com.zvvnmod.meco.translate.domain.Translator;
import org.springframework.stereotype.Component;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : Mon
 * TIME  : 23:21
 */
@Component
public class TranslateService {

    public String translateDelehi(String s) {
        TranslateRule translateRule = new DelehiRule();
        Translator translator = new Translator(translateRule);
        return translator.translate(s);
    }

}
