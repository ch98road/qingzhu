package com.docker.qmmall.service;

import com.docker.qmmall.model.ProductBrand;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface ProductBrandService {
    LinkedList<ProductBrand> getProductBrand();
}
