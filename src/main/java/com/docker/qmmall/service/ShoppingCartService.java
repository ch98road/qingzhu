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
    public Map<String,Object> getCart(Integer userid);

    public Integer addCart( Integer userid, String productinfo);

    public Integer updateCart(Integer userid, String productinfo);

}
