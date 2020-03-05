package com.codedancing.designpattern.creational.factory.abstractfactory.ingredients;

/**
 * 莫扎里拉奶酪
 */
public class MozzarellaCheese implements Cheese {

    private String cheeseType = "莫扎里拉奶酪";

    @Override
    public String getCheeseType() {
        return cheeseType;
    }
}
