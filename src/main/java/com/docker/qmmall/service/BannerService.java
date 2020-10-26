package com.docker.qmmall.service;

import com.docker.qmmall.model.Banner;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface BannerService {

    Integer addBanner(String banner_pic,String prodicid);
    Map<String,Object> getBanner();
}
