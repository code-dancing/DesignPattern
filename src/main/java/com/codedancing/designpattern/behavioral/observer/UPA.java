package com.codedancing.designpattern.behavioral.observer;

/**
 * UP主A，相当于具体主题
 */
public class UPA extends AbstractUPSubject {

    public UPA(String upName) {
        super(upName);
    }

    @Override
    public void notifyFans() {
        fans.forEach(fan -> fan.response(upName));
    }

}
