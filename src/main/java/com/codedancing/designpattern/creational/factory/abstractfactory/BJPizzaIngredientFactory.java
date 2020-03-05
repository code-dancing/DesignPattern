package com.codedancing.designpattern.creational.factory.abstractfactory;

import com.codedancing.designpattern.creational.factory.abstractfactory.ingredients.*;

/**
 * 北京披萨材料工厂
 */
public class BJPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

}
