package com.demo.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author ZhengYingjie
 * @Date 2019/6/5
 * @Description
 */
@Service
public class TempService {

    @Autowired
    OrderTblService orderTblService;

//    @Transactional(rollbackFor = Exception.class)
    public int test(){
        try {
            return orderTblService.test();
        }catch (Exception e){
            e.printStackTrace();
        }
        return -1;
    }

}
