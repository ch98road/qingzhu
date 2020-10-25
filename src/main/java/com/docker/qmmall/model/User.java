package com.docker.qmmall.model;

/**
 * Created by CHEN on 2020/10/23.
 */
public class User {
    private String user_id;
    private String user_name;
    private String user_nick;
    private String user_password;
    private String user_telephone;
    private String user_icon;
    private String user_address;
    private Integer user_sex;
    private String user_email;

    public User() {
    }

    public User(String user_id, String user_name, String user_nick, String user_password, String user_telephone, String user_icon, String user_address, Integer user_sex, String user_email) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_nick = user_nick;
        this.user_password = user_password;
        this.user_telephone = user_telephone;
        this.user_icon = user_icon;
        this.user_address = user_address;
        this.user_sex = user_sex;
        this.user_email = user_email;
    }

    public String getUser_id() {

        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_nick() {
        return user_nick;
    }

    public void setUser_nick(String user_nick) {
        this.user_nick = user_nick;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_telephone() {
        return user_telephone;
    }

    public void setUser_telephone(String user_telephone) {
        this.user_telephone = user_telephone;
    }

    public String getUser_icon() {
        return user_icon;
    }

    public void setUser_icon(String user_icon) {
        this.user_icon = user_icon;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public Integer getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(Integer user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
}
