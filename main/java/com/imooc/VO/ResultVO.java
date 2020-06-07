package com.imooc.VO;

import lombok.Data;

//VO指的是view-object：视图对象
@Data
public class ResultVO <T> {

    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //具体内容
    private T data;
}
