package com.feng.gmall.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.feng.gmall.mapper.BaseSaleAttrMapper;
import com.feng.model.product.BaseSaleAttr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 14:34
 * @Description- TODO
 */
@Repository
public class BaseSaleAttrDao {

    @Autowired
    BaseSaleAttrMapper saleAttrMapper;

    public List<BaseSaleAttr> selectList(QueryWrapper<BaseSaleAttr> wrapper) {
        return saleAttrMapper.selectList(wrapper);
    }
}
