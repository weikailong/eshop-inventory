package com.kaixin.eshop.inventory.mapper;

import com.kaixin.eshop.inventory.model.User;

/**
 * @description: 用户mapper
 * @author: weikailong on 2019-04-07 21:28
 **/
public interface UserMapper {

    /**
     * 获取用户信息
     * @return 用户对象
     */
    User findUserInfo();
    
}
