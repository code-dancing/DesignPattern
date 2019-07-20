package com.codedancing.designpattern.creational.singleton;

/**
 * 第四种形式：懒汉式 - 单线程
 *
 * 线程不安全（适用于单线程）
 */
public class Singleton04 {

    private static Singleton04 instance;

    private Singleton04() {}

    public static Singleton04 getInstance() {
        if (instance == null) {
            instance = new Singleton04();
        }
        return instance;
    }

}
