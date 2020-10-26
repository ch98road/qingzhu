package com.docker.qmmall.mapper;

import com.docker.qmmall.model.Shoppingcart;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by CHEN on 2020/10/23.
 */
public interface CartMapper {

    LinkedList<Shoppingcart> getCart(Shoppingcart shoppingcart);
    Integer addCart(Shoppingcart shoppingcart);
    Integer updateCart(Shoppingcart shoppingcart);

}

