package com.sixtofly.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author xie yuan bing
 * @date 2022-01-14 17:28
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/check")
    public String check(){
        return "check";
    }

    @GetMapping("/sleep")
    public String sleep(Long timeout){
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "sleep";
    }

    @GetMapping("/title")
    public String title(){
        return "example-sentinel-simple";
    }
}


