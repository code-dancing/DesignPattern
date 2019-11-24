package com.codedancing.designpattern.creational.factorymethod.simplefactory;

/**
 * 芝士风味披萨
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给芝士风味披萨准备原材料");
    }

}
