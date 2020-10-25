package com.docker.qmmall.model;

/**
 * Created by CHEN on 2020/10/23.
 */
public class Activitycommodity {
    private Integer activityid;
    private Integer commodityid;
    private String pritureaddress;

    public Activitycommodity(Integer activityid, Integer commodityid, String pritureaddress) {
        this.activityid = activityid;
        this.commodityid = commodityid;
        this.pritureaddress = pritureaddress;
    }
    public Activitycommodity(){}

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public String getPritureaddress() {
        return pritureaddress;
    }

    public void setPritureaddress(String pritureaddress) {
        this.pritureaddress = pritureaddress;
    }
}
