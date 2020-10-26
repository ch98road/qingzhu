package com.docker.qmmall.service;

import com.docker.qmmall.model.User;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface UserService {

//    private String user_id;
//    private String user_name;
//    private String user_nick;
//    private String user_password;
//    private String user_telephone;
//    private String user_icon;
//    private String user_address;
//    private Integer user_sex;
//    private String user_email;

    /**
     * 注册功能
     */
    Integer register(String user_name, String user_nick, String user_password, String user_telephone,
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


}
