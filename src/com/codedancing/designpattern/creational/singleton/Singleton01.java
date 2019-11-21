package com.codedancing.designpattern.creational.singleton;

/**
 *  第一种形式：饿汉式 - 直接初始化
 *
 *  这种写法比较简单，就是在类装载的时候就完成实例化。从classloader机制避免了线程同步问题。
 *  在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费
 */
public class Singleton01 {

    public static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01() {}

}
