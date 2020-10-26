package com.docker.qmmall.model;

/**
 * Created by CHEN on 2020/10/23.
 * cart的设计存在问题，有待商讨
 */
public class Shoppingcart {
    private Integer userid;
    private String productinfo;

    @Override
    public String toString() {
        return "Shoppingcart{" +
                "userid=" + userid +
                ", productinfo='" + productinfo + '\'' +
                '}';
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getProductinfo() {
        return productinfo;
    }

    public void setProductinfo(String productinfo) {
        this.productinfo = productinfo;
    }

    public Shoppingcart(Integer userid, String productinfo) {

        this.userid = userid;
        this.productinfo = productinfo;
    }

    public Shoppingcart() {
    }

}
