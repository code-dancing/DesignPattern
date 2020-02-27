package com.codedancing.designpattern.structural.decorator;

/**
 * 摩卡配料，让它扩展BaseCondimentDecorator。
 */
public class MochaDecorator extends BaseCondimentDecorator {

    public MochaDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.20;
    }
}
