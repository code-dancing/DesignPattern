package com.codedancing.designpattern.creational.factory.abstractfactory.ingredients;
/**
 * 帕尔玛奶酪
 */
public class ReggianoCheese implements Cheese {

    private String cheeseType = "帕尔玛奶酪";

    @Override
    public String getCheeseType() {
        return cheeseType;
    }

}
