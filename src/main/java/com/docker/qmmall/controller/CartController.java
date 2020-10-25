package com.docker.qmmall.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
public class CartController {



    @PostMapping("/getcart")
    public String getCart(){
        return "getCart";
    }




}
