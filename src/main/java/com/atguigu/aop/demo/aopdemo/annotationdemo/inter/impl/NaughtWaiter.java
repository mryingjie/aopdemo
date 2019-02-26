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
public class NaughtWaiter implements Waiter {
    @Override
    public void greetTo(String clientName) {
        System.out.println("NaughtWaiter:greet to " + clientName);
    }

    @NeedTest(true)
    @Override
    public void serverTo(String clientName) {
        System.out.println("NaughtWaiter:server to " + clientName);
    }

    public void joke(String clientName, int times) {
        System.out.println("NaughtyWaiter:play " + times + " jokes to "
                + clientName);
    }
}
