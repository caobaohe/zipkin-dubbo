package com.cbh.zipkin.dubbo.service.impl;

import com.cbh.zipkin.dubbo.OrderService;
import com.cbh.zipkin.dubbo.UserService;
import com.cbh.zipkin.dubbo.model.Order;
import com.cbh.zipkin.dubbo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@Component
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private OrderService orderService;

    @Override
    public User getUser(String name) {
        LOGGER.info("getUser");
        try {
            int i = 10 / 0;
            Thread.sleep(new Random(System.currentTimeMillis()).nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user = new User();
        user.setUsername(name);
        return user;
    }

    @Override
    public User getUserOrder(String name) {
        LOGGER.info("getUserOrder");
        try {
            Thread.sleep(new Random(System.currentTimeMillis()).nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user = new User();
        user.setUsername(name);
        List<Order> orders = orderService.getOrders(name);
        user.setOrders(orders);
        return user;
    }

}
