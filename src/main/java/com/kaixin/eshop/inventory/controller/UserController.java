package com.kaixin.eshop.inventory.controller;

import com.kaixin.eshop.inventory.model.User;
import com.kaixin.eshop.inventory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 用户Controller
 * @author: weikailong on 2019-04-07 21:31
 **/
@Controller
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo(){
        User user = userService.findUserInfo();
        return user;
    }
    
}
