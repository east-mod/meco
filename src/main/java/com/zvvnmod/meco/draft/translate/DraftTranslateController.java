package com.zvvnmod.meco.draft.translate;

import com.zvvnmod.meco.common.result.GenericResult;
import com.zvvnmod.meco.common.result.ResultBase;
import com.zvvnmod.meco.translate.controller.dto.TranslateParam;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/10/20
 * WEEK  : 周二
 * TIME  : 15:46
 */
@RestController
@RequestMapping(path = "/meco/draft/translate")
public class DraftTranslateController {
    @Resource
    private DraftTranslateService draftTranslateService;

    @PostMapping
    public ResultBase translate(@RequestBody TranslateParam draftStringParam) {
        String draftObjectString = draftTranslateService.translate(
                CodeType.get(draftStringParam.getFrom()),
                CodeType.get(draftStringParam.getTo()),
                draftStringParam.getContent());
        return GenericResult.get(draftObjectString);
    }
}
