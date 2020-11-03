package com.docker.qmmall.service;

import com.docker.qmmall.model.ProductBrand;

import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface ProductBrandService {
    Map<String, Object> getProductBrand();

    Integer addProductBrand(String productbrand);
}
