package com.feng.gmall.controller;

import com.feng.common.result.Result;
import com.feng.gmall.service.SaleAttrService;
import com.feng.model.product.BaseSaleAttr;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 10:31
 * @Description- 销售属性
 */
@Slf4j
@RestController
@RequestMapping("/admin/product")
public class SaleAttrController {


    @Autowired
    SaleAttrService saleAttrService;
    /**
     * 获取销售属性数据
     * @return
     */
    @GetMapping("/baseSaleAttrList")
    public Result getSaleAttrList(){

        List<BaseSaleAttr> saleList = saleAttrService.getSaleAttrList();

        return Result.ok(saleList);
    }
}
