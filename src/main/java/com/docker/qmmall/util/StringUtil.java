package com.docker.qmmall.util;

import cn.hutool.core.date.DateUtil;
import java.util.UUID;
/**
 * Created by CHEN on 2020/11/2.
 */
public class StringUtil {
    /**
     * @Description: 生成唯一图片名称
     * @Param: fileName
     * @return: 云服务器fileName
     */
    public static String getRandomImgName(String fileName) {

        int index = fileName.lastIndexOf(".");

        if ((fileName == null || fileName.isEmpty()) || index == -1){
            throw new IllegalArgumentException();
        }
        // 获取文件后缀
        String suffix = fileName.substring(index);
        // 生成UUID
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        // 生成上传至云服务器的路径
        String path = "docker/mall/" + DateUtil.today() + "-" + uuid + suffix;
        return path;
    }
}
