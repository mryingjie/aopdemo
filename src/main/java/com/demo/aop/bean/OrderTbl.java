package com.demo.aop.bean;



import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.Version;

import java.io.Serializable;

/**
 * @Author ZhengYingjie
 * @Date 2019/4/15
 * @Description
 */
public class OrderTbl implements Serializable {

    @TableId(type = IdType.INPUT)
    private int id;

    @TableId(type = IdType.INPUT)
    private String userId;

    private String commodityCode;

    private String count;

    private String money;

    @Version
    private Long version;

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "OrderTbl{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", commodityCode='" + commodityCode + '\'' +
                ", count='" + count + '\'' +
                ", money='" + money + '\'' +
                ", version=" + version +
                '}';
    }
}
