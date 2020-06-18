package com.dragon.oss.controller;

import com.dragon.oss.service.OssService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
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

    @ApiOperation("微服务调用接口")
    @GetMapping("hello")
    public String hello(@RequestParam("name") String name){
        return "hello: "+name;
    }


}
