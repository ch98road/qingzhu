package com.docker.qmmall.model;

/**
 * Created by CHEN on 2020/10/23.
 */
public class Shoppingcart {
    private Integer userid;
    private Integer commodityid;
    private Integer number;
    private Float price;
    private Float totalprice;

    public Shoppingcart() {
    }

    public Integer getUserid() {

        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
    }

    public Shoppingcart(Integer userid, Integer commodityid, Integer number, Float price, Float totalprice) {

        this.userid = userid;
        this.commodityid = commodityid;
        this.number = number;
        this.price = price;
        this.totalprice = totalprice;
    }
}
