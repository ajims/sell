package com.imooc.Utils;

import java.util.Random;

public class KeyUtil {

    //生成唯一主键,格式是时间+随机数
    public static synchronized String genUniqueKey() {
        Random random = new Random();

        //六位随机数
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
