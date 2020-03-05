package com.codedancing.designpattern.creational.factory.factorymethod;

import com.codedancing.designpattern.creational.factory.simplefactory.Pizza;

/**
 * 伦敦胡椒风味披萨
 */
public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给伦敦胡椒风味披萨准备原材料");
    }

}
