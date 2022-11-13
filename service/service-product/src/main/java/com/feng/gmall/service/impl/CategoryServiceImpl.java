package com.feng.gmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.feng.gmall.dao.BaseCategory1Dao;
import com.feng.gmall.dao.BaseCategory2Dao;
import com.feng.gmall.dao.BaseCategory3Dao;
import com.feng.gmall.service.CategoryService;
import com.feng.model.product.BaseCategory1;
import com.feng.model.product.BaseCategory2;
import com.feng.model.product.BaseCategory3;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @time 2022/11/11 21:03
 * @Description- 分类
 */
@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    BaseCategory1Dao category1Dao;

    @Autowired
    BaseCategory2Dao category2Dao;

    @Autowired
    BaseCategory3Dao category3Dao;

    /**
     * 一级分类数据
     * @return
     */
    @Override
    public List<BaseCategory1> getCategory1() {
        return category1Dao.selectList(null);
    }

    /**
     * 二级分类数据
     * @return
     */
    @Override
    public List<BaseCategory2> getCategory2(Long category1Id) {

        QueryWrapper<BaseCategory2> wrapper = new QueryWrapper<>();
        wrapper.eq("category1_id", category1Id);

        List<BaseCategory2> category2s = category2Dao.selectList(wrapper);
        return category2s;
    }

    @Override
    public List<BaseCategory3> getCategory3(Long category2Id) {
        QueryWrapper<BaseCategory3> wrapper = new QueryWrapper<>();
        wrapper.eq("category2_id", category2Id);

        List<BaseCategory3> category3s = category3Dao.selectList(wrapper);
        return category3s;
    }
}
