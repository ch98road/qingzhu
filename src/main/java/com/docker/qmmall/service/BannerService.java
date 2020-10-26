package com.docker.qmmall.service;

import com.docker.qmmall.model.Banner;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface BannerService {

    Integer addBanner(String banner_pic,String prodicid);
    LinkedList<Banner> getBanner();
}
