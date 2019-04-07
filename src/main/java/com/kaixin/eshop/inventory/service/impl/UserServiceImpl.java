package com.kaixin.eshop.inventory.service.impl;

import com.kaixin.eshop.inventory.mapper.UserMapper;
import com.kaixin.eshop.inventory.model.User;
import com.kaixin.eshop.inventory.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 用户Service接口实现类
 * @author: weikailong on 2019-04-07 21:55
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findUserInfo() {
        return userMapper.findUserInfo();
    }
}
