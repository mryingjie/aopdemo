package com.demo.aop.annotationdemo.aspect;

import com.demo.aop.annotationdemo.annotation.NeedTest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

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
