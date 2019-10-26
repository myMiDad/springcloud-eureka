package com.tom.cloud.service;

import com.tom.cloud.entities.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: UserClientServiceFallbackFactory
 * Description:
 *
 * @date 2019/10/20 21:30
 * @author: Mi_dad
 */
@Component
public class UserClientServiceFallbackFactory implements FallbackFactory<UserClientService> {
    @Override
    public UserClientService create(Throwable throwable) {
        return new UserClientService() {
            @Override
            public List<User> list() {
                List<User> userList = new ArrayList<>();
                User user = new User();
                user.setUserId(1001);
                user.setUserName("熔断器起作用");
                user.setUserAge(1002);
                userList.add(user);
                return userList;
            }
        };
    }
}
