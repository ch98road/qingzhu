package com.docker.qmmall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
public class HelloController {



    @GetMapping("/hello")
    public String helloworld(){
        return "nihao!";
    }

}
