package com.zvvnmod.meco.translate.controller;

import com.zvvnmod.meco.common.SuperController;
import com.zvvnmod.meco.common.result.GenericResult;
import com.zvvnmod.meco.common.result.ResultBase;
import com.zvvnmod.meco.translate.controller.dto.TranslateParam;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import com.zvvnmod.meco.translate.service.TranslateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/10
 * WEEK  : Mon
 * TIME  : 20:50
 */
@RestController
@RequestMapping(path = "/meco/translate")
public class controller extends SuperController {

    @Resource
    private TranslateService translateService;

    @PostMapping
    public ResultBase translateByPost(@RequestBody TranslateParam param) {
        return GenericResult.get(translateService.translate(
                CodeType.get(param.getFrom()),
                CodeType.get(param.getTo()),
                param.getContent()));
    }

    @GetMapping
    public ResultBase translateByGet(@RequestBody TranslateParam param) {
        return translateByPost(param);
    }
}