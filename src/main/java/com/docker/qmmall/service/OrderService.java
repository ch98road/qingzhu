package com.docker.qmmall.service;

import com.docker.qmmall.model.Order;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface OrderService {
    public Integer commitOrder(Double totalprice, String user, Integer paymentstatus, String productinfo, String address);
    public Integer updateOrder(Double totalprice, Integer paymentstatus, String address,  Integer payway);
    public LinkedList<Order> getOrder(Integer id);
}
