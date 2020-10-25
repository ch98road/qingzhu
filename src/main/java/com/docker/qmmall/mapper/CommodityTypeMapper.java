package com.docker.qmmall.mapper;

import com.docker.qmmall.model.Commoditytype;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/23.
 */
public interface CommodityTypeMapper {
      Integer addType(Commoditytype commoditytype);
      Integer updateType(Commoditytype commoditytype);
      Integer deleteType();
      LinkedList<Commoditytype> getTpye(Commoditytype commoditytype);
}
