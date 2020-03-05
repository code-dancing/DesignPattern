package com.codedancing.designpattern.creational.factory.factorymethod;

import com.codedancing.designpattern.creational.factory.simplefactory.Pizza;

/**
 * 北京希腊风味披萨
 */
public class BJGreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给北京希腊风味披萨准备原材料");
    }

}
