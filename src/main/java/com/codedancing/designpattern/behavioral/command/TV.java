package com.codedancing.designpattern.behavioral.command;

/**
 * 电视机，相当于 ReceiverA
 */
public class TV {

    /**
     * 开机
     */
    public void turnOn() {
        System.out.println("开启电视机...");
    }


    /**
     * 关机
     */
    public void turnOff() {
        System.out.println("关闭电视机...");
    }

}
