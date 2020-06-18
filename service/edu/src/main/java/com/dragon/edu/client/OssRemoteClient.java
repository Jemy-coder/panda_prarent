package com.dragon.edu.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author JEMY
 * @date 2020/06/18 : 21:13
 **/
@FeignClient("service-oss")
@Component
public interface OssRemoteClient {


    @GetMapping(value = "/oss/hello")
    String hello(@RequestParam("name") String name);

}
