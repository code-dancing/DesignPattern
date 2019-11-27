package com.codedancing.designpattern.creational.factorymethod.factory;

import com.codedancing.designpattern.creational.factorymethod.simplefactory.Pizza;

/**
 * 伦敦希腊风味披萨
 */
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给伦敦芝士风味披萨准备原材料");
    }

}
