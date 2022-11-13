package com.feng.gmall.service.impl;

import com.feng.gmall.dao.BaseAttrInfoDao;
import com.feng.gmall.service.AttrInfoService;
import com.feng.model.product.BaseAttrInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 10:46
 * @Description- TODO
 */
@Service
public class AttrInfoServiceImpl implements AttrInfoService {

    @Autowired
    BaseAttrInfoDao attrInfoDao;

    @Override
    public List<BaseAttrInfo> getListInfo(Long category1Id, Long category2Id, Long category3Id) {

        List<BaseAttrInfo> attrInfos = attrInfoDao.getAttrInfoByCategoryId(category1Id,category2Id,category3Id);

        return attrInfos;
    }
}
