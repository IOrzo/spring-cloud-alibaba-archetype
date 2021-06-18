package com.sixtofly.example.api.service;

import com.sixtofly.example.api.dto.ExampleDto;
import com.sixtofly.example.api.entity.User;

/**
 * @author xie yuan bing
 * @date 2019-10-24 16:48
 * @description
 */
public interface UserService {

    User findById(Long id);

    Long save(User user);

    /**
     * 测试服务间调用
     * @return
     */
    ExampleDto testService();
}
