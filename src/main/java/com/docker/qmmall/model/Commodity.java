package com.docker.qmmall.model;

import java.util.Date;

/**
 * Created by CHEN on 2020/10/23.
 */
public class Commodity {
    private Integer id;
    private String name;
    private String administraor;
    private Integer type;
    private String details;
    private String pictureaddress;
    private Date updatetime;

    public Commodity(Integer id, String name, String administraor, Integer type, String details, String pictureaddress, Date updatetime) {
        this.id = id;
        this.name = name;
        this.administraor = administraor;
        this.type = type;
        this.details = details;
        this.pictureaddress = pictureaddress;
        this.updatetime = updatetime;
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

    public String getAdministraor() {
        return administraor;
    }

    public void setAdministraor(String administraor) {
        this.administraor = administraor;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPictureaddress() {
        return pictureaddress;
    }

    public void setPictureaddress(String pictureaddress) {
        this.pictureaddress = pictureaddress;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Commodity() {

    }
}
