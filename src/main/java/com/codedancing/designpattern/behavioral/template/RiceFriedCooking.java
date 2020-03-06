package com.codedancing.designpattern.behavioral.template;

/**
 * 做蛋炒饭
 */
public class RiceFriedCooking extends AbstractCooking {

    @Override
    public void pourSauce() {
        System.out.println("放入鸡蛋、玉米粒、葱、姜");
    }

    @Override
    public void pourStapleFood() {
        System.out.println("放入蒸熟的米饭、盐");
    }

}
