package com.dfjx.frontier;

import com.coxautodev.graphql.tools.SchemaParserOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients({"com.dfjx"})
public class DfjxFrontierApplication {

    public static void main(String[] args) {
        SpringApplication.run(DfjxFrontierApplication.class, args);
    }

    @Bean
    public SchemaParserOptions schemaParserOptions() {
        //临时设置，允许graphql不强制所有resolver均提供实现
        return SchemaParserOptions.newOptions()
                .allowUnimplementedResolvers(true).build();
    }
}
