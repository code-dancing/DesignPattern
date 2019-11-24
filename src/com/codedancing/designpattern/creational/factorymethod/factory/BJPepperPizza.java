package com.codedancing.designpattern.creational.factorymethod.factory;

import com.codedancing.designpattern.creational.factorymethod.simplefactory.Pizza;

/**
 * 北京胡椒风味披萨
 */
public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给北京胡椒风味披萨准备原材料");
    }

}
