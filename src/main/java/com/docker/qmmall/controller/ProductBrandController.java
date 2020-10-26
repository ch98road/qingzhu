package com.docker.qmmall.controller;

import com.docker.qmmall.model.ProductBrand;
import com.docker.qmmall.service.Impl.ProductBrandServiceImpl;
import com.docker.qmmall.service.ProductBrandService;
import com.docker.qmmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/26.
 */
@RestController
@RequestMapping("/productBrand")
public class ProductBrandController {
    @Autowired
    ProductBrandServiceImpl productBrandService;

    @PostMapping("/get")
    public LinkedList<ProductBrand> getProductBrand() {
        return productBrandService.getProductBrand();
    }
}
