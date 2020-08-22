package com.zvvnmod.meco.translate.service;

import com.zvvnmod.meco.common.MecoException;
import com.zvvnmod.meco.common.Strings;
import com.zvvnmod.meco.translate.enumeration.CodeSeries;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import com.zvvnmod.meco.translate.exception.TranslateState;
import com.zvvnmod.meco.translate.letter.from.LetterFromRuleHolder;
import com.zvvnmod.meco.translate.letter.from.LetterFromTranslator;
import com.zvvnmod.meco.translate.letter.to.LetterToRuleHolder;
import com.zvvnmod.meco.translate.letter.to.LetterToTranslator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : Mon
 * TIME  : 23:21
 */
@Component
public class TranslateService {
    private static final Logger logger = LoggerFactory.getLogger(TranslateService.class);
    @Resource
    private LetterFromRuleHolder letterFromRuleHolder;
    @Resource
    private LetterToRuleHolder letterToRuleHolder;

    public String translate(CodeType from, CodeType to, String s) {
        if (from == to || Strings.isBlank(s)) {
            return s;
        }
        String s0 = s;
        if (from != CodeType.Zvvnmod) {
            s0 = translateFrom(from, s0);
        }
        if (to != CodeType.Zvvnmod) {
            s0 = translateTo(to, s0);
        }
        return s0;
    }

    /**
     * translate from other codes
     *
     * @return translated string
     */
    private String translateFrom(CodeType codeType, String s) {
        if (codeType.getCodeSeries() == CodeSeries.Letter) {
            return new LetterFromTranslator(letterFromRuleHolder.getRule(codeType)).translate(s);
        } else if (codeType.getCodeSeries() == CodeSeries.Shape) {
            return s;
        }
        logger.error("Not supported code series : {}", codeType.getCodeSeries());
        throw new MecoException(TranslateState.NOT_SUPPORTED_CODE_SERIES);
    }

    /**
     * translate to other codes
     *
     * @return translated string
     */
    private String translateTo(CodeType codeType, String s) {
        if (codeType.getCodeSeries() == CodeSeries.Letter) {
            return new LetterToTranslator(letterToRuleHolder.getRule(codeType)).translate(s);
        } else if (codeType.getCodeSeries() == CodeSeries.Shape) {
            return s;
        }
        logger.error("Not supported code series : {}", codeType.getCodeSeries());
        throw new MecoException(TranslateState.NOT_SUPPORTED_CODE_SERIES);
    }
}
