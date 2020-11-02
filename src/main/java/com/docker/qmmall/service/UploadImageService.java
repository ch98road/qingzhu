package com.docker.qmmall.service;

import com.docker.qmmall.util.CloudStorageConfig;

import java.io.FileInputStream;

/**
 * Created by CHEN on 2020/11/2.
 */
public interface UploadImageService {

    

    public abstract String uploadQNImg(FileInputStream file, String path);
}
