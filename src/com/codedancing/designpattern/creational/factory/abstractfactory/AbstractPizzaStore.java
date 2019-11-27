package com.codedancing.designpattern.creational.factory.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 披萨商店（抽象）
 */
public abstract class AbstractPizzaStore {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    /**
     * 定义抽象方法createPizza, 让各个工厂子类自己实现
     */
    protected abstract AbstractPizza createPizza(String pizzaType);

    /**
     * 披萨制作流程
     */
    protected final void orderPizza() {
        String pizzaType;
        AbstractPizza pizza;
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
