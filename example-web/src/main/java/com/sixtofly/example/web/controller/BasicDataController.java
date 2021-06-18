package com.sixtofly.example.web.controller;

import com.sixtofly.example.api.entity.BasicData;
import com.sixtofly.example.api.service.BasicDataService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xie yuan bing
 * @date 2019-10-25 17:43
 * @description
 */
@RestController
@RequestMapping("/basic")
public class BasicDataController {

    @Reference
    private BasicDataService basicDataService;

    @RequestMapping("/info")
    private BasicData getBasicData(){
        return basicDataService.getBasicData();
    }
}
