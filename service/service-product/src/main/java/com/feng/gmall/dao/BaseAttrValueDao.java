package com.feng.gmall.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.feng.gmall.mapper.BaseAttrValueMapper;
import com.feng.model.product.BaseAttrValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 19:44
 * @Description- TODO
 */
@Repository
public class BaseAttrValueDao {

    @Autowired
    BaseAttrValueMapper attrValueMapper;

    public List<BaseAttrValue> getAttrValueList(QueryWrapper<BaseAttrValue> wrapper) {
        return attrValueMapper.selectList(wrapper);
    }
}
