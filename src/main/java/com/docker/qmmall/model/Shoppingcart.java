package com.docker.qmmall.model;

/**
 * Created by CHEN on 2020/10/23.
 * cart的设计存在问题，有待商讨
 */
public class Shoppingcart {
    private Integer userid;
    private Integer product;
    private Integer number;
    private Float price;
    private Float totalprice;

    public Shoppingcart() {
    }

    @Override
    public String toString() {
        return "Shoppingcart{" +
                "userid=" + userid +
                ", product=" + product +
                ", number=" + number +
                ", price=" + price +
                ", totalprice=" + totalprice +
                '}';
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
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

    public Shoppingcart(Integer userid, Integer product, Integer number, Float price, Float totalprice) {
        this.userid = userid;
        this.product = product;
        this.number = number;
        this.price = price;
        this.totalprice = totalprice;
    }
}
