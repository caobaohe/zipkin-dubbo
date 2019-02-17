package com.cbh.zipkin.dubbo.service.impl;

import com.cbh.zipkin.dubbo.OrderService;
import com.cbh.zipkin.dubbo.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class OrderServiceImpl implements OrderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Override
    public List<Order> getOrders(String name) {
        LOGGER.info("getOrders");
        try {
            Thread.sleep(new Random(System.currentTimeMillis()).nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(name.length(), (float) (name.length() * 39.7)));
        return orders;
    }
}
