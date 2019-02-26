package com.atguigu.aop.demo.aopdemo.annotationdemo.annotation;

import java.lang.annotation.*;

/**
 * @Author ZhengYingjie
 * @Date 2018/10/29
 * @Description
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface NeedTest {
    boolean value() default false;
}
