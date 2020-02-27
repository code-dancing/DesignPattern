package com.codedancing.designpattern.structural.decorator;

/**
 * 家常咖啡，相当于具体组件
 */
public class HouseBlend implements Beverage {
    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public Double cost() {
        return 0.89;
    }
}
