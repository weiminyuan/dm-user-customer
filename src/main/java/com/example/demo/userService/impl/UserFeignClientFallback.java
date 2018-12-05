package com.example.demo.userService.impl;

import com.example.demo.userService.UserFeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class UserFeignClientFallback implements UserFeignClient{
    @Override
    public String login(@RequestParam("count") int count) {
        return "异常"+count;
    }
}
