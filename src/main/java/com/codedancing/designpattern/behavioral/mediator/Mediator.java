package com.codedancing.designpattern.behavioral.mediator;

/**
 * 抽象中介者
 */
public interface Mediator {

    /**
     * 注册同事类
     */
    void register(AbstractColleague colleague);

    /**
     * 转发消息
     */
    void relay(AbstractColleague colleague);

}
