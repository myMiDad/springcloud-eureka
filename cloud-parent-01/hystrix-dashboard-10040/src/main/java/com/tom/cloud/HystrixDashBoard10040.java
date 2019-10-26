package com.tom.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * ClassName: HystrixDashBoard10040
 * Description:
 *
 * @date 2019/10/20 23:02
 * @author: Mi_dad
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoard10040 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoard10040.class,args);
    }
}
