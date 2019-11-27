package com.codedancing.designpattern.creational.factory.abstractfactory;

import com.codedancing.designpattern.creational.factory.abstractfactory.ingredients.Cheese;
import com.codedancing.designpattern.creational.factory.abstractfactory.ingredients.Dough;
import com.codedancing.designpattern.creational.factory.abstractfactory.ingredients.Sauce;

/**
 * 披萨（抽象）
 */
public abstract class AbstractPizza {

    /**
     * 披萨类型
     */
    protected String pizzaType;
    /**
     * 披萨的酱料
     */
    protected Sauce sauce;
    /**
     * 披萨的面团
     */
    protected Dough dough;
    /**
     * 披萨的芝士
     */
    protected Cheese cheese;

    /**
     * 基本的做法（具体种类的披萨去实现）
     */
    public abstract void prepare();

    /**
     * 烘烤
     */
    public void bake() {
        System.out.println( pizzaType + "baking...");
    }

    /**
     * 切块
     */
    public void cut() {
        System.out.println(pizzaType + "cutting...");
    }

    /**
     * 包装
     */
    public void box() {
        System.out.println(pizzaType + "boxing...");
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

}
