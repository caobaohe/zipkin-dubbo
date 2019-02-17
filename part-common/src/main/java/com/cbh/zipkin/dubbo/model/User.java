package com.cbh.zipkin.dubbo.model;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private String name;

    private List<Order> orders;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
