package com.feng.gmall.dao;

import com.feng.gmall.mapper.BaseAttrInfoMapper;
import com.feng.model.product.BaseAttrInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 14:24
 * @Description- TODO
 */
@Repository
public class BaseAttrInfoDao {

    @Autowired
    BaseAttrInfoMapper attrInfoMapper;

    public List<BaseAttrInfo> getAttrInfoByCategoryId(Long category1Id, Long category2Id, Long category3Id) {
        return attrInfoMapper.getAttrInfoByCategoryId(category1Id,category2Id,category3Id);
    }
}
