package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Orders;

public interface OrdersService extends IService<Orders> {

    public void submit(Orders orders);
}
