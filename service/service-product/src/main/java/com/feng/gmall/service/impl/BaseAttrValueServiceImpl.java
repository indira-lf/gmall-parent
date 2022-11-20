package com.feng.gmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.feng.gmall.dao.BaseAttrValueDao;
import com.feng.gmall.service.BaseAttrValueService;
import com.feng.model.product.BaseAttrValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 19:44
 * @Description- TODO
 */
@Service
public class BaseAttrValueServiceImpl implements BaseAttrValueService {

    @Autowired
    BaseAttrValueDao attrValueDao;

    @Override
    public List<BaseAttrValue> getAttrValueList(Long attrId) {

        QueryWrapper<BaseAttrValue> wrapper = new QueryWrapper<>();
        wrapper.eq("attr_id",attrId);

        List<BaseAttrValue> attrValues = attrValueDao.getAttrValueList(wrapper);

        return attrValues;
    }
}
