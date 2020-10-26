package com.docker.qmmall.model;

/**
 * Created by CHEN on 2020/10/25.
 */
public class ProductBrand {
    private Integer id;
    private String productbrand;

    public ProductBrand() {
    }

    @Override
    public String toString() {
        return "ProductBrandMapper{" +
                "id=" + id +
                ", priductbrand='" + productbrand + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPriductbrand() {
        return productbrand;
    }

    public void setproductbrand(String productbrand) {
        this.productbrand = productbrand;
    }

    public ProductBrand(Integer id, String productbrand) {
        this.id = id;
        this.productbrand = productbrand;
    }
}
