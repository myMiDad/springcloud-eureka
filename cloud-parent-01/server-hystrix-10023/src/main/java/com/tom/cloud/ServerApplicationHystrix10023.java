package com.tom.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * ClassName: ServerApplication10021
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/18 16:04
 */
@MapperScan(value = "com.tom.cloud.mapper")
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker

//@EnableHystrix
public class ServerApplicationHystrix10023 {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplicationHystrix10023.class,args);
    }
}

