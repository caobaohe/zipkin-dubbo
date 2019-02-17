package com.cbh.zipkin.dubbo;

import com.cbh.zipkin.dubbo.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrders(String name);
}
