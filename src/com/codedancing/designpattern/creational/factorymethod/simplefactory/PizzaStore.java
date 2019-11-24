package com.codedancing.designpattern.creational.factorymethod.simplefactory;

/**
 * 披萨商店
 */
public class PizzaStore {

    public static void main(String[] args) {
        System.out.println("使用简单工厂模式 -->" );

        // 开始营业
        PizzaOrder.process();
    }

}
