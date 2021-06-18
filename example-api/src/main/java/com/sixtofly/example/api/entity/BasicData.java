package com.sixtofly.example.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xie yuan bing
 * @date 2019-10-24 16:50
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicData implements Serializable {

    private String code;

    private String desc;
}
