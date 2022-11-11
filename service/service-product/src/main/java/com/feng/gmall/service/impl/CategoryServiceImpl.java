package com.feng.gmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.feng.gmall.mapper.BaseCategory1Mapper;
import com.feng.gmall.mapper.BaseCategory2Mapper;
import com.feng.gmall.mapper.BaseCategory3Mapper;
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
    BaseCategory1Mapper category1Mapper;

    @Autowired
    BaseCategory2Mapper category2Mapper;

    @Autowired
    BaseCategory3Mapper category3Mapper;

    /**
     * 一级分类数据
     * @return
     */
    @Override
    public List<BaseCategory1> getCategory1() {
        return category1Mapper.selectList(null);
    }

    /**
     * 二级分类数据
     * @return
     */
    @Override
    public List<BaseCategory2> getCategory2(Long category1Id) {

        QueryWrapper<BaseCategory2> wrapper = new QueryWrapper<>();
        wrapper.eq("category1_id", category1Id);

        List<BaseCategory2> category2s = category2Mapper.selectList(wrapper);
        return category2s;
    }

    @Override
    public List<BaseCategory3> getCategory3(Long category2Id) {
        QueryWrapper<BaseCategory3> wrapper = new QueryWrapper<>();
        wrapper.eq("category2_id", category2Id);

        List<BaseCategory3> category3s = category3Mapper.selectList(wrapper);
        return category3s;
    }
}
