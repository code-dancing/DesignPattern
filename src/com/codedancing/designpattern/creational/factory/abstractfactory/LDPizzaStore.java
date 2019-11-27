package com.codedancing.designpattern.creational.factory.abstractfactory;

/**
 * 伦敦披萨商店
 */
public class LDPizzaStore extends AbstractPizzaStore {

    private PizzaIngredientFactory ingredientFactory = new LDPizzaIngredientFactory();

    @Override
    protected AbstractPizza createPizza(String pizzaType) {
        AbstractPizza pizza;

        switch (pizzaType) {
            case "CheesePizza":
                pizza = new LDCheesePizza(ingredientFactory);
                pizza.setPizzaType("伦敦风味披萨");
                return pizza;
            default:
                return null;
        }
    }

}
