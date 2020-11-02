package com.docker.qmmall.service;


import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface OrderService {
    Integer commitOrder(Double totalprice, String user, Integer paymentstatus, String productinfo, String address, Integer payway);

    Integer updateOrder(Integer id, Integer paymentstatus);

    Map<String, Object> getOrder(Integer id);

    Map<String, Object> getOrderByName(String user_name,Integer paymentstatus);
}
