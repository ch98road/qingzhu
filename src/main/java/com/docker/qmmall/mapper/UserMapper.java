package com.docker.qmmall.mapper;

/**
 * Created by CHEN on 2020/10/23.
 */
import com.docker.qmmall.model.User;


public interface UserMapper {
    Integer reigster(User user);
    User login(User user);
    Integer findpass(User user);
    Integer update(User user);
    User getUser(User user);
}
