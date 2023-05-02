package com.bean.samples.account;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.bean.samples.account")
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan({"com.bean.samples.account.mapper"})
@EnableDubbo(scanBasePackages = "com.bean.samples.account")
public class SamplesAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamplesAccountApplication.class, args);
    }

}
