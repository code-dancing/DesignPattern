package com.codedancing.designpattern.behavioral.command;

/**
 * 空调命令，相当于具体命令B
 */
public class AirConditioningCommand implements Command {

    /**
     * 空调
     */
    private AirConditioning airConditioning;

    public AirConditioningCommand(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public void executeTurnOn() {
        airConditioning.turnOn();
    }

    @Override
    public void executeTurnOff() {
        airConditioning.turnOff();
    }

}
