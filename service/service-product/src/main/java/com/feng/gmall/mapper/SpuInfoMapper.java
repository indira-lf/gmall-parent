package com.feng.gmall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.feng.model.product.SpuInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 18:06
 * @Description- TODO
 */
@Mapper
public interface SpuInfoMapper extends BaseMapper<SpuInfo> {
    List<SpuInfo> findSpuInfoByKeyword(@Param("keyword") String keyword);
}
