package com.dragon.oss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author JEMY
 * @date 2020/06/16 : 21:54
 **/
@SpringBootApplication
@EnableDiscoveryClient // nacos 注册
@ComponentScan(basePackages = {"com.dragon"})
public class OssServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(OssServiceApp.class);
    }
}
