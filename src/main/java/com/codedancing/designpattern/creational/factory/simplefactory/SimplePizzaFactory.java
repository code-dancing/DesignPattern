package com.codedancing.designpattern.creational.factory.simplefactory;

/**
 * 简单工厂类
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case "PepperPizza":
                pizza = new PepperPizza();
                pizza.setPizzaType("胡椒风味披萨");
                return pizza;
            case "GreekPizza":
                pizza = new GreekPizza();
                pizza.setPizzaType("希腊风味披萨");
                return pizza;
            case "CheesePizza":
                pizza = new CheesePizza();
                pizza.setPizzaType("芝士风味披萨");
                return pizza;
            default:
                return null;
        }
    }

}
