package com.docker.qmmall.service.Impl;

import com.docker.qmmall.mapper.ProductMapper;
import com.docker.qmmall.model.Product;
import com.docker.qmmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    ProductMapper productMapper;

    @Override
    public Integer addproduct(String productname, Float productprice, String productpic, Integer productcount, Integer productsallcount, Integer producttype, Date producttime, Integer productbrandid, Integer productstate, String productdes) {
        Product product = new Product(null, productname, productprice, productpic, productcount, productsallcount, producttype, producttime, productbrandid, productstate, productdes);
        return productMapper.addProduct(product);
    }

    @Override
    public Map<String,Object> getproduct() {
        Product product = new Product( );
        Map<String,Object> res = new HashMap<>();
        res.put("res",100);
        res.put("data",productMapper.getProductProfile(product));
        return res;
    }

    @Override
    public Map<String,Object> getproductdetail() {
        Product product = new Product( );
        Map<String,Object> res = new HashMap<>();
        res.put("res",100);
        res.put("data",productMapper.getProduct(product));
        return res;
    }

    @Override
    public Map<String, Object> getproductbyId(Integer productid) {
        Product product = new Product( );
        product.setProductid(productid);
        Map<String,Object> res = new HashMap<>();
        res.put("res",100);
        res.put("data",productMapper.getProductById(product));
        return res;
    }
}
