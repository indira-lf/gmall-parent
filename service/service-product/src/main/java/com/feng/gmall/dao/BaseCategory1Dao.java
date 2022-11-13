package com.feng.gmall.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.feng.gmall.mapper.BaseCategory1Mapper;
import com.feng.model.product.BaseCategory1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 14:28
 * @Description- TODO
 */
@Repository
public class BaseCategory1Dao {

    @Autowired
    BaseCategory1Mapper category1Mapper;

    public List<BaseCategory1> selectList(QueryWrapper<BaseCategory1> wrapper) {
        return category1Mapper.selectList(wrapper);
    }
}
