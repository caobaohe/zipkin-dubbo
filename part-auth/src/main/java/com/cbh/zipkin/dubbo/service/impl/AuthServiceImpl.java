package com.cbh.zipkin.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cbh.zipkin.dubbo.AuthService;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @Author: wb.caobaohe
 * @Date: 2019/3/27
 * @Description:
 */
@Service
@Component
public class AuthServiceImpl implements AuthService {

    @Override
    public String auth(String username, String password) {
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return null;
        }
        return "su";
    }
}
