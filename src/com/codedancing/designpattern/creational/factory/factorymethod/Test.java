package com.codedancing.designpattern.creational.factorymethod.factory;

public class Test {

    public static void main(String[] args) {
        System.out.println("使用工厂模式 -->");

        // 开始营业
//        BJPizzaStore pizzaStore = new BJPizzaStore();
//        pizzaStore.process();

        LDPizzaStore pizzaStore = new LDPizzaStore();
        pizzaStore.orderPizza();

    }

}
