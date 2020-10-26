package com.docker.qmmall.controller;

import com.docker.qmmall.model.Banner;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/26.
 */
@RestController
@RequestMapping("/banner")
public class BannerController {

//    private Integer banner_id;
//    private String banner_pic;
//    private String prodicid;

    Integer addBanner(@RequestParam("banner_pic") String banner_pic,@RequestParam("prodicid") String prodicid) {

        return null;
    }

    @PostMapping("/get")
    LinkedList getBanner() {
        return null;
    }

}
