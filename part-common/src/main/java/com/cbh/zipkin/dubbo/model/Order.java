package com.cbh.zipkin.dubbo.model;

import java.io.Serializable;

public class Order implements Serializable {

    private Integer id;
    private Float amount;

    public Order() {
    }

    public Order(Integer id, Float amount) {
        this.id = id;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
