package com.atguigu.aop.demo.aopdemo.annotationdemo.aspect;

import com.atguigu.aop.demo.aopdemo.annotationdemo.annotation.NeedTest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 * @Author ZhengYingjie
 * @Date 2018/10/29
 * @Description
 */
@Configuration
@Aspect
public class AnnotationTestAspect {


    @Around(value = "@annotation(needTest)",argNames="joinPoint,needTest")
    public void needTest(ProceedingJoinPoint joinPoint,NeedTest needTest ) {
        boolean value = needTest.value();
        System.out.println("vaule="+value);
        System.out.println("joinPoint:{"+joinPoint+"}");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("needTest() executed,some logic is here");
    }


}
