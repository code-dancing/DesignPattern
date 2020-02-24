package com.codedancing.designpattern.structural.bridge;

/**
 * 咖啡加糖
 */
public class CoffeeWithSugar extends Coffee {

    public CoffeeWithSugar(Cup cup) {
        super(cup);
    }

    @Override
    public void orderCoffee(int count) {
        System.out.println(String.format("加糖咖啡%s x %d", cup.getSize(), count));
    }

}
