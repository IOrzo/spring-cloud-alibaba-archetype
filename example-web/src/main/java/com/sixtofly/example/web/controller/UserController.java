package com.sixtofly.example.web.controller;

import com.sixtofly.example.api.dto.ExampleDto;
import com.sixtofly.example.api.entity.User;
import com.sixtofly.example.api.service.BasicDataService;
import com.sixtofly.example.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xie yuan bing
 * @date 2019-10-25 17:40
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserController {

//    @Reference
    private UserService userService;

    @RequestMapping("/{id}")
    private User getUser(@PathVariable Long id){
        return userService.findById(id);
    }

    @RequestMapping("/testExample")
    private ExampleDto testExample(){
        return userService.testService();
    }

}
