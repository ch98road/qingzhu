package com.docker.qmmall.mapper;

import com.docker.qmmall.model.Banner;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface BannerMapper {
    Integer addBanner(Banner banner);
    LinkedList<Banner> getBanner();

}
