package com.zvvnmod.meco.draft.translate;

import com.alibaba.fastjson.JSONObject;
import com.zvvnmod.meco.common.JsonUtil;
import com.zvvnmod.meco.translate.enumeration.CodeType;
import com.zvvnmod.meco.translate.service.TranslateService;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/10/20
 * WEEK  : 周二
 * TIME  : 15:45
 */
@Component
public class DraftTranslateService {
    @Resource
    private TranslateService translateService;


    public String translate(CodeType from,
                            CodeType to,
                            String str) {
        if (str == null) {
            return null;
        }
        DraftObject draftObject = JsonUtil.deserialize(str, DraftObject.class);
        if (draftObject == null) {
            return null;
        }
        if (!CollectionUtils.isEmpty(draftObject.getBlocks())) {
            for (Block block : draftObject.getBlocks()) {
                block.setText(translateService.translate(from, to, block.getText()));
            }
        }
        if (!CollectionUtils.isEmpty(draftObject.getEntityMap())) {
            for (DraftObject.Entity value : draftObject.getEntityMap().values()) {
                if (value.getType().equals("h-text")) {
                    String hTextDraftString = translate(from, to, value.getData().get("rawContent").toString());
                    value.setData(JSONObject.parseObject("{ \"rawContent\" : " + hTextDraftString + "}"));
                }
            }
        }

        return JsonUtil.serialize(draftObject);
    }

}
