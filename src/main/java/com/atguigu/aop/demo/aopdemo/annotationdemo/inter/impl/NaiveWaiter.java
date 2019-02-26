package com.atguigu.aop.demo.aopdemo.annotationdemo.inter.impl;

import com.atguigu.aop.demo.aopdemo.annotationdemo.annotation.NeedTest;
import com.atguigu.aop.demo.aopdemo.annotationdemo.inter.Waiter;
import org.springframework.stereotype.Component;

/**
 * @Author ZhengYingjie
 * @Date 2018/10/29
 * @Description
 */
@Component
public class NaiveWaiter implements Waiter {
    @NeedTest(false)
    @Override
    public void greetTo(String clientName) {
        System.out.println("NaiveWaiter:greet to " + clientName);
    }


    @Override
    public void serverTo(String clientName) {
        System.out.println("NaiveWaiter:server to " + clientName);
    }

    public void smile(String clientName, int times) {
        System.out.println("NaiveWaiter:smile to  " + clientName + " " + times
                + " times");
    }
}
