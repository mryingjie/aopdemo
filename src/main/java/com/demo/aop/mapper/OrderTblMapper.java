package com.demo.aop.mapper;

import com.demo.aop.bean.OrderTbl;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @Author ZhengYingjie
 * @Date 2019/4/15
 * @Description
 */
public interface OrderTblMapper extends BaseMapper<OrderTbl> {
    void updateSelectiveBatch(List<OrderTbl> list);
}
