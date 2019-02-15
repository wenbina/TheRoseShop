package com.nf.theroseshop.common;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class ImageUtil {
    public static String uploadImage(MultipartFile file, String path) throws IOException {
        System.out.println(path);
        String name = file.getOriginalFilename() ;
        String suffixName = name.substring(name.lastIndexOf(".")) ;
        Date date = new Date() ;

        String hash = getRandomString(10)+date.getTime();//给照片自定义一个名字，用时间做名称，不会重复
        String fileName = hash + suffixName ;
        File tempFile = new File(path, fileName) ;
        if(!tempFile.getParentFile().exists()) {
            tempFile.getParentFile().mkdirs() ;
        }
        tempFile.createNewFile() ;
        file.transferTo(tempFile);
        System.out.println(fileName);
        return tempFile.getName() ;
    }

    public static String getRandomString(int length) { // length 字符串长度
        StringBuffer buffer = new StringBuffer("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        StringBuffer sb = new StringBuffer();
        Random r = new Random();
        int range = buffer.length();
        for (int i = 0; i < length; i ++) {
            sb.append(buffer.charAt(r.nextInt(range)));
        }
        return sb.toString();
    }
}

