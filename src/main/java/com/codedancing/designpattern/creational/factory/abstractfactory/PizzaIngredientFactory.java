package com.codedancing.designpattern.creational.factory.abstractfactory;

import com.codedancing.designpattern.creational.factory.abstractfactory.ingredients.Cheese;
import com.codedancing.designpattern.creational.factory.abstractfactory.ingredients.Dough;
import com.codedancing.designpattern.creational.factory.abstractfactory.ingredients.Sauce;

/**
 * 为原料工厂定义接口
 */
public interface PizzaIngredientFactory {

    /**
     * 面团
     */
    Dough createDough();

    /**
     * 酱料
     */
    Sauce createSauce();

    /**
     * 芝士
     */
    Cheese createCheese();

}
