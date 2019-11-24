package com.codedancing.designpattern.creational.factorymethod.factory;

import com.codedancing.designpattern.creational.factorymethod.simplefactory.Pizza;

/**
 * 伦敦披萨订单处理
 */
public class LDPizzaOrder extends AbstractPizzaOrder {

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case "LDPepperPizza":
                pizza = new LDPepperPizza();
                pizza.setPizzaName("伦敦胡椒风味披萨");
                return pizza;
            case "LDGreekPizza":
                pizza = new LDGreekPizza();
                pizza.setPizzaName("伦敦希腊风味披萨");
                return pizza;
            case "LDCheesePizza":
                pizza = new LDCheesePizza();
                pizza.setPizzaName("伦敦芝士风味披萨");
                return pizza;
            default:
                return null;
        }
    }

}
