package com.sixtofly.provider.user.service;

import com.sixtofly.example.api.dto.ExampleDto;
import com.sixtofly.example.api.entity.User;
import com.sixtofly.example.api.service.BasicDataService;
import com.sixtofly.example.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author xie yuan bing
 * @date 2019-10-24 17:27
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Reference
    private BasicDataService basicDataService;

    @Override
    public User findById(Long id) {
        return new User(id, "test", "test");
    }

    @Override
    public Long save(User user) {
        return 66L;
    }

    @Override
    public ExampleDto testService() {
        ExampleDto dto = new ExampleDto();
        dto.setUser(findById(6L));
        dto.setBasicData(basicDataService.getBasicData());
        return dto;
    }
}
