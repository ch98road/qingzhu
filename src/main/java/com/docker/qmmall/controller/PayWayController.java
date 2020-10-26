package com.docker.qmmall.controller;

import com.docker.qmmall.service.Impl.PayWayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
@RestController
@RequestMapping("/payWay")
@CrossOrigin
public class PayWayController {

    @Autowired
    PayWayServiceImpl payWayService;

    @PostMapping("/get")
    public Map<String,Object> getPayWay(){
        return payWayService.getPayWay();
    }
}
