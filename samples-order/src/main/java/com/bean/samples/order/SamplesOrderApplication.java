package com.bean.samples.order;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.bean.samples.order")
@EnableDiscoveryClient
@MapperScan({"com.bean.samples.order.mapper"})
@EnableDubbo(scanBasePackages = "com.bean.samples.order")
public class SamplesOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamplesOrderApplication.class, args);
    }

}
