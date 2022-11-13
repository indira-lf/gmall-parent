package com.feng.gmall.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.feng.gmall.mapper.BaseCategory3Mapper;
import com.feng.model.product.BaseCategory3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 14:29
 * @Description- TODO
 */
@Repository
public class BaseCategory3Dao {

    @Autowired
    BaseCategory3Mapper category3Mapper;

    public List<BaseCategory3> selectList(QueryWrapper<BaseCategory3> wrapper) {
        return category3Mapper.selectList(wrapper);
    }
}
