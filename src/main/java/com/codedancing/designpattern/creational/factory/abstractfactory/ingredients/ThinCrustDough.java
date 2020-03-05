package com.codedancing.designpattern.creational.factory.abstractfactory.ingredients;
/**
 * 薄皮面团
 */
public class ThinCrustDough implements Dough {

    private String doughType = "薄皮面团";

    @Override
    public String getDoughType() {
        return doughType;
    }
}
