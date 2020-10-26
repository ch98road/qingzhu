package com.docker.qmmall.controller;

import com.docker.qmmall.model.PayWay;
import com.docker.qmmall.service.Impl.PayWayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/26.
 */
@RestController
@RequestMapping("/payWay")
public class PayWayController {

    @Autowired
    PayWayServiceImpl payWayService;

    @PostMapping("/get")
    public LinkedList<PayWay> getPayWay(){
        return payWayService.getPayWay();
    }
}
