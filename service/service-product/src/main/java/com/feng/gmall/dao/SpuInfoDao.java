package com.feng.gmall.dao;

import com.feng.gmall.mapper.SpuInfoMapper;
import com.feng.model.product.SpuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 18:05
 * @Description- TODO
 */
@Repository
public class SpuInfoDao {

    @Autowired
    SpuInfoMapper spuInfoMapper;

    public List<SpuInfo> findSpuInfoByKeyword(String keyword) {
        return spuInfoMapper.findSpuInfoByKeyword(keyword);
    }
}
