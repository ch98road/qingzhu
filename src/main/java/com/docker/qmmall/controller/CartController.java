package com.docker.qmmall.controller;

import com.docker.qmmall.model.Shoppingcart;
import com.docker.qmmall.service.Impl.ShoppingCartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
@RequestMapping("/cart")
@CrossOrigin
public class CartController {

    //    private Integer userid;
//    private String productinfo;
    @Autowired
    ShoppingCartServiceImpl shoppingCartService;

    @PostMapping("/get")
    public Map<String, Object> getCart(@RequestParam("userid") Integer userid) {
        return shoppingCartService.getCart(userid);
    }

    @PostMapping("/add")
    public Integer addCart(@RequestParam("userid") Integer userid, @RequestParam("productinfo") String productinfo) {
        return shoppingCartService.addCart(userid, productinfo);
    }

    @PostMapping("/update")
    public Integer updateCart(@RequestParam("userid") Integer userid, @RequestParam("productinfo") String productinfo) {
        return shoppingCartService.updateCart(userid, productinfo);
    }


}
