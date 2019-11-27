package com.codedancing.designpattern.creational.factory.simplefactory;

/**
 * 希腊风味披萨
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给希腊风味披萨准备原材料");
    }

}
