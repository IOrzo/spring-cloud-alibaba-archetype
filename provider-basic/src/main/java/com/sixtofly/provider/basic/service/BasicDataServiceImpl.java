package com.sixtofly.provider.basic.service;

import com.sixtofly.example.api.entity.BasicData;
import com.sixtofly.example.api.service.BasicDataService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author xie yuan bing
 * @date 2019-10-24 17:06
 * @description
 */
@Service
public class BasicDataServiceImpl implements BasicDataService {

    @Override
    public BasicData getBasicData() {
        return new BasicData("success", "获取基础数据成功");
    }
}
