package com.codedancing.designpattern.structural.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        // 1. 创建被代理的对象，UserService接口的实现类
        UserServiceImpl userService = new UserServiceImpl();
        // 2. 获取对应的 ClassLoader
        ClassLoader classLoader = userService.getClass().getClassLoader();
        // 3. 获取所有接口的Class，这里的UserServiceImpl只实现了一个接口UserService
        Class[] interfaces = userService.getClass().getInterfaces();
        // 4. 创建一个将传给代理类的调用请求处理器，处理所有的代理对象上的方法调用
        LogHandler logHandler = new LogHandler(userService);

        /*
		   5.根据上面提供的信息来创建代理对象 在这个过程中：
               a.JDK会通过根据传入的参数信息动态地在内存中创建和.class文件等同的字节码
               b.然后根据相应的字节码转换成对应的class，
               c.然后调用newInstance()创建代理实例
		 */
        UserService proxyInstance = (UserService)Proxy.newProxyInstance(classLoader, interfaces, logHandler);
        proxyInstance.select();
        proxyInstance.update();


        // Java8
        UserService proxyInstance1 = (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(), new Class[]{UserService.class},
                (proxy, method, args1) -> {
                    System.out.println(String.format("task start time： %s", System.currentTimeMillis()));
                    try {
                        return method.invoke(userService, args1);
                    } finally {
                        System.out.println(String.format("task end time： %s", System.currentTimeMillis()));
                    }
                }
        );
        proxyInstance1.select();
        proxyInstance1.update();

        // 保存JDK动态代理生成的代理类，类名保存为 UserServiceProxy
        // ProxyUtils.generateClassFile(userServiceImpl.getClass(), "UserServiceProxy");
    }

}
