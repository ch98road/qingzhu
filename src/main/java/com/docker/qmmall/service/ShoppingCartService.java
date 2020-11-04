package com.docker.qmmall.service;

import com.docker.qmmall.model.Shoppingcart;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface ShoppingCartService {
    Map<String, Object> getCart(Integer userid);

    Integer addCart(Integer userid, String productinfo);

    Integer updateCart(Integer userid, String productinfo);

}
