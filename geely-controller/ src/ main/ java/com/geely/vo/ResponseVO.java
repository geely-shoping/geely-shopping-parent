package com.geely.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: geely-shopping-parent
 * @description: 统一返回数据类型
 * @author: admin
 * @create: 2020-03-02 14:54
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseVO<T> {
    private String code;
    private String message;
    private T data;
}
