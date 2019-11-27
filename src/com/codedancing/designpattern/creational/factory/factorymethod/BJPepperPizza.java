package com.codedancing.designpattern.creational.factory.factorymethod;

import com.codedancing.designpattern.creational.factory.simplefactory.Pizza;

/**
 * 北京胡椒风味披萨
 */
public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给北京胡椒风味披萨准备原材料");
    }

}
