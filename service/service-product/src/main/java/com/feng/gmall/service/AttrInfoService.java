package com.feng.gmall.service;

import com.feng.model.product.BaseAttrInfo;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 10:46
 * @Description- TODO
 */
public interface AttrInfoService {
    List<BaseAttrInfo> getListInfo(Long category1Id, Long category2Id, Long category3Id);
}
