package com.docker.qmmall.service;

import com.docker.qmmall.model.PayWay;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface PayWayService {
    LinkedList<PayWay> getPayWay();
}
