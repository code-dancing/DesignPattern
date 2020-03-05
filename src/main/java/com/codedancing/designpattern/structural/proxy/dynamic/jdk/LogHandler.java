package com.codedancing.designpattern.structural.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 编写一个调用逻辑处理器 LogHandler 类，提供日志增强功能，并实现 InvocationHandler 接口；
 *
 * 在 LogHandler 中维护一个目标对象 target，这个对象是被代理的对象（真实主题角色）；
 * 在 invoke 方法中编写方法调用的逻辑处理
 */
public class LogHandler implements InvocationHandler {

    /**
     * 被代理的对象
     */
    private Object target;

    public LogHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    private void before() {
        System.out.println(String.format("task start time： %s", System.currentTimeMillis()));
    }

    private void after() {
        System.out.println(String.format("task end time： %s", System.currentTimeMillis()));
    }

}
