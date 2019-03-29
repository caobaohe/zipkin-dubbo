package com.cbh.zipkin.dubbo;

/**
 * @Author: wb.caobaohe
 * @Date: 2019/3/27
 * @Description:
 */
public interface AuthService {

    String auth(String username, String password);
}
