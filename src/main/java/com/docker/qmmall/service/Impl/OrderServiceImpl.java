package com.docker.qmmall.service.Impl;

import com.docker.qmmall.mapper.OrderMapper;
import com.docker.qmmall.model.Order;
import com.docker.qmmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Override
    public Integer commitOrder(Double totalprice, String user, Integer paymentstatus, String productinfo, String address) {

        Order order = new Order(null,  totalprice,  user,  paymentstatus,  productinfo,  address,  null, null,null);
        orderMapper.commitOrder(order);
        return order.getId();
    }

    @Override
    public Integer updateOrder(Double totalprice, Integer paymentstatus, String address,  Integer payway) {
        Order order = new Order(null,  totalprice,  null,  paymentstatus,  null,  address,  null, null,null);
        orderMapper.commitOrder(order);
        return order.getId();
    }

    @Override
    public Map<String,Object> getOrder(Integer id) {
        Order order = new Order();
        order.setId(id);
        Map<String,Object> res = new HashMap<>();
        res.put("res",100);
        res.put("data",orderMapper.getOrder(order));
        return res;
    }
}
