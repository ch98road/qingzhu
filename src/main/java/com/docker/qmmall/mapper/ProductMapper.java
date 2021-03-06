package com.docker.qmmall.mapper;

import com.docker.qmmall.model.Product;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/23.
 */
public interface ProductMapper {
    Integer addProduct(Product product);
    Integer updateProduct(Product product);
    Integer updateProductState(Product product);
    LinkedList<Product> getProduct(Product product);
    LinkedList<Product> getProductProfile(Product product);
    LinkedList<Product> getProductById(Product product);
    LinkedList<Product> getProductByState(Product product);
}
