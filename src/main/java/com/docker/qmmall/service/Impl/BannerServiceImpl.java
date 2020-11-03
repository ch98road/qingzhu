package com.docker.qmmall.service.Impl;

import com.docker.qmmall.mapper.BannerMapper;
import com.docker.qmmall.model.Banner;
import com.docker.qmmall.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    BannerMapper bannerMapper;
    @Override
    public Integer addBanner(String banner_pic, Integer productid) {
        Banner banner = new Banner(null,banner_pic,productid);
        bannerMapper.addBanner(banner);
        return banner.getBanner_id();
    }

    @Override
    public Map<String,Object> getBanner() {
        Map<String,Object> res = new HashMap<>();
        res.put("res",100);
        res.put("data",bannerMapper.getBanner());
        return res;
    }
}
