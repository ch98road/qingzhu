package com.docker.qmmall.model;

/**
 * Created by CHEN on 2020/10/23.
 */
public class Banner {
    private Integer banner_id;
    private String banner_pic;
    private String prodicid;

    public Banner() {
    }

    @Override
    public String toString() {
        return "Banner{" +
                "banner_id=" + banner_id +
                ", banner_pic='" + banner_pic + '\'' +
                ", prodicid='" + prodicid + '\'' +
                '}';
    }

    public Integer getBanner_id() {
        return banner_id;
    }

    public void setBanner_id(Integer banner_id) {
        this.banner_id = banner_id;
    }

    public String getBanner_pic() {
        return banner_pic;
    }

    public void setBanner_pic(String banner_pic) {
        this.banner_pic = banner_pic;
    }

    public String getProdicid() {
        return prodicid;
    }

    public void setProdicid(String prodicid) {
        this.prodicid = prodicid;
    }

    public Banner(Integer banner_id, String banner_pic, String prodicid) {

        this.banner_id = banner_id;
        this.banner_pic = banner_pic;
        this.prodicid = prodicid;
    }
}
