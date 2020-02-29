package com.codedancing.designpattern.structural.facade;

/**
 * DVD播放器
 */
public class DVD {

    public void on() {
        System.out.println("打开DVD播放器...");
    }

    public void off() {
        System.out.println("关闭DVD播放器...");
    }

    public void pause() {
        System.out.println("DVD播放暂停...");
    }

    public void play() {
        System.out.println("DVD开始播放...");
    }

    public void setDisk(String movieName) {
        System.out.println(String.format("指定DVD影碟:[ %s ]", movieName));
    }

}
