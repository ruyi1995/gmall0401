package com.atguigu.gmall0401.gmall0401.order.controller;


import com.atguigu.gmall0401.bean.UserInfo;
import com.atguigu.gmall0401.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {



    UserService userService;

    @GetMapping("trade")
    public List<UserInfo> trade(String userid) {
        List<UserInfo> userInfoListAll = userService.getUserInfoListAll();
        return userInfoListAll;
    }

}
