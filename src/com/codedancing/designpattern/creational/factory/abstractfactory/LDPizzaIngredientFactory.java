package com.codedancing.designpattern.creational.factory.abstractfactory;

import com.codedancing.designpattern.creational.factory.abstractfactory.ingredients.*;

/**
 * 伦敦披萨材料工厂
 */
public class LDPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

}
