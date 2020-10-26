package com.docker.qmmall.service.Impl;

import com.docker.qmmall.mapper.PayWayMapper;
import com.docker.qmmall.model.PayWay;
import com.docker.qmmall.service.PayWayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
@Service
public class PayWayServiceImpl implements PayWayService {
    @Autowired
    PayWayMapper payWayMapper;
    @Override
    public Map<String,Object> getPayWay() {
        Map<String,Object> res = new HashMap<>();
        res.put("res",100);
        res.put("data",payWayMapper.getPayWay());
        return res;

    }
}
