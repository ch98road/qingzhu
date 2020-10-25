package com.docker.qmmall.mapper;

import com.docker.qmmall.model.ProductBrand;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface ProductBrandMapper {
    LinkedList<ProductBrand> getProductBrand();
}
