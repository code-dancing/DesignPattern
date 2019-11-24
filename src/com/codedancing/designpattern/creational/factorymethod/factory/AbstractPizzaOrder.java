package com.codedancing.designpattern.creational.factorymethod.factory;

import com.codedancing.designpattern.creational.factorymethod.simplefactory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 披萨订单处理（抽象）
 */
public abstract class AbstractPizzaOrder {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    /**
     * 定义抽象方法createPizza, 让各个工厂子类自己实现
     */
    protected abstract Pizza createPizza(String pizzaType);

    /**
     * 交付披萨工厂生产
     */
    protected void process() {
        String pizzaType;
        Pizza pizza;
        do {
            pizzaType = getType();
            pizza = createPizza(pizzaType);
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
    private String getType() {
        System.out.println("\n请输入披萨类型：");
        try {
            return READER.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
