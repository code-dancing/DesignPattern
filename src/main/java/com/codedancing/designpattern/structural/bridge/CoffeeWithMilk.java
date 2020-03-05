package com.codedancing.designpattern.structural.bridge;

/**
 * 咖啡加奶
 */
public class CoffeeWithMilk extends Coffee {

    public CoffeeWithMilk(Cup cup) {
        super(cup);
    }

    @Override
    public void orderCoffee(int count) {
        System.out.println(String.format("加奶咖啡%s x %d", cup.getSize(), count));
    }

}
