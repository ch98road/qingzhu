package com.docker.qmmall.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
public class AdminController {


    @PostMapping("/getadmin")
    public String getAdmin() {
        return "getadmin";
    }

    @PostMapping("/daleteadmin")
    public String daleteAdmin() {
        return "daleteadmin";
    }


    @PostMapping("/updateadmin")
    public String updateAdmin() {
        return "updateadmin";
    }

    @PostMapping("/addadmin")
    public String addAdmin() {
        return "addadmin";
    }

}
