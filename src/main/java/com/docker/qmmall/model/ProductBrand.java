package com.docker.qmmall.model;

/**
 * Created by CHEN on 2020/10/25.
 */
public class ProductBrand {
    private Integer id;
    private String priductbrand;

    public ProductBrand() {
    }

    @Override
    public String toString() {
        return "ProductBrandMapper{" +
                "id=" + id +
                ", priductbrand='" + priductbrand + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPriductbrand() {
        return priductbrand;
    }

    public void setPriductbrand(String priductbrand) {
        this.priductbrand = priductbrand;
    }

    public ProductBrand(Integer id, String priductbrand) {
        this.id = id;
        this.priductbrand = priductbrand;
    }
}
