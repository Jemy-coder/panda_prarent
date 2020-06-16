package com.dragon.oss.controller;

import com.dragon.oss.service.OssService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @author JEMY
 * @date 2020/06/16 : 21:52
 **/
@RestController
@RequestMapping("/oss")
public class OssController {

    @Resource
    private OssService ossService;

    @ApiOperation("上传文件到阿里云oss")
    @PostMapping
    public String uploadFile(MultipartFile file){
        return ossService.uploadFile(file);
    }

    @ApiOperation("测试接口")
    @GetMapping
    public String hello(String name){
        return "hello: "+name;
    }


}
