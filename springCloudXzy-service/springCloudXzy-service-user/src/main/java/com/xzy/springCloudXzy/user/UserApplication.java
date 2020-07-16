package com.xzy.springCloudXzy.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by xzy on 2020/3/31  .
 */

@SpringBootApplication
@EnableFeignClients
public class UserApplication {

    public static void main(String[] args){
        SpringApplication.run(UserApplication.class);
    }

}