package com.codedancing.designpattern.creational.factory.simplefactory;

/**
 * 简单工厂类
 */
public class SimpleFactory {

    public static Pizza createPizza(String pizzaName) {
        Pizza pizza;

        switch (pizzaName) {
            case "PepperPizza" :
                pizza = new PepperPizza();
                pizza.setPizzaName("胡椒风味披萨");
                return pizza;
            case "GreekPizza" :
                pizza = new GreekPizza();
                pizza.setPizzaName("希腊风味披萨");
                return pizza;
            case "CheesePizza" :
                pizza = new CheesePizza();
                pizza.setPizzaName("芝士风味披萨");
                return pizza;
            default:
                return null;
        }
    }

}
