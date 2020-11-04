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
    public Integer commitOrder(Double totalprice, String user, Integer paymentstatus, String productinfo, String address,  Integer payway) {

        Order order = new Order(null,  totalprice,  user,  paymentstatus,  productinfo,  address,  null, null,payway);

        orderMapper.commitOrder(order);
        return order.getId();
    }

    @Override
    public Integer updateOrder(Integer id, Integer paymentstatus) {
        Order order = new Order(id,  null,  null,  paymentstatus,  null, null ,  null, null,null);
        return orderMapper.updateOrder(order)==1?100:101;
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

    @Override
    public Map<String, Object> getOrderByName(String user_name,Integer paymentstatus) {

        Order order = new Order();
        order.setUser(user_name);
        if (paymentstatus!=-1)
            order.setPaymentstatus(paymentstatus);
        Map<String,Object> res = new HashMap<>();
        res.put("res",100);
        res.put("data",orderMapper.getOrder(order));
        return res;
    }

    @Override
    public Map<String, Object> getAllOrder() {
        Map<String,Object> res = new HashMap<>();
        res.put("res",100);
        res.put("data",orderMapper.getAllOrder());
        return res;
    }
}
