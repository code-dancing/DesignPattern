package com.codedancing.designpattern.creational.factorymethod.simplefactory;

/**
 * Pizza 抽象类
 */
public abstract class Pizza {

    /**
     * 披萨名称
     */
    protected String pizzaName;

    /**
     * 准备原材料, 不同的披萨不一样，做成抽象方法
     */
    public abstract void prepare();

    /**
     * 烘烤
     */
    public void bake() {
        System.out.println(pizzaName + "baking...");
    }

    /**
     * 切块
     */
    public void cut() {
        System.out.println(pizzaName + "cutting...");
    }

    /**
     * 包装
     */
    public void box() {
        System.out.println(pizzaName + "boxing...");
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

}
