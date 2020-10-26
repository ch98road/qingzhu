package com.docker.qmmall.service.Impl;

import com.docker.qmmall.mapper.ProductTypeMapper;
import com.docker.qmmall.model.ProductType;
import com.docker.qmmall.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
@Service
public class ProductTypeServiceImpl implements ProductTypeService {


    @Autowired
    ProductTypeMapper productTypeMapper;

    @Override
    public Integer addType(String name, Integer type) {
        ProductType productType = new ProductType(null,name,type);
        return productTypeMapper.addType(productType);
    }

    @Override
    public Integer updateType(String name, Integer type) {
        ProductType productType = new ProductType(null,name,type);
        return productTypeMapper.updateType(productType);
    }

    @Override
    public Integer deleteType(Integer id) {
        ProductType productType = new ProductType(id,null,null);

        return productTypeMapper.deleteType(productType);

    }

    @Override
    public Map<String,Object> getTpye() {
        Map<String,Object> res = new HashMap<>();
        res.put("res",100);
        res.put("data",productTypeMapper.getallTpye();
        return res;
    }
}
