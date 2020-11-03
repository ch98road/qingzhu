package com.docker.qmmall.controller;

import com.docker.qmmall.service.UploadImageService;
import com.docker.qmmall.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by CHEN on 2020/11/2.
 */
@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/qiniu")
public class UploadController {
    @Resource
    UploadImageService uploadImageService;

    @PostMapping(value = "/image")
    private Map<String,Object> upLoadImage(@RequestParam("file") MultipartFile file) throws IOException {

        // 获取文件的名称
        String fileName = file.getOriginalFilename();

        // 使用工具类根据上传文件生成唯一图片名称
        String imgName = StringUtil.getRandomImgName(fileName);
        Map<String,Object> res = new HashMap<>();
        res.put("imgName","/"+imgName);
        if (!file.isEmpty()) {

            FileInputStream inputStream = (FileInputStream) file.getInputStream();

            String path = uploadImageService.uploadQNImg(inputStream, imgName);
            System.out.print("七牛云返回的图片链接:" + path);
            res.put("res",100);
            res.put("fullName",path);
            return  res;
        }
        res.put("res",101);
        return res;
    }
}
