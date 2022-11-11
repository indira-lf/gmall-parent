package com.feng.gmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author
 * @time 2022/11/11 21:06
 * @Description- TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
//@ComponentScan({"com.feng.gmall"})
public class ProductMain {
    public static void main(String[] args) {
        SpringApplication.run(ProductMain.class,args);
    }
}
