package com.codedancing.designpattern.creational.factory.abstractfactory;

/**
 * 北京披萨商店
 */
public class BJPizzaStore extends AbstractPizzaStore {

    private PizzaIngredientFactory ingredientFactory = new BJPizzaIngredientFactory();

    @Override
    protected AbstractPizza createPizza(String pizzaType) {
        AbstractPizza pizza;

        switch (pizzaType) {
            case "CheesePizza":
                pizza = new BJCheesePizza(ingredientFactory);
                pizza.setPizzaType("北京芝士风味披萨");
                return pizza;
            default:
                return null;
        }
    }

}
