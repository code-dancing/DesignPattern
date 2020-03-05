package com.codedancing.designpattern.structural.decorator;

public class Test {

    public static void main(String[] args) {
        // 订一杯Espresso，不需要调料，打印出它的描述与价格
        Beverage espresso = new Espresso();
        System.out.println("饮料种类： " + espresso.getDescription() + ", 价格： " + espresso.cost());
        // 再来一杯调料为双份摩卡再加奶泡的Espresso咖啡
        espresso = new MochaDecorator(espresso);
        espresso = new MochaDecorator(espresso);
        espresso = new WhipDecorator(espresso);
        System.out.println("饮料种类： " + espresso.getDescription() + ", 价格： " + espresso.cost());

        // 订一杯HouseBlend，不需要调料，打印出它的描述与价格
        Beverage houseBlend = new HouseBlend();
        System.out.println("饮料种类： " + houseBlend.getDescription() + ", 价格： " + houseBlend.cost());
        // 再来一杯调料为豆浆、摩卡、奶泡的HouseBlend咖啡
        houseBlend = new MochaDecorator(houseBlend);
        houseBlend = new SoyDecorator(houseBlend);
        houseBlend = new WhipDecorator(houseBlend);
        System.out.println("饮料种类： " + houseBlend.getDescription() + ", 价格： " + houseBlend.cost());
    }

}
