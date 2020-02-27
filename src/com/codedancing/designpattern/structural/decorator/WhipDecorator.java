package com.codedancing.designpattern.structural.decorator;

/**
 * 奶泡配料，让它扩展BaseCondimentDecorator。
 */
public class WhipDecorator extends BaseCondimentDecorator {

    public WhipDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.10;
    }
}
