package com.codedancing.designpattern.structural.proxy.dynamic.jdk;

/**
 * 需要被代理的类
 */
public class UserServiceImpl implements UserService {

    @Override
    public void select() {
        System.out.println("查询 select by id");
    }

    @Override
    public void update() {
        System.out.println("更新 update by id");
    }

}
