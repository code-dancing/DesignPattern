package com.codedancing.designpattern.creational.factorymethod.factory;

import com.codedancing.designpattern.creational.factorymethod.simplefactory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 披萨商店（抽象）
 */
public abstract class AbstractPizzaStore {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    /**
     * 定义抽象方法createPizza, 让各个工厂子类自己实现当地的特色风味披萨
     */
    protected abstract Pizza createPizza(String pizzaType);

    /**
     * 披萨制作流程，所有的加盟店都需要遵守
     */
    protected final void orderPizza() {
        String pizzaType;
        Pizza pizza;
        do {
            pizzaType = getType();
            // 顾客决定工厂，子类工厂决定披萨，解耦！解耦！解耦！
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
