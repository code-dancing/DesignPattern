package com.codedancing.designpattern.creational.factorymethod.factory;

public class PizzaStore {

    public static void main(String[] args) {
        System.out.println("使用工厂模式 -->");

        // 开始营业
//        BJPizzaOrder bjPizzaOrder = new BJPizzaOrder();
//        bjPizzaOrder.process();

        LDPizzaOrder ldPizzaOrder = new LDPizzaOrder();
        ldPizzaOrder.process();

    }

}
