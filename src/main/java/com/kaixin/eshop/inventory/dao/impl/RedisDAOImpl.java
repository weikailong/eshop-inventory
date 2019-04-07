package com.kaixin.eshop.inventory.dao.impl;

import com.kaixin.eshop.inventory.dao.RedisDAO;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;

/**
 * @description: RedisDAO实现类
 * @author: weikailong on 2019-04-07 23:00
 **/
@Repository("redisDAO")
public class RedisDAOImpl implements RedisDAO {

    @Resource
    private JedisCluster jedisCluster;

    @Override
    public void set(String key, String value) {
        jedisCluster.set(key, value);
    }

    @Override
    public String get(String key) {
        return jedisCluster.get(key);
    }
}
