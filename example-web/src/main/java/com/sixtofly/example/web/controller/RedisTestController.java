package com.sixtofly.example.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xie yuan bing
 * @date 2020-03-10 14:32
 * @description
 */
@RestController
@RequestMapping("/redis")
public class RedisTestController {

    @Resource
    public RedisTemplate<String, String> redisTemplate;

    @PostMapping("/save")
    public String save(String key, String value){
        redisTemplate.opsForValue().set(key, value);
        return "success";
    }

    @GetMapping("/get")
    public String get(String key){
        String value = redisTemplate.opsForValue().get(key);
        return value;
    }
}
