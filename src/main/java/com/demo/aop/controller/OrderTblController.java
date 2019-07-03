package com.demo.aop.controller;

import com.demo.aop.bean.OrderTbl;
import com.demo.aop.service.OrderTblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author ZhengYingjie
 * @Date 2019-07-03
 * @Description
 */
@Controller
public class OrderTblController {

    @Autowired
    private OrderTblService orderTblService;

    @ResponseBody
    @GetMapping("/ordertbl/index")
    public List<OrderTbl> id() {
       return  orderTblService.getAllOrderTbl();
    }


}
