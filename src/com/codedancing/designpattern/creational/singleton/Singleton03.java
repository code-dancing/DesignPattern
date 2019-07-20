package com.codedancing.designpattern.creational.singleton;

import java.io.IOException;
import java.util.Properties;

/**
 *  第三种形式：饿汉式 - 静态代码块
 *
 *  适合复杂实例化
 *  线程安全
 */
public class Singleton03 {

    public static final Singleton03 INSTANCE;
    private String initialInfo;

    static {
        try {
            Properties properties = new Properties();
            properties.load(Singleton03.class.getClassLoader().getResourceAsStream("singleton.peroperties"));
            INSTANCE = new Singleton03(properties.getProperty("SingletonInfo"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Singleton03(String initialInfo) { this.initialInfo = initialInfo; }

    @Override
    public String toString() {
        return "Singleton03{" +
                "initialInfo='" + initialInfo + '\'' +
                '}';
    }

}
