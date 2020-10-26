package com.docker.qmmall.service.Impl;

import com.docker.qmmall.mapper.ProductBrandMapper;
import com.docker.qmmall.model.ProductBrand;
import com.docker.qmmall.service.ProductBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/26.
 */
@Service
public class ProductBrandServiceImpl implements ProductBrandService {

    @Autowired
    ProductBrandMapper productBrandMapper;

    @Override
    public LinkedList<ProductBrand> getProductBrand() {
        return productBrandMapper.getProductBrand();
    }
}
