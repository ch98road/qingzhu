package com.docker.qmmall.model;

/**
 * Created by CHEN on 2020/10/23.
 */
public class Banner {
    private Integer banner_id;
    private String banner_pic;
    private Integer productid;

    public Banner() {
    }

    @Override
    public String toString() {
        return "Banner{" +
                "banner_id=" + banner_id +
                ", banner_pic='" + banner_pic + '\'' +
                ", productid=" + productid +
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

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Banner(Integer banner_id, String banner_pic, Integer productid) {

        this.banner_id = banner_id;
        this.banner_pic = banner_pic;
        this.productid = productid;
    }
}
