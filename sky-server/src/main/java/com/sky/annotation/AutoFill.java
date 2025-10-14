package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author HANAYO
 * @description 自定义注解，用来标识某个方法需要进行功能字段自动填充处理
 * @create 2025/10/14 18:25
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    //数据操作类型
    OperationType value();

}
