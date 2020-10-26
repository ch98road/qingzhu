package com.docker.qmmall.controller;

import com.docker.qmmall.model.Shoppingcart;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
@RequestMapping("/cart")
public class CartController {

//    private Integer userid;
//    private String productinfo;
    @PostMapping("/get")
    public LinkedList<Shoppingcart> getCart(@RequestParam("userid") Integer userid) {
        return null;
    }

    @PostMapping("/add")
    public Integer addCart(@RequestParam("userid") Integer userid,@RequestParam("productinfo") String productinfo) {
        return null;
    }

    @PostMapping("/update")
    public Integer updateCart() {
        return null;
    }


}
