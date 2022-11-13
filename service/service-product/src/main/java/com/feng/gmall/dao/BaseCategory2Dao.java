package com.feng.gmall.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.feng.gmall.mapper.BaseCategory2Mapper;
import com.feng.model.product.BaseCategory2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 14:29
 * @Description- TODO
 */
@Repository
public class BaseCategory2Dao {

    @Autowired
    BaseCategory2Mapper category2Mapper;

    public List<BaseCategory2> selectList(QueryWrapper<BaseCategory2> wrapper) {
        return category2Mapper.selectList(wrapper);
    }
}
