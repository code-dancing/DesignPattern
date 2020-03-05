package com.codedancing.designpattern.creational.singleton;

/**
 * 第六种形式：懒汉式 - 内部类
 *
 * 在内部类初始化时，才创建Singleton实例
 * 静态内部类不会随着外部类的加载和初始化而初始化，静态内部类和非静态内部类一样，都是在被调用时才会被加载，它是单独去加载和初始化的，在内部类加载和初始化时创建对象，所以是线程安全的
 *
 * 实现懒加载且线程安全，推荐
 */
public class Singleton06 {

    private Singleton06() {}

    private static class Inner {
        private static final Singleton06 INSTANCE = new Singleton06();
    }

    public static Singleton06 getInstance() {
        return Inner.INSTANCE;
    }

}
