package com.docker.qmmall.controller;

import com.docker.qmmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
@CrossOrigin
@RequestMapping("/order")
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

    @Autowired
    OrderService orderService;

    @PostMapping("/commit")
    public Integer commitOrder(@RequestParam("totalprice") Double totalprice, @RequestParam("user") String user, @RequestParam("paymentstatus") Integer paymentstatus,
                               @RequestParam("productinfo") String productinfo, @RequestParam("address") String address
    ) {
        return orderService.commitOrder(totalprice, user, paymentstatus, productinfo, address);
    }

    @PostMapping("/update")
    public Integer updateOrder(@RequestParam("totalprice")Double totalprice, @RequestParam("paymentstatus")Integer paymentstatus,
                              @RequestParam("address")String address,  @RequestParam("payway")Integer payway) {
        return orderService.updateOrder( totalprice,  paymentstatus,  address,   payway);
    }

    @PostMapping("/get")
    public Map<String, Object> getOrder(@RequestParam("id")Integer id) {
        return orderService.getOrder(id);
    }


}
