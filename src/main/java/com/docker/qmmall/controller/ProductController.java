package com.docker.qmmall.controller;

import com.docker.qmmall.model.Product;
import com.docker.qmmall.service.Impl.ProductServiceImpl;
import com.docker.qmmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
@RequestMapping("/product")
@CrossOrigin
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
    public Integer addproduct(@RequestParam("productname") String productname,
                              @RequestParam("productprice") Float productprice,
                              @RequestParam("productpic") String productpic,
                              @RequestParam("productcount") Integer productcount,
                              @RequestParam("productsallcount") Integer productsallcount,
                              @RequestParam("producttype") Integer producttype,
                              @RequestParam("productbrandid") Integer productbrandid,
                              @RequestParam("productstate") Integer productstate,
                              @RequestParam("productdes") String productdes) {
        return productService.addproduct(productname, productprice, productpic, productcount, productsallcount, producttype, productbrandid, productstate, productdes);
    }

    /**
     * 修改商品信息,商品上下架
     */
    @PostMapping("/update")
    public Integer updateproduct(@RequestParam("productid") Integer productid,
                                 @RequestParam("productname") String productname,
                                 @RequestParam("productprice") Float productprice,
                                 @RequestParam("productpic") String productpic,
                                 @RequestParam("productcount") Integer productcount,
                                 @RequestParam("productsallcount") Integer productsallcount,
                                 @RequestParam("producttype") Integer producttype,
                                 @RequestParam("productbrandid") Integer productbrandid,
                                 @RequestParam("productstate") Integer productstate,
                                 @RequestParam("productdes") String productdes) {
        return productService.updateproduct(productid, productname, productprice, productpic, productcount, productsallcount, producttype, productbrandid, productstate, productdes) == 1 ? 100 : 101;
    }

    /**
     * 修改商品信息
     */
    @PostMapping("/updateState")
    public Integer updateproductState(@RequestParam("productid") Integer productid,
                                      @RequestParam("productstate") Integer productstate) {
        return productService.updateproductState(productid, productstate) == 1 ? 100 : 101;
    }

    /**
     * 获取商品简略信息
     *
     * @return
     */
    @PostMapping("/get")
    public Map<String, Object> getproduct() {
        return productService.getproduct( );
    }

    @PostMapping("/getById")
    public Map<String, Object> getproductById(@RequestParam("productid") Integer productid) {
        return productService.getproductById(productid);
    }

    /**
     * gitBystatus
     */
    @PostMapping("/getByStatus")
    public Map<String, Object> getproductByStatus(@RequestParam("productstate") Integer productstate) {
        return productService.getproductByState(productstate);
    }

    /**
     * 获取商品详细信息
     *
     * @return
     */
    @PostMapping("/getdetail")
    public Map<String, Object> getproductdetail() {
        return productService.getproductdetail( );
    }


}
