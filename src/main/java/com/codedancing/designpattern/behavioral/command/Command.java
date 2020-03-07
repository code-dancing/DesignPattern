package com.codedancing.designpattern.behavioral.command;

/**
 * 抽象命令
 */
public interface Command {

    /**
     * 开启设备
     */
    void executeTurnOn();

    /**
     * 关闭设备
     */
    void executeTurnOff();

}
