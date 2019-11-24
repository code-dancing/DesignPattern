package com.codedancing.designpattern.creational.factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 披萨订单处理
 */
public class PizzaOrder {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public PizzaOrder() { }

    /**
     * 交付披萨工厂生产
     */
    public static void process() {
        String pizzaType;
        Pizza pizza;
        do {
            pizzaType = getType();
            pizza = SimpleFactory.createPizza(pizzaType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("产品暂时缺货！请重新订购。");
            }
        } while (true);
    }

    /**
     * 获取客户订购的披萨种类
     *
     * @return 披萨类型
     */
    private static String getType() {
        System.out.println("\n请输入披萨类型：");
        try {
            return READER.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
