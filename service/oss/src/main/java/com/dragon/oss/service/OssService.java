package com.dragon.oss.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author JEMY
 * @date 2020/06/16 : 21:55
 **/
public interface OssService {
    String uploadFile(MultipartFile file);
}
