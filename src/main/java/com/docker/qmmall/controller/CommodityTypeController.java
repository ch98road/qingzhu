package com.docker.qmmall.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
public class CommodityTypeController {

    public String addType(){
        return "add";
    }

    public String updateType(){
        return "update";
    }

    public String deleteType(){
        return "delete";
    }

    public String getTpye(){
        return "get";
    }




}
