package com.codedancing.designpattern.behavioral.observer;

/**
 * 粉丝，相当于抽象观察者
 */
public interface FansObserver {

    /**
     * 粉丝对订阅通知的响应
     */
    void response(String upName);

}
