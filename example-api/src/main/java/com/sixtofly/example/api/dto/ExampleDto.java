package com.sixtofly.example.api.dto;

import com.sixtofly.example.api.entity.BasicData;
import com.sixtofly.example.api.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xie yuan bing
 * @date 2019-10-28 9:11
 * @description
 */
@Data
@NoArgsConstructor
public class ExampleDto implements Serializable {

    private User user;

    private BasicData basicData;
}
