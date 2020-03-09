package com.codedancing.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * UP主，相当于抽象主题
 */
public abstract class AbstractUPSubject {

    protected String upName;

    protected List<FansObserver> fans = new ArrayList<>();

    public AbstractUPSubject(String upName) {
        this.upName = upName;
    }

    /**
     * 粉丝订阅
     */
    public void addFan(FansObserver observer) {
        if (observer != null) {
            fans.add(observer);
        }
    }

    /**
     * 粉丝退订
     */
    public void removeFan(FansObserver observer) {
        if (observer != null) {
            fans.remove(observer);
        }
    }

    /**
     * 通知粉丝
     */
    public abstract void notifyFans();

}
