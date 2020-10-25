package com.docker.qmmall.mapper;

import com.docker.qmmall.model.Activitycommodity;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/23.
 */
public interface ActivitycommodityMapper {

//    private Integer activityid;
//    private Integer commodityid;
//    private String pritureaddress;
    Integer addAC(Activitycommodity activitycommodity);
    LinkedList<Activitycommodity> getActivitycommodity(Activitycommodity activitycommodity);
}
