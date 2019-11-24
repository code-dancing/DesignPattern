package com.codedancing.designpattern.creational.factorymethod.factory;

import com.codedancing.designpattern.creational.factorymethod.simplefactory.Pizza;

/**
 * 伦敦胡椒风味披萨
 */
public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给伦敦胡椒风味披萨准备原材料");
    }

}
