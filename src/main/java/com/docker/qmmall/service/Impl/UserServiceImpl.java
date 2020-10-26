package com.docker.qmmall.service.Impl;

import com.docker.qmmall.mapper.UserMapper;
import com.docker.qmmall.model.User;
import com.docker.qmmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by CHEN on 2020/10/26.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public Integer register(String user_name, String user_nick, String user_password, String user_telephone, String user_icon,
                            String user_address, Integer user_sex, String user_email) {
        User user = new User(null, user_name, user_nick, Integer.toString(user_password.hashCode()), user_telephone, user_icon, user_address, user_sex, user_email);
        userMapper.reigster(user);
        return user.getUser_id();
    }

    @Override
    public User login(String user_name, String user_telephone, String user_password) {
        System.out.println(user_name);
        User user = new User( );
        if (!user_name.equals("")) {
            user.setUser_name(user_name);
            user= userMapper.login(user);
        } else if (!user_telephone.equals("")) {
            user.setUser_telephone(user_telephone);
            user = userMapper.getUser(user);
        }
        //暂时不thorw
        if (user.getUser_password().equals(Integer.toString(user_password.hashCode()))){
            return user;
        }
        return null;
    }

    @Override
    public User getItem(String user_telephone) {
        User user = new User( );
        user.setUser_telephone(user_telephone);
        return userMapper.getUser(user);
    }

    @Override
    public Integer update(String user_name, String user_password, String user_nick, String user_telephone, String user_icon, String user_address, Integer user_sex, String user_email) {
        User user = new User(null, user_name, user_nick, Integer.toString(user_password.hashCode()), user_telephone, user_icon, user_address, user_sex, user_email);
        userMapper.update(user);
        return user.getUser_id();
    }

}
