package com.codedancing.designpattern.creational.factory.simplefactory;

/**
 * Pizza 抽象类
 */
public abstract class Pizza {

    /**
     * 披萨类型
     */
    protected String pizzaType;

    /**
     * 准备原材料, 不同的披萨不一样，做成抽象方法
     */
    public abstract void prepare();

    /**
     * 烘烤
     */
    public void bake() {
        System.out.println(pizzaType + "baking...");
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
