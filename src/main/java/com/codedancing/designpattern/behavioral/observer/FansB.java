package com.codedancing.designpattern.behavioral.observer;

/**
 * 粉丝B，相当于具体观察者
 */
public class FansB implements FansObserver {

    private String fanName;

    public FansB(String fanName) {
        this.fanName = fanName;
    }

    @Override
    public void response(String upName) {
        System.out.println(String.format("嗨，【%s】，你关注的UP主【%s】发布了新作品，快来查看吧!", fanName, upName));
    }

}
