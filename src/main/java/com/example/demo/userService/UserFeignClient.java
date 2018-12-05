package com.example.demo.userService;

import com.example.demo.userService.impl.UserFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//配置调用服务名称
//配置调用失败的备用方案
@FeignClient(name = "dm-user-provider", fallback = UserFeignClientFallback.class)
public interface UserFeignClient {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam("count") int count);
}
