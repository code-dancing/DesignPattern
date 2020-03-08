package com.codedancing.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        fans.add(Optional.of(observer).get());
    }

    /**
     * 粉丝退订
     */
    public void removeFan(FansObserver observer) {
        fans.remove(Optional.of(observer).get());
    }

    /**
     * 通知粉丝
     */
    public abstract void notifyFans();

}
