package com.codedancing.designpattern.creational.factory.abstractfactory;

public class Test {

    public static void main(String[] args) {
        System.out.println("使用抽象工厂模式 -->");

        // 购买披萨
        BJPizzaStore pizzaStore = new BJPizzaStore();
        pizzaStore.orderPizza();

//        LDPizzaStore pizzaStore = new LDPizzaStore();
//        pizzaStore.orderPizza();

    }

}
