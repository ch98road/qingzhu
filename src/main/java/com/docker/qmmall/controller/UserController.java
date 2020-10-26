package com.docker.qmmall.controller;

import com.docker.qmmall.mapper.UserMapper;
import com.docker.qmmall.model.User;
import com.docker.qmmall.service.Impl.UserServiceImpl;
import com.docker.qmmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserServiceImpl userService;

    /**
     * 用户注册
     *
     * @return
     */
    @PostMapping("/register")
    public Integer register(@RequestParam("user_name") String user_name, @RequestParam("user_nick") String user_nick, @RequestParam("user_password") String user_password,
                            @RequestParam("user_telephone") String user_telephone, @RequestParam("user_icon") String user_icon, @RequestParam("user_address") String user_address,
                            @RequestParam("user_sex") Integer user_sex, @RequestParam("user_email") String user_email) {
        return userService.register(user_name, user_nick, user_password, user_telephone, user_icon,
                user_address, user_sex, user_email);
    }

    /**
     * 用户登录
     *
     * @return
     */
    @PostMapping("/login")
    public User login(@RequestParam("user_name") String user_name, @RequestParam("user_password") String user_password,
                      @RequestParam("user_telephone") String user_telephone) {
        return userService.login(user_name, user_telephone, user_password);
    }


    /**
     * 忘记密码
     *
     * @return
     */
    @PostMapping("/update")
    public Integer updateUserInfo(@RequestParam("user_name") String user_name, @RequestParam("user_nick") String user_nick, @RequestParam("user_password") String user_password,
                            @RequestParam("user_telephone") String user_telephone, @RequestParam("user_icon") String user_icon, @RequestParam("user_address") String user_address,
                            @RequestParam("user_sex") Integer user_sex, @RequestParam("user_email") String user_email) {
        return userService.update(user_name, user_nick, user_password, user_telephone, user_icon,
                user_address, user_sex, user_email);
    }


    /**
     * 获取用户信息
     *
     * @return
     */
    @PostMapping("/getuser")
    public User getUser( @RequestParam("user_password") String user_password,
                          @RequestParam("user_telephone") String user_telephone) {
        return userService.getItem(user_telephone);
    }

}
