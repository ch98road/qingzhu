package com.docker.qmmall.controller;

import com.docker.qmmall.model.ProductType;
import com.docker.qmmall.service.Impl.ProductTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
@RequestMapping("/productType")
public class ProductTypeController {

    //    private Integer id;
//    private String name;
//    private Integer type;
    @Autowired
    ProductTypeServiceImpl productTypeService;

    @PostMapping("/add")
    public Integer addType(@RequestParam("name") String name, @RequestParam("type") Integer type) {
        return productTypeService.addType(name, type);

    }

    @PostMapping("/update")
    public Integer updateType(@RequestParam("name") String name, @RequestParam("type") Integer type) {
        return productTypeService.updateType(name, type);

    }

    @PostMapping("/delete")
    public Integer deleteType(@RequestParam("id") Integer id) {
        return productTypeService.deleteType(id);
    }
    @PostMapping("/get")
    public LinkedList<ProductType> getTpye() {
        return productTypeService.getTpye();
    }

}
