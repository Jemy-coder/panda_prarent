package com.dragon.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author JEMY
 * @date 2020/06/14 : 22:09
 **/
@Configuration
@MapperScan("com.dragon.mapper")
public class EduServiceConfig {
}
