package com.codedancing.designpattern.creational.factory.abstractfactory;

/**
 * 伦敦风味的芝士披萨
 */
public class LDCheesePizza extends AbstractPizza {

    private PizzaIngredientFactory ingredientFactory;

    public LDCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println(pizzaType + " preparing...");
        sauce = ingredientFactory.createSauce();
        System.out.println("sauce: " + sauce.getSauceType());
        dough = ingredientFactory.createDough();
        System.out.println("dough: " + dough.getDoughType());
        cheese = ingredientFactory.createCheese();
        System.out.println("cheese: " + cheese.getCheeseType() + "\n");
    }
}
