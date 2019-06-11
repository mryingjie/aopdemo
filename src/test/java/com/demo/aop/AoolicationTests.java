package com.demo.aop;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.aop.annotationdemo.inter.Waiter;
import com.demo.aop.bean.Ofd04Result;
import com.demo.aop.bean.Ofd06Result;
import com.demo.aop.mapper.Ofd04ResultMapper;
import com.demo.aop.mapper.Ofd06ResultMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.List;

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

    @Autowired
    Ofd04ResultMapper ofd04ResultMapper;

    @Autowired
    private Ofd06ResultMapper ofd06ResultMapper;

    @Test
    public void test(){
        naiveWaiter.greetTo("张三");
//        naiveWaiter.serverTo("张三");
    }

    @Test
    public void selectTa() throws IOException {
        List<Ofd06Result> businessCode = ofd06ResultMapper.selectList(new QueryWrapper<Ofd06Result>().eq("business_code", "143").eq("transaction_cfm_date", "20190102").eq("transaction_account_id", "2018050409000180"));

        FileOutputStream fileOutputStream = new FileOutputStream(new File("E:\\code\\aopdemo\\aopdemo\\src\\main\\file\\dividend.json"));

        fileOutputStream.write(JSON.toJSONString(businessCode.get(0)).getBytes("utf-8"));
        fileOutputStream.close();
    }

    @Test
    public void selectTaConfirm() throws IOException {
        List<Ofd04Result> businessCode = ofd04ResultMapper.selectList(new QueryWrapper<Ofd04Result>().eq("business_code", "198"));

        FileOutputStream fileOutputStream = new FileOutputStream(new File("E:\\code\\aopdemo\\aopdemo\\src\\main\\file\\quickRedeemConfirm.json"));

        fileOutputStream.write(JSON.toJSONString(businessCode.get(8)).getBytes("utf-8"));
        fileOutputStream.close();
    }
}
