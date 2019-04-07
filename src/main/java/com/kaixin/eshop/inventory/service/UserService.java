package com.kaixin.eshop.inventory.service;

import com.kaixin.eshop.inventory.model.User;
import org.springframework.stereotype.Service;

/**
 * @description: 用户Service接口
 * @author: weikailong on 2019-04-07 21:30
 **/
public interface UserService {

    /**
     * 获取用户信息
     * @return 用户对象
     */
    User findUserInfo();

    /**
     * 获取缓存中的测试用户
     * @return
     */
    User getCachedUserInfo();
}
