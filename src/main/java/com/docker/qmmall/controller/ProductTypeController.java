package com.docker.qmmall.controller;

import com.docker.qmmall.model.ProductType;
import com.docker.qmmall.service.Impl.ProductTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
@RequestMapping("/productType")
@CrossOrigin
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
    public Map<String, Object> getTpye() {
        return productTypeService.getTpye( );
    }

}
