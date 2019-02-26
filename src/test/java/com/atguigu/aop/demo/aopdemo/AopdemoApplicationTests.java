package com.atguigu.aop.demo.aopdemo;

import com.atguigu.aop.demo.aopdemo.calculator.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopdemoApplicationTests {

	@Autowired
	private Calculator calculator;

	@Test
	public void contextLoads() {

		calculator.sub(5, 4);

		calculator.sum(2,4 );
	}

}
