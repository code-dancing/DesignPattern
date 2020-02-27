package com.codedancing.designpattern.structural.decorator;

/**
 * 豆浆配料，让它扩展BaseCondimentDecorator。
 */
public class SoyDecorator extends BaseCondimentDecorator {

    public SoyDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.15;
    }
}
