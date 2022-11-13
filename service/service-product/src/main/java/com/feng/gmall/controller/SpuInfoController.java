package com.feng.gmall.controller;

import com.feng.common.result.Result;
import com.feng.gmall.service.SpuInfoService;
import com.feng.model.product.SpuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 18:03
 * @Description- TODO
 */
@RestController
@RequestMapping("/admin/product")
public class SpuInfoController {

    @Autowired
    SpuInfoService spuInfoService;

    @GetMapping("/findSpuInfoByKeyword/{keyword}")
    public Result findSpuInfoByKeyword(@PathVariable("keyword") String keyword){

        List<SpuInfo> spuInfos = spuInfoService.findSpuInfoByKeyword(keyword);

        return Result.ok(spuInfos);
    }

}
