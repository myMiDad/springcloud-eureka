package com.tom.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: ConsumerApplication10031
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/19 1:31
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.tom.cloud")
//@ComponentScan("com.tom.cloud")
public class ConsumerApplicationFeign10032 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplicationFeign10032.class,args);
    }
}
