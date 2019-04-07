package com.kaixin.eshop.inventory.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.kaixin.eshop.inventory.dao.RedisDAO;
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
    
    @Resource
    private RedisDAO redisDAO;

    @Override
    public User findUserInfo() {
        return userMapper.findUserInfo();
    }
    
    
    @Override
    public User getCachedUserInfo(){
        redisDAO.set("cached_user", "{\"name\": \"zhangsan\", \"age\": 25}") ;
        String json = redisDAO.get("cached_user");
        JSONObject jsonObject = JSONObject.parseObject(json);
        
        User user = new User();
        user.setName(jsonObject.getString("name"));
        user.setAge(jsonObject.getInteger("age"));
        
        return user;
    }
    
}
