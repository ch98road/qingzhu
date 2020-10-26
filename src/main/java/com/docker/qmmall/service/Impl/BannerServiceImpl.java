package com.docker.qmmall.service.Impl;

import com.docker.qmmall.mapper.BannerMapper;
import com.docker.qmmall.model.Banner;
import com.docker.qmmall.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/26.
 */
public class BannerServiceImpl implements BannerService {

    @Autowired
    BannerMapper bannerMapper;
    @Override
    public Integer addBanner(String banner_pic, String prodicid) {
        Banner banner = new Banner(null,banner_pic,prodicid);
        bannerMapper.addBanner(banner);
        return banner.getBanner_id();
    }

    @Override
    public LinkedList<Banner> getBanner() {
        return bannerMapper.getBanner();
    }
}
