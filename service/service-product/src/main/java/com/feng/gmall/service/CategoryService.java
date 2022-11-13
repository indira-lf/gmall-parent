package com.feng.gmall.service;

import com.feng.model.product.BaseCategory1;
import com.feng.model.product.BaseCategory2;
import com.feng.model.product.BaseCategory3;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @time 2022/11/11 21:03
 * @Description- 分类
 */
public interface CategoryService {
    /**一级分类数据*/
    List<BaseCategory1> getCategory1();

    /**二级分类数据*/
    List<BaseCategory2> getCategory2(Long category1Id);

    /**三级分类数据*/
    List<BaseCategory3> getCategory3(Long category2Id);
}
