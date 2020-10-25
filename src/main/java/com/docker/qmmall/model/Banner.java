package com.docker.qmmall.model;

/**
 * Created by CHEN on 2020/10/23.
 */
public class Banner {
    private Integer banner_id;
    private String banner_pic;
    private String banner_description;
    private String banner_link;

    public Banner() {
    }

    public Banner(Integer banner_id, String banner_pic, String banner_description, String banner_link) {

        this.banner_id = banner_id;
        this.banner_pic = banner_pic;
        this.banner_description = banner_description;
        this.banner_link = banner_link;
    }

    public Integer getBanner_id() {
        return banner_id;
    }

    public void setBanner_id(Integer banner_id) {
        this.banner_id = banner_id;
    }

    public String getBanner_pic() {
        return banner_pic;
    }

    public void setBanner_pic(String banner_pic) {
        this.banner_pic = banner_pic;
    }

    public String getBanner_description() {
        return banner_description;
    }

    public void setBanner_description(String banner_description) {
        this.banner_description = banner_description;
    }

    public String getBanner_link() {
        return banner_link;
    }

    public void setBanner_link(String banner_link) {
        this.banner_link = banner_link;
    }
}
