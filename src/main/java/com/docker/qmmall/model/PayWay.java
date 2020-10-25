package com.docker.qmmall.model;

/**
 * Created by CHEN on 2020/10/26.
 */
public class PayWay {
    private Integer id;
    private String payway;

    @Override
    public String toString() {
        return "PayWay{" +
                "id=" + id +
                ", payway='" + payway + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway;
    }

    public PayWay() {

    }

    public PayWay(Integer id, String payway) {

        this.id = id;
        this.payway = payway;
    }
}
