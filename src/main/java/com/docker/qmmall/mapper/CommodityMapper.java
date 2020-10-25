package com.docker.qmmall.mapper;

import com.docker.qmmall.model.Commodity;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/23.
 */
public interface CommodityMapper {
    Integer addCommodity(Commodity commodity);
    LinkedList<Commodity> getCommodity(Commodity commodity);
}
