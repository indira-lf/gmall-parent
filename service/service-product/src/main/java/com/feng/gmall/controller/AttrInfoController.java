package com.feng.gmall.controller;

import com.feng.common.result.Result;
import com.feng.gmall.service.AttrInfoService;
import com.feng.model.product.BaseAttrInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 9:55
 * @Description- TODO
 */
@RestController
@RequestMapping("/admin/product")
public class AttrInfoController {

    @Autowired
    AttrInfoService attrInfoService;

    @GetMapping("/attrInfoList/{category1Id}/{category2Id}/{category3Id}")
    public Result getListInfo(@PathVariable("category1Id") Long category1Id,
                              @PathVariable("category2Id") Long category2Id,
                              @PathVariable("category3Id") Long category3Id){

        List<BaseAttrInfo> attrInfos = attrInfoService.getListInfo(category1Id,category2Id,category3Id);

        return Result.ok(attrInfos);
    }
}
