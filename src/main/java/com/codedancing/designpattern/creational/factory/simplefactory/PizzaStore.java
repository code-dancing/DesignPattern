package com.codedancing.designpattern.creational.factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 披萨商店
 */
public class PizzaStore {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    /**
     * 给披萨商店供货的披萨工厂
     */
    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    /**
     * 披萨制作流程
     */
    public void orderPizza() {
        String pizzaType;
        Pizza pizza;
        do {
            pizzaType = getType();
            // 使用简单工厂创建实例，解耦！解耦！解耦！
            pizza = this.factory.createPizza(pizzaType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("披萨暂时缺货！请重新订购。");
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
