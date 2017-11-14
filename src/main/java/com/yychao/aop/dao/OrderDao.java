package com.yychao.aop.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface OrderDao {

    public void save();

    public void update();

    public void delete();

    public void find();
}

