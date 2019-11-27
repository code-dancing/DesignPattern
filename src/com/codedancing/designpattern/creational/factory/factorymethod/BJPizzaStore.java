package com.codedancing.designpattern.creational.factorymethod.factory;

import com.codedancing.designpattern.creational.factorymethod.simplefactory.Pizza;

/**
 * 北京披萨商店
 */
public class BJPizzaStore extends AbstractPizzaStore {

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case "PepperPizza":
                pizza = new BJPepperPizza();
                pizza.setPizzaType("北京胡椒风味披萨");
                return pizza;
            case "GreekPizza":
                pizza = new BJGreekPizza();
                pizza.setPizzaType("北京希腊风味披萨");
                return pizza;
            case "CheesePizza":
                pizza = new BJCheesePizza();
                pizza.setPizzaType("北京芝士风味披萨");
                return pizza;
            default:
                return null;
        }
    }

}
