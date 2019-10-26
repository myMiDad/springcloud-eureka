package com.tom.myrule;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MyRule
 * Description:
 *
 * @date 2019/10/20 22:12
 * @author: Mi_dad
 */
@Configuration
public class MyRule {
    @Bean
    public IRule myRule(){
//        return new BestAvailableRule();     //过滤掉由于多次访问故障而处于短路引起跳闸状态的服务，然后选择一个并发量最小的服务
//        return new RandomRule();          //随机
        return new AvailabilityFilteringRule();
    }
}
