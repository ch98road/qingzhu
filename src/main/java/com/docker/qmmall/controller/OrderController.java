package com.docker.qmmall.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
public class OrderController {


//    private Integer id;
//    private Double totalprice;
//    private String user;
//    private Integer paymentstatus;
//    private String productinfo;
//    private String address;
//    private Date ordertime;
//    private Date finishtime;
//    private Integer payway;


    public Integer commitOrder(@RequestParam("totalprice") Double totalprice,@RequestParam("user") String user,@RequestParam("paymentstatus") Integer paymentstatus,
                              @RequestParam("productinfo") String productinfo,@RequestParam("address") String address,@RequestParam("ordertime") Date ordertime,
                              @RequestParam("finishtime") Date finishtime,@RequestParam("payway") Integer payway){
        return null;
    }

    public String updateOrder(){
        return null;
    }
    public String getOrder(){
        return null;
    }


}
