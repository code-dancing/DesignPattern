package com.codedancing.designpattern.structural.proxy.dynamic.gclib;

public class Client {

    public static void main(String[] args) {
        // 目标对象
        UserService service = new UserService();
        // 代理对象
        UserService proxyService = (UserService) new ProxyFactory(service).getProxyInstance();
        // 执行代理对象的方法
        proxyService.save();
    }

}
