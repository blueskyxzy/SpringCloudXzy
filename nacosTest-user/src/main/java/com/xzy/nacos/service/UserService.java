package com.xzy.nacos.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author xzy
 * @date 2020/3/31
 */

@RestController
public class UserService {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/getUser")
    public String getUser(Long userId){
        return "服务提供者 getUser:" + userId + ",port:" + serverPort;
    }

}
