package com.docker.qmmall.service.Impl;

import com.docker.qmmall.mapper.UserMapper;
import com.docker.qmmall.model.User;
import com.docker.qmmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by CHEN on 2020/10/26.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public Map<String, Object> register(String user_name, String user_nick, String user_password, String user_telephone, String user_icon,
                            String user_address, Integer user_sex, String user_email) {
        User user = new User(null, user_name, user_nick, user_password, user_telephone, user_icon, user_address, user_sex, user_email);
//        User user = new User(null, user_name, user_nick, Integer.toString(user_password.hashCode()), user_telephone, user_icon, user_address, user_sex, user_email);
        userMapper.reigster(user);

        Map<String,Object> res = new HashMap<>();
        if (user.getUser_id()!=null){
            res.put("res",100);
            res.put("data",user.getUser_id());
        }else res.put("res",101);

        return res;
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
        if (user.getUser_password().equals(user_password)){
            System.out.println(user.getUser_address() );
            user.setUser_address(user.getUser_address().replaceAll("\\\"","\""));
            System.out.println(user.getUser_address() );
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
//        User user = new User(null, user_name, user_nick, Integer.toString(user_password.hashCode()), user_telephone, user_icon, user_address, user_sex, user_email);
        User user = new User(null, user_name, user_nick, user_password, user_telephone, user_icon, user_address, user_sex, user_email);

        return userMapper.update(user)==1?100:101;
    }

}
