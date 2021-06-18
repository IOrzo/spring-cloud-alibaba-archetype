package com.sixtofly.example.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ExampleWebApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ExampleWebApplication.class, args);
    }
}
