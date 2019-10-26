package com.tom.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ClassName: ZuulGatewayApplication9527
 * Description:
 *
 * @date 2019/10/21 19:43
 * @author: Mi_dad
 */

@SpringBootApplication
@EnableZuulProxy
public class ZuulGatewayApplication9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApplication9527.class,args);
    }
}
