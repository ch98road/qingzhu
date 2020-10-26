package com.docker.qmmall.service.Impl;

import com.docker.qmmall.mapper.ProductBrandMapper;
import com.docker.qmmall.model.ProductBrand;
import com.docker.qmmall.service.ProductBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
@Service
public class ProductBrandServiceImpl implements ProductBrandService {

    @Autowired
    ProductBrandMapper productBrandMapper;

    @Override
    public Map<String,Object> getProductBrand() {
        Map<String,Object> res = new HashMap<>();
        res.put("res",100);
        res.put("data",productBrandMapper.getProductBrand());
        return res;
    }
}
