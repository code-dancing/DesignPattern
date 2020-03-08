package com.codedancing.designpattern.behavioral.observer;

/**
 * UP主B，相当于具体主题
 */
public class UPB extends AbstractUPSubject {

    public UPB(String upName) {
        super(upName);
    }

    @Override
    public void notifyFans() {
        fans.forEach(fan -> fan.response(upName));
    }

}
