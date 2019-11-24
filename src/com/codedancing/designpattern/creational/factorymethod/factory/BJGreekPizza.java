package com.codedancing.designpattern.creational.factorymethod.factory;

import com.codedancing.designpattern.creational.factorymethod.simplefactory.Pizza;

/**
 * 北京希腊风味披萨
 */
public class BJGreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给北京希腊风味披萨准备原材料");
    }

}
