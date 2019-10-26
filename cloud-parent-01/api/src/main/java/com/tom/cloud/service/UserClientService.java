package com.tom.cloud.service;

import com.tom.cloud.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * ClassName: UserClientService
 * Description:
 *
 * @date 2019/10/20 0:06
 * @author: Mi_dad
 */
@FeignClient(value = "SERVERPROVIDE-1002X",fallbackFactory = UserClientServiceFallbackFactory.class)
public interface UserClientService {

    @RequestMapping(value = "/user/all")
    List<User> list();
}