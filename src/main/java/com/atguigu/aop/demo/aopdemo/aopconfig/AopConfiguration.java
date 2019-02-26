package com.atguigu.aop.demo.aopdemo.aopconfig;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@Aspect
public class AopConfiguration {

    private static final Logger logger = Logger.getLogger(AopConfiguration.class);

    //execution([权限修饰符] [返回值类型] [简单类名/全类名] [方法名]([参数列表]))

    /**
     * 第一个“*”代表任意修饰符及任意返回值。
     * 第二个“*”代表任意方法。
     * “..”匹配任意数量、任意类型的参数。
     * 若目标类、接口与该切面类在同一个包中可以省略包名。
     */

    @Pointcut("execution(* com.atguigu.aop.demo.aopdemo.calculator.impl.CalculatorImpl.*(..))")
    public void executeService() {}

    @Before("executeService()")
    public void beforeMethod(JoinPoint joinPoint){
        String signature =
                joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("方法"+signature+"被调用,"+"参数为:"+ Arrays.asList(args));

    }

    /**
     * 无论目标方法是否抛出异常 即finally
     */
    @After("executeService()")
    public void afterMethod(JoinPoint joinPoint){
        logger.info("afterMethod");
    }

    @AfterReturning(value = "executeService()",returning = "result")
    public void returnmethiod(JoinPoint joinPoint,Object result ){
        String signature =
                joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("方法"+signature+"被调用,"+"结果为:"+ result);
    }

}
