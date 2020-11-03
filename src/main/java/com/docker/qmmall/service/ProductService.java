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

    Integer addproduct(String productname, Float productprice, String productpic, Integer productcount, Integer productsallcount, Integer producttype, Integer productbrandid, Integer productstate, String productdes);

    Integer updateproduct(Integer productid, String productname, Float productprice, String productpic, Integer productcount, Integer productsallcount, Integer producttype, Integer productbrandid, Integer productstate, String productdes);

    Integer updateproductState(Integer productid, Integer productstate);

    Map<String, Object> getproduct();

    Map<String, Object> getproductdetail();

    Map<String, Object> getproductById(Integer productid);

    Map<String, Object> getproductByState(Integer productstate);
}
