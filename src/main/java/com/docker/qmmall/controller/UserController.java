package com.docker.qmmall.controller;

import com.docker.qmmall.model.User;
import com.docker.qmmall.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {


    @Autowired
    UserServiceImpl userService;

    /**
     * 用户注册
     *
     * @return
     */
    @PostMapping("/register")
    public Map<String, Object> register(@RequestParam("user_name") String user_name, @RequestParam("user_nick") String user_nick, @RequestParam("user_password") String user_password,
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
        return userService.update(user_name, user_password, user_nick, user_telephone, user_icon,
                user_address, user_sex, user_email);
    }

    @PostMapping("/findPass")
    public Integer findPass(@RequestParam("user_id") Integer user_id, @RequestParam("user_password") String user_password) {
        return userService.findPass(user_id, user_password);
    }

    /**
     * 获取用户信息
     *
     * @return
     */
    @PostMapping("/getuser")
    public User getUser( @RequestParam("user_telephone") String user_telephone) {
        return userService.getItem(user_telephone);
    }

    /**
     * 获取所有用户信息
     *
     * @return
     */
    @PostMapping("/getAllUser")
    public Map<String, Object> getUser() {
        return userService.getAllUser( );
    }
}
