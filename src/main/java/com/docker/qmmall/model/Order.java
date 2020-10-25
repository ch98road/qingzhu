package com.docker.qmmall.model;

/**
 * Created by CHEN on 2020/10/23.
 */
public class Order {
    private Integer id;
    private Double totalprice;
    private String user;
    private Integer paymentstatus;

    public Order() {
    }

    public Order(Integer id, Double totalprice, String user, Integer paymentstatus) {

        this.id = id;
        this.totalprice = totalprice;
        this.user = user;
        this.paymentstatus = paymentstatus;
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
}
