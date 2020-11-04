package com.docker.qmmall.service;

import com.docker.qmmall.model.User;

import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface UserService {


    /**
     * 注册功能
     */
    Map<String,Object> register(String user_name, String user_nick, String user_password, String user_telephone,
                 String user_icon, String user_address, Integer user_sex, String user_email);

    /**
     * 登录功能,返回token
     */
    User login(String user_name, String user_telephone, String user_password) throws Exception;
    /**
     * 根据用户user_telephone
     */
    User getItem(String user_telephone);


    /**
     * 修改指定用户信息,包括密码
     */
    Integer update(String user_name, String user_password, String user_nick, String user_telephone, String user_icon,
                   String user_address, Integer user_sex, String user_email);
    /**
     * 拿到所有User
     */
    Map<String,Object> getAllUser();


     Integer findPass(Integer user_id, String user_password);
}
