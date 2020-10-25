package com.docker.qmmall.model;

/**
 * Created by CHEN on 2020/10/23.
 */

public class Activity {
    private Integer activityid;
    private String activityname;
    private String activitycontent;
    private Integer activitystate;

    public Activity(Integer activityid, String activityname, String activitycontent, Integer activitystate) {
        this.activityid = activityid;
        this.activityname = activityname;
        this.activitycontent = activitycontent;
        this.activitystate = activitystate;
    }

    public Activity() {
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

    public String getActivitycontent() {
        return activitycontent;
    }

    public void setActivitycontent(String activitycontent) {
        this.activitycontent = activitycontent;
    }

    public Integer getActivitystate() {
        return activitystate;
    }

    public void setActivitystate(Integer activitystate) {
        this.activitystate = activitystate;
    }
}
