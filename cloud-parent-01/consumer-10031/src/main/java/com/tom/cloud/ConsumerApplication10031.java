package com.tom.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName: ConsumerApplication10031
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/19 1:31
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerApplication10031 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication10031.class,args);
    }
}
