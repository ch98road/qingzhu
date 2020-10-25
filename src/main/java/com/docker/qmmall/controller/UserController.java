package com.docker.qmmall.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
public class UserController {

    /**
     * 用户注册
     * @return
     */
    @PostMapping("/register")
    public String register() {


        return "register";
    }

    /**
     * 用户登录
     * @return
     */
    @PostMapping("/login")
    public String login() {
        return "login";
    }


    /**
     * 忘记密码
     * @return
     */
    @PostMapping("/findpass")
    public String findPass() {
        return "pass";
    }


    /**
     * 获取用户信息
     * @return
     */
    @PostMapping("/getuser")
    public String getUser(){
        return "getuser";
    }

    public String getUserInfo(){
        return "";
    }

    public String updateUserInfo(){
        return "";
    }
}
