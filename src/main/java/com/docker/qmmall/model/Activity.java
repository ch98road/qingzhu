package com.docker.qmmall.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by CHEN on 2020/10/23.
 */

public class Activity {
    private Integer activityid;
    private String activityname;
    private Integer activitystate;
    private String activitypic;
    private String activitystarttime;
    private String activityendtime;
    private Integer productid;
    private Integer activitytype;

    @Override
    public String toString() {
        return "Activity{" +
                "activityid=" + activityid +
                ", activityname='" + activityname + '\'' +
                ", activitystate=" + activitystate +
                ", activitypic='" + activitypic + '\'' +
                ", activitystarttime=" + activitystarttime +
                ", activityendtime=" + activityendtime +
                ", productid=" + productid +
                ", activetytype=" + activitytype +
                '}';
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public String getActivityname() {
        return activityname;
    }

    public void setActivityname(String activityname) {
        this.activityname = activityname;
    }

    public Integer getActivitystate() {
        return activitystate;
    }

    public void setActivitystate(Integer activitystate) {
        this.activitystate = activitystate;
    }

    public String getActivitypic() {
        return activitypic;
    }

    public void setActivitypic(String activitypic) {
        this.activitypic = activitypic;
    }

    public Activity(Integer activityid, String activityname, Integer activitystate, String activitypic, String activitystarttime, String activityendtime, Integer productid, Integer activitytype) {
        this.activityid = activityid;
        this.activityname = activityname;
        this.activitystate = activitystate;
        this.activitypic = activitypic;
        this.activitystarttime = activitystarttime;
        this.activityendtime = activityendtime;
        this.productid = productid;
        this.activitytype = activitytype;
    }

    public String getActivitystarttime() {

        return activitystarttime;
    }

    public void setActivitystarttime(String activitystarttime) {
        this.activitystarttime = activitystarttime;
    }

    public String getActivityendtime() {
        return activityendtime;
    }

    public void setActivityendtime(String activityendtime) {
        this.activityendtime = activityendtime;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getActivitytype() {
        return activitytype;
    }

    public void setActivitytype(Integer activitytype) {
        this.activitytype = activitytype;
    }

    public Integer getActivetytype() {
        return activitytype;
    }

    public void setActivetytype(Integer activetytype) {
        this.activitytype = activetytype;
    }

    public Activity() {

    }


}
