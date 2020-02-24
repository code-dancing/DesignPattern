package com.codedancing.designpattern.structural.bridge;

public class Test {

    public static void main(String[] args) {
        Coffee coffee = new CoffeeWithMilk(new MediumCup());
        coffee.orderCoffee(3);
        Coffee coffee1 = new CoffeeWithSugar(new BigCup());
        coffee1.orderCoffee(4);
    }

}
