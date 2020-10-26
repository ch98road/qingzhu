package com.docker.qmmall.service;


import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface OrderService {
    public Integer commitOrder(Double totalprice, String user, Integer paymentstatus, String productinfo, String address);
    public Integer updateOrder(Double totalprice, Integer paymentstatus, String address,  Integer payway);
    public Map<String,Object> getOrder(Integer id);
}
