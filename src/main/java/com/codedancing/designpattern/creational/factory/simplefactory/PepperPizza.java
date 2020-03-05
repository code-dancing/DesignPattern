package com.codedancing.designpattern.creational.factory.simplefactory;

/**
 * 胡椒风味披萨
 */
public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给胡椒风味披萨准备原材料");
    }

}
