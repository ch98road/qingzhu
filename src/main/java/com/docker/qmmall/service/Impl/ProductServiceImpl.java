package com.docker.qmmall.service.Impl;

import com.docker.qmmall.mapper.ProductMapper;
import com.docker.qmmall.model.Product;
import com.docker.qmmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedList;

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
    public LinkedList<Product> getproduct(Integer producttype) {
        Product product = new Product( );
        product.setProducttype(producttype);
        return productMapper.getProductProfile(product);
    }

    @Override
    public LinkedList<Product> getproductdetail(Integer producttype) {
        Product product = new Product( );
        product.setProducttype(producttype);
        return productMapper.getProduct(product);
    }
}
