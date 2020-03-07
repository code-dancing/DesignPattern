package com.codedancing.designpattern.behavioral.command;

public class Client {

    public static void main(String[] args) {
        // 打开电视机
        Command tvCommand = new TVCommand(new TV());
        AISound aiSound = new AISound(tvCommand);
        aiSound.invokeTurnOn();

        // 打开空调
        Command airCommand = new AirConditioningCommand(new AirConditioning());
        aiSound.setCommand(airCommand);
        aiSound.invokeTurnOn();

        // 关闭电视机
        aiSound.setCommand(tvCommand);
        aiSound.invokeTurnOff();

        // 关闭空调
        aiSound.setCommand(airCommand);
        aiSound.invokeTurnOff();
    }

}
