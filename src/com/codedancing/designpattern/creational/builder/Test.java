package com.codedancing.designpattern.creational.builder;

public class Test {

    public static void main(String[] args) {
        // 建别墅
        AbstractHouseBuilder houseBuilder = new VillaBuilder();
        House villa = houseBuilder.buildHouse();
        System.out.println(villa + "\n");

        // 建平房
        houseBuilder = new CottageBuilder();
        House cottage = houseBuilder.buildHouse();
        System.out.println(cottage);
    }

}
