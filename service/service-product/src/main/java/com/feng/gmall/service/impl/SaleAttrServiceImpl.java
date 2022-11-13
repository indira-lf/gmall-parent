package com.feng.gmall.service.impl;

import com.feng.gmall.dao.BaseSaleAttrDao;
import com.feng.gmall.service.SaleAttrService;
import com.feng.model.product.BaseSaleAttr;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @time 2022/11/13 10:35
 * @Description- TODO
 */
@Slf4j
@Service
public class SaleAttrServiceImpl implements SaleAttrService {

    @Autowired
    BaseSaleAttrDao saleAttrDao;

    @Override
    public List<BaseSaleAttr> getSaleAttrList() {

        List<BaseSaleAttr> baseSaleAttrs = saleAttrDao.selectList(null);

        return baseSaleAttrs;
    }
}
