package com.docker.qmmall.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
public class CommodityController {


    /**
     * 添加商品信息
     * @return
     */
    @PostMapping("/addcommodity")
    public String addcommodity(){
        return "addCommodity";
    }



    /**
     * 获取商品简略信息
     * @return
     */
    @PostMapping("/getcommodity")
    public String getCommodity(){
        return "getCommodity";
    }


    /**
     * 获取商品详细信息
     * @return
     */
    @PostMapping("/getcommoditydetail")
    public String getcommoditydetail(){
        return "getcommoditydetail";
    }











}
