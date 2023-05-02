package com.bean.samples.stock;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.bean.samples.stock")
@EnableDiscoveryClient
@MapperScan({"com.bean.samples.stock.mapper"})
@EnableDubbo(scanBasePackages = "com.bean.samples.stock")
public class SamplesStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamplesStockApplication.class, args);
    }

}

