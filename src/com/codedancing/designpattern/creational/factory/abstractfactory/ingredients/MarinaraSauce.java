package com.codedancing.designpattern.creational.factory.abstractfactory.ingredients;

/**
 * 意大利西红柿酱
 */
public class MarinaraSauce implements Sauce {

    public String sauceType = "意大利西红柿酱";

    @Override
    public String getSauceType() {
        return sauceType;
    }
}
