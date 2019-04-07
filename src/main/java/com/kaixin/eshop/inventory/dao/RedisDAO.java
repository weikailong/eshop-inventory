package com.kaixin.eshop.inventory.dao;

/**
 * @description: RedisDao
 * @author: weikailong on 2019-04-07 22:58
 **/
public interface RedisDAO {

    /**
     * 设置到redis中
     * @param key 键
     * @param value 值
     */
    void set(String key, String value);

    /**
     * 根据key获取value
     * @param key 键
     * @return value
     */
    String get(String key);
    
}
