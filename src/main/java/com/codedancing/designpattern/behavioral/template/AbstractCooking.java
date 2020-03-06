package com.codedancing.designpattern.behavioral.template;

/**
 * 抽象模板类
 */
public abstract class AbstractCooking {

    /**
     * 做饭
     */
    public void cooking() {
        pourOil();
        heatingOil();
        pourSauce();
        pourStapleFood();
        fry();
    }

    /**
     * 1. 倒油
     */
    public void pourOil() {
        System.out.println("放锅倒油");
    }

    /**
     * 2. 热油
     */
    public void heatingOil() {
        System.out.println("开火热油");
    }

    /**
     * 3. 辅料
     */
    public abstract void pourSauce();

    /**
     * 4. 放主食
     */
    public abstract void pourStapleFood();

    /**
     * 5. 炒饭
     */
    public void fry() {
        System.out.println("开始炒...");
    }

}
