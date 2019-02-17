package com.cbh.zipkin.dubbo;

import com.cbh.zipkin.dubbo.model.User;

public interface UserService {

    User getUser(String name);
}
