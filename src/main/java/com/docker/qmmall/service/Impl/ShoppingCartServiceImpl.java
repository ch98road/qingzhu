package com.docker.qmmall.service.Impl;

import com.docker.qmmall.mapper.CartMapper;
import com.docker.qmmall.model.Shoppingcart;
import com.docker.qmmall.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/26.
 */
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    CartMapper cartMapper;

    @Override
    public LinkedList<Shoppingcart> getCart(Integer userid) {
        return cartMapper.getCart(new Shoppingcart(userid,null));
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
