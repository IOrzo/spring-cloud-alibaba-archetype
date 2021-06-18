package com.sixtofly.provider.basic;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDubbo
@EnableDiscoveryClient
@EnableAutoConfiguration
public class ProviderBasicApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProviderBasicApplication.class, args);
    }
}
