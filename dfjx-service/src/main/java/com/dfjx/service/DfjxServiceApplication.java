package com.dfjx.service;

import com.baomidou.mybatisplus.core.mapper.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication(scanBasePackages = "com.dfjx.service")
//@EnableFeignClients("com.dfjx.service")
@MapperScan(value = "com.dfjx.service", markerInterface = Mapper.class)
public class DfjxServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DfjxServiceApplication.class, args);
    }

}
