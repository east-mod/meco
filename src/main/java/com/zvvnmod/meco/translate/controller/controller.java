package com.zvvnmod.meco.translate.controller;

import com.zvvnmod.meco.common.SuperController;
import com.zvvnmod.meco.common.result.GenericResult;
import com.zvvnmod.meco.common.result.ResultBase;
import com.zvvnmod.meco.translate.controller.dto.TranslateParam;
import com.zvvnmod.meco.translate.service.TranslateService;
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

    @PostMapping("/delehi")
    public ResultBase translateDelehi(@RequestBody TranslateParam param) {
        String s = translateService.translateDelehi(param.getContent());
        return GenericResult.get(s);
    }
}
