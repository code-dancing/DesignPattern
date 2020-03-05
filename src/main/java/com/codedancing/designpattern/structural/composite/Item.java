package com.codedancing.designpattern.structural.composite;

/**
 * 抽象物品，相当于 Component
 */
public interface Item {

    /**
     * 计算物品价格
     */
    double calculate();

    /**
     * 展示物品详情
     */
    void show();

}
