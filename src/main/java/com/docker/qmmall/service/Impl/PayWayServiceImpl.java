package com.docker.qmmall.service.Impl;

import com.docker.qmmall.mapper.PayWayMapper;
import com.docker.qmmall.model.PayWay;
import com.docker.qmmall.service.PayWayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/26.
 */
@Service
public class PayWayServiceImpl implements PayWayService {
    @Autowired
    PayWayMapper payWayMapper;
    @Override
    public LinkedList<PayWay> getPayWay() {
        return payWayMapper.getPayWay();
    }
}
