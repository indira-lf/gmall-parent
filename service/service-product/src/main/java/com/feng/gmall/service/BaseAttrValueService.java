package com.feng.gmall.service;

import com.feng.model.product.BaseAttrValue;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 19:43
 * @Description- TODO
 */
public interface BaseAttrValueService {
    List<BaseAttrValue> getAttrValueList(Long attrId);
}
