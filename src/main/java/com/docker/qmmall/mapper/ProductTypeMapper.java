package com.docker.qmmall.mapper;

import com.docker.qmmall.model.ProductType;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/23.
 */
public interface ProductTypeMapper {
      Integer addType(ProductType productType);
      Integer updateType(ProductType productType);
      Integer deleteType();
      LinkedList<ProductType> getTpye(ProductType productType);
      LinkedList<ProductType> getallTpye();
}
