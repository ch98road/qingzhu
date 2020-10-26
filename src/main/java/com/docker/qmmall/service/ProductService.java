package com.docker.qmmall.service;

import com.docker.qmmall.model.Product;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface ProductService {

    public Integer addproduct(String productname, Float productprice, String productpic, Integer productcount, Integer productsallcount, Integer producttype, Date producttime, Integer productbrandid, Integer productstate, String productdes);

    public Map<String,Object> getproduct(Integer producttype);

    public Map<String,Object> getproductdetail(Integer producttype);
}
