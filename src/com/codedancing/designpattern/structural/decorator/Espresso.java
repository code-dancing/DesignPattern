package com.codedancing.designpattern.structural.decorator;

/**
 * 浓缩咖啡，相当于具体组件
 */
public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Espresso Coffee";
    }

    @Override
    public Double cost() {
        return 1.99;
    }
}
