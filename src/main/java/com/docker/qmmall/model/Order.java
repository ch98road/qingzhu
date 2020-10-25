package com.docker.qmmall.model;

import java.util.Date;

/**
 * Created by CHEN on 2020/10/23.
 */
public class Order {
    private Integer id;
    private Double totalprice;
    private String user;
    private Integer paymentstatus;
    private String productinfo;
    private String address;
    private Date ordertime;
    private Date finishtime;
    private Integer payway;


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", totalprice=" + totalprice +
                ", user='" + user + '\'' +
                ", paymentstatus=" + paymentstatus +
                ", productinfo='" + productinfo + '\'' +
                ", address='" + address + '\'' +
                ", ordertime=" + ordertime +
                ", finishtime=" + finishtime +
                ", payway=" + payway +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(Integer paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    public String getProductinfo() {
        return productinfo;
    }

    public void setProductinfo(String productinfo) {
        this.productinfo = productinfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public Integer getPayway() {
        return payway;
    }

    public void setPayway(Integer payway) {
        this.payway = payway;
    }

    public Order() {

    }

    public Order(Integer id, Double totalprice, String user, Integer paymentstatus, String productinfo, String address, Date ordertime, Date finishtime, Integer payway) {

        this.id = id;
        this.totalprice = totalprice;
        this.user = user;
        this.paymentstatus = paymentstatus;
        this.productinfo = productinfo;
        this.address = address;
        this.ordertime = ordertime;
        this.finishtime = finishtime;
        this.payway = payway;
    }
}
