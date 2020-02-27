package com.codedancing.designpattern.structural.decorator;

/**
 * Beverage是一个接口，相当于抽象的Component
 * 有两个方法，获取饮料产品的描述和价格
 */
public interface Beverage {

    /**
     * 获取饮料的描述
     */
    String getDescription();

    /**
     * 获取饮料的价格
     */
    Double cost();

}
