package com.docker.qmmall.controller;

import com.docker.qmmall.model.Product;
import com.docker.qmmall.service.Impl.ProductServiceImpl;
import com.docker.qmmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
@RequestMapping("/product")
public class ProductController {


//    private Integer productid;
//    private String productname;
//    private Float productprice;
//    private String productpic;
//    private Integer productcount;
//    private Integer productsallcount;
//    private Integer producttype;
//    private Date producttime;
//    private Integer productbrandid;
//    private Integer productstate;
//    private String productdes;

    @Autowired
    ProductServiceImpl productService;

    /**
     * 添加商品信息
     *
     * @return
     */
    @PostMapping("/add")
    public Integer addproduct(@RequestParam("productname") String productname, @RequestParam("productprice") Float productprice, @RequestParam("productpic") String productpic,
                              @RequestParam("productcount") Integer productcount, @RequestParam("productsallcount") Integer productsallcount, @RequestParam("producttype") Integer producttype,
                              @RequestParam("producttime") Date producttime, @RequestParam("productbrandid") Integer productbrandid, @RequestParam("productstate") Integer productstate,
                              @RequestParam("productdes") String productdes) {

        return productService.addproduct(productname, productprice, productpic, productcount, productsallcount, producttype, producttime, productbrandid, productstate, productdes);
    }


    /**
     * 获取商品简略信息
     *
     * @return
     */
    @PostMapping("/get")
    public LinkedList<Product> getproduct(@RequestParam("producttype") Integer producttype) {
        return productService.getproduct(producttype);
    }


    /**
     * 获取商品详细信息
     *
     * @return
     */
    @PostMapping("/getdetail")
    public LinkedList<Product> getproductdetail(@RequestParam("producttype") Integer producttype) {
        return productService.getproductdetail(producttype);
    }


}
