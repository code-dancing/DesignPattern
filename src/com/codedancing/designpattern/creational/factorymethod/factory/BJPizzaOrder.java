package com.codedancing.designpattern.creational.factorymethod.factory;

import com.codedancing.designpattern.creational.factorymethod.simplefactory.Pizza;

/**
 * 北京披萨订单处理
 */
public class BJPizzaOrder extends AbstractPizzaOrder {

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case "BJPepperPizza":
                pizza = new BJPepperPizza();
                pizza.setPizzaName("北京胡椒风味披萨");
                return pizza;
            case "BJGreekPizza":
                pizza = new BJGreekPizza();
                pizza.setPizzaName("北京希腊风味披萨");
                return pizza;
            case "BJCheesePizza":
                pizza = new BJCheesePizza();
                pizza.setPizzaName("北京芝士风味披萨");
                return pizza;
            default:
                return null;
        }
    }

}
