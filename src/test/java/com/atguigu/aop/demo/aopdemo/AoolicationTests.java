package com.atguigu.aop.demo.aopdemo;

import com.atguigu.aop.demo.aopdemo.annotationdemo.inter.Waiter;
import com.atguigu.aop.demo.aopdemo.annotationdemo.inter.impl.NaiveWaiter;
import com.atguigu.aop.demo.aopdemo.annotationdemo.inter.impl.NaughtWaiter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author ZhengYingjie
 * @Date 2018/10/29
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AoolicationTests {

    @Autowired
    Waiter naiveWaiter;

    @Autowired
    Waiter naughtWaiter;

    @Test
    public void test(){
        naiveWaiter.greetTo("张三");
//        naiveWaiter.serverTo("张三");
    }

}
