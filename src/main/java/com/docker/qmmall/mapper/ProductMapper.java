package com.docker.qmmall.mapper;

import com.docker.qmmall.model.Product;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/23.
 */
public interface ProductMapper {
    Integer addCommodity(Product product);
    LinkedList<Product> getCommodity(Product product);





}
