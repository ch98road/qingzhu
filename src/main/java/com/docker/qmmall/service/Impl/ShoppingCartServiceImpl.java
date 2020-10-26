package com.docker.qmmall.service.Impl;

import com.docker.qmmall.mapper.CartMapper;
import com.docker.qmmall.model.Shoppingcart;
import com.docker.qmmall.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    CartMapper cartMapper;

    @Override
    public Map<String,Object> getCart(Integer userid) {
        Map<String,Object> res = new HashMap<>();
        res.put("res",100);
        res.put("data",cartMapper.getCart(new Shoppingcart(userid,null)));
        return res;
    }

    @Override
    public Integer addCart(Integer userid, String productinfo) {
        return cartMapper.addCart(new Shoppingcart(userid,productinfo));
    }

    @Override
    public Integer updateCart(Integer userid, String productinfo) {
        return cartMapper.updateCart(new Shoppingcart(userid,productinfo));
    }
}
