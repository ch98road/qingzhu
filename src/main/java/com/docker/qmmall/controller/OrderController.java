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


    @Autowired
    OrderService orderService;

    @PostMapping("/commit")
    public Integer commitOrder(@RequestParam("totalprice") Double totalprice, @RequestParam("user") String user,
                               @RequestParam("paymentstatus") Integer paymentstatus, @RequestParam("productinfo") String productinfo,
                               @RequestParam("payway")Integer payway,@RequestParam("address") String address
    ) {
        return orderService.commitOrder(totalprice, user, paymentstatus, productinfo, address,payway);
    }

    @PostMapping("/update")
    public Integer updateOrder( @RequestParam("id")Integer id,@RequestParam("paymentstatus")Integer paymentstatus
                              ) {
        return orderService.updateOrder( id, paymentstatus  );
    }

    @PostMapping("/get")
    public Map<String, Object> getOrder(@RequestParam("id")Integer id) {
        return orderService.getOrder(id);
    }


    @PostMapping("/getAll")
    public Map<String, Object> getOrder() {
        return orderService.getAllOrder();
    }

    @PostMapping("/getByUid")
    public Map<String, Object> getOrderByName(@RequestParam("user_name")String user_name,@RequestParam("paymentstatus")Integer paymentstatus) {
        return orderService.getOrderByName(user_name,paymentstatus);
    }

}
