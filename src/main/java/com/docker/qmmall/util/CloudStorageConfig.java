package com.docker.qmmall.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by CHEN on 2020/11/2.
 */
@Configuration
public class CloudStorageConfig {
    /**
     * 七牛域名domain
     */
    public static String qiniuDomain="http://qj5pf0ja5.hn-bkt.clouddn.com";
    /**
     * 七牛ACCESS_KEY
     */
    public static String qiniuAccessKey="3WhI6g6ds9vo0Gw6V87rsNJfvXKOdwM6GWxf8gl4";
    /**
     * 七牛SECRET_KEY
     *
     */
    public static String qiniuSecretKey="bKpVR3TrwOhkPWwyaEgsFwrDutzbeF4uH9oB0kpz";
    /**
     * 七牛空间名
     */
    public static String qiniuBucketName="qzmall";

    public static String getQiniuDomain() {
        return qiniuDomain;
    }

    public static void setQiniuDomain(String qiniuDomain) {
        CloudStorageConfig.qiniuDomain = qiniuDomain;
    }

    public static String getQiniuAccessKey() {
        return qiniuAccessKey;
    }

    public static void setQiniuAccessKey(String qiniuAccessKey) {
        CloudStorageConfig.qiniuAccessKey = qiniuAccessKey;
    }

    public static String getQiniuSecretKey() {
        return qiniuSecretKey;
    }

    public static void setQiniuSecretKey(String qiniuSecretKey) {
        CloudStorageConfig.qiniuSecretKey = qiniuSecretKey;
    }

    public static String getQiniuBucketName() {
        return qiniuBucketName;
    }

    public static void setQiniuBucketName(String qiniuBucketName) {
        CloudStorageConfig.qiniuBucketName = qiniuBucketName;
    }

    public CloudStorageConfig() {

    }
}
