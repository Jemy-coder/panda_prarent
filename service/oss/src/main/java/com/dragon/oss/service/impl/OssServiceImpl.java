package com.dragon.oss.service.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.dragon.oss.service.OssService;
import com.dragon.util.Constant;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author JEMY
 * @date 2020/06/16 : 21:56
 **/
@Service
public class OssServiceImpl implements OssService {
    @Override
    public String uploadFile(MultipartFile file) {
        String endpoint = Constant.ENDPOINT;
        String accessKeyId = Constant.ACCESS_KEY_ID;
        String accessKeySecret = Constant.ACCESS_KEY_SECRET;

        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        try {
            InputStream inputStream = file.getInputStream();
            String name = file.getOriginalFilename();

            ossClient.putObject(Constant.BUCKET_NAME, name, inputStream);

            ossClient.shutdown();
            return "https://"+Constant.BUCKET_NAME+"."+Constant.ENDPOINT+"/"+name;
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
