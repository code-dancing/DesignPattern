package com.codedancing.designpattern.creational.factory.abstractfactory.ingredients;

/**
 * 梅子小番茄酱
 */
public class PlumTomatoSauce implements Sauce {

    private String sauceType = "梅子小番茄酱";

    @Override
    public String getSauceType() {
        return sauceType;
    }
}
