package com.codedancing.designpattern.creational.factory.factorymethod;

import com.codedancing.designpattern.creational.factory.simplefactory.Pizza;

/**
 * 伦敦披萨商店
 */
public class LDPizzaStore extends AbstractPizzaStore {

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case "PepperPizza":
                pizza = new LDPepperPizza();
                pizza.setPizzaType("伦敦胡椒风味披萨");
                return pizza;
            case "GreekPizza":
                pizza = new LDGreekPizza();
                pizza.setPizzaType("伦敦希腊风味披萨");
                return pizza;
            case "CheesePizza":
                pizza = new LDCheesePizza();
                pizza.setPizzaType("伦敦芝士风味披萨");
                return pizza;
            default:
                return null;
        }
    }

}
