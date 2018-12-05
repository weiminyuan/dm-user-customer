package com.example.demo.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("/userLogin")
    public String login() {
//        return "收到结果："+userFeignClient.login();
        for (int i = 0; i < 10; i++) {
            String str = userFeignClient.login(i);
            System.out.println(str);
        }
        return  "负载均衡demo";
    }

}
