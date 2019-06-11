package com.demo.aop;

import com.demo.aop.calculator.Calculator;
import com.demo.aop.mapper.OrderTblMapper;
import com.demo.aop.service.OrderTblService;
import com.demo.aop.service.TempService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopdemoApplicationTests {

    public static void main(String[] args) {
        String substring = "20190102".substring(4, 6);
        System.out.println(substring);
    }

	@Autowired
	private Calculator calculator;

    @Autowired
    private OrderTblService orderTblService;

	@Autowired
	private OrderTblMapper orderTblMapper;

	@Autowired
	private TempService tempService;

	@Test
	public void contextLoads() {

		calculator.sub(5, 4);

		calculator.sum(2,4 );
	}


	@Test
	public void testOrderTbl(){
        orderTblService.test();
    }

	@Test
	public void testOrderTblBatch(){
//		注意配置文件加上 &allowMultiQueries=true
		orderTblService.testBatch();
	}

    @Test
	public void testTempService(){
		tempService.test();
	}

}
