package com.codedancing.designpattern.behavioral.command;

/**
 * 电视机命令，相当于具体命令A
 */
public class TVCommand implements Command {

    /**
     * 电视机
     */
    private TV tv;

    public TVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executeTurnOn() {
        tv.turnOn();
    }

    @Override
    public void executeTurnOff() {
        tv.turnOff();
    }
}
