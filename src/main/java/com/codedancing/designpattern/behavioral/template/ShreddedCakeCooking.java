package com.codedancing.designpattern.behavioral.template;

/**
 * 做炒饼丝
 */
public class ShreddedCakeCooking extends AbstractCooking {
    @Override
    public void pourSauce() {
        System.out.println("放入葱、姜、蒜");
    }

    @Override
    public void pourStapleFood() {
        System.out.println("放入饼丝、盐、胡椒粉");
    }
}
