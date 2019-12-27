package com.codedancing.designpattern.structural.adapter.objectadapter;

/**
 * 手机
 */
public class Phone {

    public void charging(IO5V io5V) {
        if (io5V.output5V() == 5) {
            System.out.println("手机正在充电...");
        } else {
            System.out.println("电压不达标，不能充电。");
        }
    }

}
