package com.feng.gmall.controller;

import com.feng.common.result.Result;
import com.feng.gmall.service.BaseAttrValueService;
import com.feng.model.product.BaseAttrValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 19:42
 * @Description- TODO
 */
@Slf4j
@RestController
@RequestMapping("/admin/product")
public class BaseAttrValueController {

    @Autowired
    BaseAttrValueService attrValueService;

    @GetMapping("/getAttrValueList/{attrId}")
    public Result getAttrValueList(@PathVariable("attrId") Long attrId){

        List<BaseAttrValue> attrValues = attrValueService.getAttrValueList(attrId);

        return Result.ok(attrValues);
    }

}
