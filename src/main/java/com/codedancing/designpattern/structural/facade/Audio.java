package com.codedancing.designpattern.structural.facade;

/**
 * 音响
 */
public class Audio {

    public void on() {
        System.out.println("打开音响...");
    }

    public void off() {
        System.out.println("关闭音响...");
    }

    public void setVolume() {
        System.out.println("设置音量...");
    }

}
