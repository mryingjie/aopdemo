package com.demo.aop.service;

import com.demo.aop.bean.OrderTbl;
import com.demo.aop.mapper.OrderTblMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author ZhengYingjie
 * @Date 2019/4/15
 * @Description
 */
@Service
public class OrderTblService {

    @Autowired
    private OrderTblMapper orderTblMapper;

    @Transactional(rollbackFor = Exception.class)
    public int test() {
        int update = 0;
        try {
            OrderTbl orderTbl = new OrderTbl();
            orderTbl.setCommodityCode("555");
            update = orderTblMapper.update(orderTbl,
                    new UpdateWrapper<OrderTbl>()
                            .eq("id", 1)
                            .eq("user_id", "1002")
            );
            int a = 2 / 0;
        } finally {

        }
        return update;
    }

    public void testBatch() {
        List<OrderTbl> tblList = orderTblMapper.selectList(
                new QueryWrapper<OrderTbl>()
                        .in("id", 1, 2, 4)
        );
        orderTblMapper.updateSelectiveBatch(
                tblList.stream()
                        .map(tbl -> {
                                    OrderTbl orderTbl = new OrderTbl();
                                    orderTbl.setVersion(tbl.getVersion());
                                    orderTbl.setCommodityCode("555");
                                    orderTbl.setId(tbl.getId());
                                    return orderTbl;
                                }
                        ).collect(Collectors.toList())
        );

    }

    public List<OrderTbl> getAllOrderTbl(){
        return orderTblMapper.selectList(new QueryWrapper<OrderTbl>());
    }
}
