package com.codedancing.designpattern.structural.facade;

/**
 * 投影仪
 */
public class Projector {

    public void on() {
        System.out.println("打开投影仪...");
    }

    public void off() {
        System.out.println("关闭投影仪...");
    }

    public void focus() {
        System.out.println("调节投影仪焦距...");
    }

}
