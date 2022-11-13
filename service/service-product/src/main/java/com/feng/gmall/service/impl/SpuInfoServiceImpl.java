package com.feng.gmall.service.impl;

import com.feng.gmall.dao.SpuInfoDao;
import com.feng.gmall.service.SpuInfoService;
import com.feng.model.product.SpuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 18:05
 * @Description- TODO
 */
@Service
public class SpuInfoServiceImpl implements SpuInfoService {

    @Autowired
    SpuInfoDao spuInfoDao;

    @Override
    public List<SpuInfo> findSpuInfoByKeyword(String keyword) {

        List<SpuInfo> spuInfos = spuInfoDao.findSpuInfoByKeyword(keyword);

        return spuInfos;
    }
}
