package com.codedancing.designpattern.creational.factory.abstractfactory.ingredients;

/**
 * 厚皮面团
 */
public class ThickCrustDough implements Dough {

    private String doughType = "厚皮面团";

    @Override
    public String getDoughType() {
        return doughType;
    }
}
