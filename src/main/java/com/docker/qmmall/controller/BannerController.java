package com.docker.qmmall.controller;

import com.docker.qmmall.model.Banner;
import com.docker.qmmall.service.Impl.BannerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
@RestController
@RequestMapping("/banner")
@CrossOrigin
public class BannerController {

//    private Integer banner_id;
//    private String banner_pic;
//    private String prodicid;

    @Autowired
    BannerServiceImpl bannerService;
    Integer addBanner(@RequestParam("banner_pic") String banner_pic,@RequestParam("prodicid") String prodicid) {

        return null;
    }

    @PostMapping("/get")
    Map<String,Object> getBanner() {
        return bannerService.getBanner();
    }

}
