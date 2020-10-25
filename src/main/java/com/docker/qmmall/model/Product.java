package com.docker.qmmall.model;

import java.util.Date;

/**
 * Created by CHEN on 2020/10/23.
 */
public class Product {
    private Integer productid;
    private String productname;
    private Float productprice;
    private String productpic;
    private Integer productcount;
    private Integer productsallcount;
    private Integer producttype;
    private Date producttime;
    private Integer productbrandid;
    private Integer productstate;
    private String productdes;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Float getProductprice() {
        return productprice;
    }

    public void setProductprice(Float productprice) {
        this.productprice = productprice;
    }

    public String getProductpic() {
        return productpic;
    }

    public void setProductpic(String productpic) {
        this.productpic = productpic;
    }

    public Integer getProductcount() {
        return productcount;
    }

    public void setProductcount(Integer productcount) {
        this.productcount = productcount;
    }

    public Integer getProductsallcount() {
        return productsallcount;
    }

    public void setProductsallcount(Integer productsallcount) {
        this.productsallcount = productsallcount;
    }

    public Integer getProducttype() {
        return producttype;
    }

    public void setProducttype(Integer producttype) {
        this.producttype = producttype;
    }

    public Date getProducttime() {
        return producttime;
    }

    public void setProducttime(Date producttime) {
        this.producttime = producttime;
    }

    public Integer getProductbrandid() {
        return productbrandid;
    }

    public void setProductbrandid(Integer productbrandid) {
        this.productbrandid = productbrandid;
    }

    public Integer getProductstate() {
        return productstate;
    }

    public void setProductstate(Integer productstate) {
        this.productstate = productstate;
    }

    public String getProductdes() {
        return productdes;
    }

    public void setProductdes(String productdes) {
        this.productdes = productdes;
    }

    public Product(Integer productid, String productname, Float productprice, String productpic, Integer productcount, Integer productsallcount, Integer producttype, Date producttime, Integer productbrandid, Integer productstate, String productdes) {
        this.productid = productid;
        this.productname = productname;
        this.productprice = productprice;
        this.productpic = productpic;
        this.productcount = productcount;
        this.productsallcount = productsallcount;
        this.producttype = producttype;
        this.producttime = producttime;
        this.productbrandid = productbrandid;
        this.productstate = productstate;
        this.productdes = productdes;
    }

    public Product() {

    }
}
