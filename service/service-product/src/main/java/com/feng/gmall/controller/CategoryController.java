package com.feng.gmall.controller;

import com.feng.common.result.Result;
import com.feng.gmall.service.CategoryService;
import com.feng.model.product.BaseCategory1;
import com.feng.model.product.BaseCategory2;
import com.feng.model.product.BaseCategory3;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author
 * @time 2022/11/11 20:59
 * @Description- 数据分类
 */
@Slf4j
@RestController
@RequestMapping("/admin/product")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    /**
     * 获取一级分类数据
     * @return
     */
    @GetMapping("/getCategory1")
    public Result getCategory1(){

        List<BaseCategory1> category1s = categoryService.getCategory1();

        return Result.ok(category1s);
    }
    /**
     * 获取二级分类数据
     * @return
     */
    @GetMapping("/getCategory2/{category1Id}")
    public Result getCategory2(@PathVariable("category1Id") Long category1Id){

        List<BaseCategory2> category2s = categoryService.getCategory2(category1Id);

        return Result.ok(category2s);
    }

    /**
     * 获取三级分类数据
     * @return
     */
    @GetMapping("/getCategory3/{category2Id}")
    public Result getCategory3(@PathVariable("category2Id") Long category2Id){

        List<BaseCategory3> category3s = categoryService.getCategory3(category2Id);

        return Result.ok(category3s);
    }
}
