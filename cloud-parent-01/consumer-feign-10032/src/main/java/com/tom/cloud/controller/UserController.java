package com.tom.cloud.controller;

import com.tom.cloud.entities.User;
import com.tom.cloud.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * ClassName: UserController
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/19 9:48
 */
@RestController
public class UserController {
    @Autowired
    private UserClientService userClientService;

    @RequestMapping(value = "/consumer/user/list")
    public List<User> list(){
        System.out.println("-----进入feign-10032");
        return userClientService.list();
    }
}
