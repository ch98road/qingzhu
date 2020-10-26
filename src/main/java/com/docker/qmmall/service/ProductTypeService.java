package com.docker.qmmall.service;

import com.docker.qmmall.model.ProductType;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface ProductTypeService {

    public Integer addType(String name, Integer type);

    public Integer updateType(String name, Integer type);

    public Integer deleteType(Integer id);

    public LinkedList<ProductType> getTpye();
}
