package com.docker.qmmall.model;

/**
 * Created by CHEN on 2020/10/23.
 */
public class Commoditytype {
    private Integer id;
    private String name;
    private Integer type;

    public Commoditytype(Integer id, String name, Integer type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Commoditytype() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
