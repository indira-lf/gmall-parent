package com.feng.gmall.service;

import com.feng.model.product.SpuInfo;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 18:05
 * @Description- TODO
 */
public interface SpuInfoService {
    List<SpuInfo> findSpuInfoByKeyword(String keyword);
}
