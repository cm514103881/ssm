package cn.itcast.service;

import cn.itcast.domain.Orders;

import java.util.List;

public interface OrdersService {

    //查询所有订单
    List<Orders> findAll(int page,int size);
}
