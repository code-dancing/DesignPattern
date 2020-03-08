package com.codedancing.designpattern.behavioral.observer;

/**
 * 粉丝A，相当于具体观察者
 */
public class FansA implements FansObserver {

    private String fanName;

    public FansA(String fanName) {
        this.fanName = fanName;
    }

    @Override
    public void response(String upName) {
        System.out.println(String.format("嗨，【%s】，你关注的UP主【%s】发布了新作品，快来查看吧!", fanName, upName));
    }

}
