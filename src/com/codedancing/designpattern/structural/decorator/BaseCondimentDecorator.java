package com.codedancing.designpattern.structural.decorator;

/**
 * 调料装饰器
 */
public abstract class BaseCondimentDecorator implements Beverage {

    /**
     * 使用组合的方式，拥有具体饮料的引用
     */
    protected Beverage beverage;

    protected BaseCondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract Double cost();
}
