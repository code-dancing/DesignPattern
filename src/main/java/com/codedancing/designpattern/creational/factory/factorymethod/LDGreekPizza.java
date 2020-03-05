package com.codedancing.designpattern.creational.factory.factorymethod;

import com.codedancing.designpattern.creational.factory.simplefactory.Pizza;

/**
 * 伦敦希腊风味披萨
 */
public class LDGreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给伦敦希腊风味披萨准备原材料");
    }

}
