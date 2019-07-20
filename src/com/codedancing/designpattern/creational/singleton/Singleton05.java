package com.codedancing.designpattern.creational.singleton;

/**
 * 第五种形式：懒汉式 - 双重判断
 *
 * 适用于多线程
 * 注意：这里的 instance 类变量需要使用volatile。
 */
public class Singleton05 {

    private static volatile Singleton05 instance;

    private Singleton05() {}

    public static Singleton05 getInstance() {
        // 此处判断是为了提高性能
        if (instance == null) {
            synchronized (Singleton05.class) {
                if (instance == null) {
                    instance = new Singleton05();
                }
            }
        }
        return instance;
    }

}
