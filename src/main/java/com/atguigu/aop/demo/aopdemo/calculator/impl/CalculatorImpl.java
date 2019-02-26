package com.atguigu.aop.demo.aopdemo.calculator.impl;

import com.atguigu.aop.demo.aopdemo.calculator.Calculator;
import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int sum(int x, int y) {
        return x + y;
    }

    @Override
    public int sub(int x, int y) {
        return x - y;
    }
}
