package com.cbh.zipkin.dubbo.model;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private String username;

    private String password;

    private List<Order> orders;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
