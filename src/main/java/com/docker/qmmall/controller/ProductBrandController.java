package com.docker.qmmall.controller;

import com.docker.qmmall.model.ProductBrand;
import com.docker.qmmall.service.Impl.ProductBrandServiceImpl;
import com.docker.qmmall.service.ProductBrandService;
import com.docker.qmmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
@RestController
@RequestMapping("/productBrand")
@CrossOrigin
public class ProductBrandController {
    @Autowired
    ProductBrandServiceImpl productBrandService;

    @PostMapping("/get")
    public Map<String,Object> getProductBrand() {
        return productBrandService.getProductBrand();
    }

    @PostMapping("/add")
    public Integer getProductBrand(@RequestParam("productbrand")String productbrand) {
        return productBrandService.addProductBrand(productbrand);
    }
}
