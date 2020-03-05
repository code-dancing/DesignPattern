package com.codedancing.designpattern.creational.factory.simplefactory;

public class Test {

    public static void main(String[] args) {
        System.out.println("使用简单工厂模式 -->");

        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        // 购买披萨
        pizzaStore.orderPizza();
    }

}
