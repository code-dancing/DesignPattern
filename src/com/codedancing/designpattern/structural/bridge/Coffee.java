package com.codedancing.designpattern.structural.bridge;

/**
 * 咖啡（抽象类层次）
 */
public abstract class Coffee {

    /**
     * 使用聚合关系
     */
    protected Cup cup;

    protected Coffee(Cup cup) {
        this.cup = cup;
    }

    /**
     * 下单咖啡
     */
    public abstract void orderCoffee(int count);

}
