package com.codedancing.designpattern.behavioral.command;

/**
 * AI音响，相当于 Invoker
 */
public class AISound {

    /**
     * 命令
     */
    private Command command;

    public AISound(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 调用开机命令
     */
    public void invokeTurnOn() {
        command.executeTurnOn();
    }

    /**
     * 调用关机命令
     */
    public void invokeTurnOff() {
        command.executeTurnOff();
    }

}
