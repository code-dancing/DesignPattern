package com.codedancing.designpattern.creational.singleton;

/**
 *  第二种形式：饿汉式 - 枚举
 *
 *  JDK 1.5+
 *
 *  避免多线程问题，还能防止反序列化重新创建新的对象，Effective Java 作者 Josh Bloch 提倡的方式
 */
public enum Singleton02 {

    /**
     * 枚举单例
     */
    INSTANCE

}
