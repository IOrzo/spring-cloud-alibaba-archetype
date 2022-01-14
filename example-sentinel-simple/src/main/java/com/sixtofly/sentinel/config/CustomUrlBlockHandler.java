package com.sixtofly.sentinel.config;

import com.alibaba.csp.sentinel.adapter.servlet.callback.UrlBlockHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author xie yuan bing
 * @date 2022-01-14 17:28
 * @see com.alibaba.cloud.sentinel.custom.SentinelAutoConfiguration
 * @see com.alibaba.csp.sentinel.adapter.servlet.CommonFilter
 * @see UrlBlockHandler
 */
@Component
public class CustomUrlBlockHandler implements UrlBlockHandler {

    private static final String DEFAULT_BLOCK_MSG = "{\"code\":\"429\",\"msg\":\"Too Many Requests\",\"data\":\"\"}";

    @Override
    public void blocked(HttpServletRequest request, HttpServletResponse response, BlockException ex) throws IOException {
        response.setStatus(HttpStatus.OK.value());
        response.setHeader("Content-type", MediaType.APPLICATION_JSON_UTF8_VALUE);
        PrintWriter out = response.getWriter();
        out.write(DEFAULT_BLOCK_MSG);
        out.flush();
        out.close();
    }
}
