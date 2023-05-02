package com.bean.samples.business;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.bean.samples.business")
@EnableDiscoveryClient
@EnableDubbo(scanBasePackages = "com.bean.samples.business")
public class SamplesBusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamplesBusinessApplication.class, args);
    }

}
