package com.cbh.zipkin.dubbo.controller;

import com.cbh.zipkin.dubbo.AuthService;
import com.cbh.zipkin.dubbo.UserService;
import com.cbh.zipkin.dubbo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;
    @Resource
    private AuthService authService;

    @RequestMapping("auth")
    @ResponseBody
    public Object auth(User user) {
        LOGGER.info("auth..." + user.toString());
        return authService.auth(user.getUsername(), user.getPassword());
    }

    @RequestMapping("user")
    @ResponseBody
    public Object getUser(String name) {
        LOGGER.info("getUser..." + name.toString());
        return userService.getUser(name);
    }

    @RequestMapping("userOrder")
    @ResponseBody
    public Object getUserOrder(String name) {
        LOGGER.info("getUserOrder.." + name.toString());
        return userService.getUserOrder(name);
    }

}
