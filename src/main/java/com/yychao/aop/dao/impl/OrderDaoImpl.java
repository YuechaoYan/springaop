package com.yychao.aop.dao.impl;

import com.yychao.aop.dao.OrderDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public class OrderDaoImpl implements OrderDao {

    @Override
    public void save() {
        System.out.println("保存订单...");
    }

    @Override
    public void update() {
        System.out.println("修改订单...");
    }

    @Override
    public void delete() {
        System.out.println("删除订单...");
    }

    @Override
    public void find() {
        System.out.println("查询订单...");
    }

}
