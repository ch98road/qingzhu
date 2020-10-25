package com.docker.qmmall.mapper;

import com.docker.qmmall.model.Order;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/23.
 */
public interface OrderMapper {


    Integer commitOrder(Order order);
    /**
     * 根据用户名查询，可以加上状态，id
     * @param order
     * @return
     */
    LinkedList<Order> getOrder(Order order);
}
