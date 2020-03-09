package com.codedancing.designpattern.behavioral.state;

import com.codedancing.designpattern.behavioral.state.states.PowerOnState;
import com.codedancing.designpattern.behavioral.state.states.WashingState;

public class Client {

    public static void main(String[] args) {
        // 自动模式，使用责任链机制
        WasherContext context = new WasherContext(WasherContext.AUTO_MODE);
        context.setWasherState(new PowerOnState());
        context.handle();

        System.out.println("\n=========================\n");

        // 手动模式
        context.setAUTO(false);
        // 1. 开机，放入衣服、洗涤剂
        context.setWasherState(new PowerOnState());
        context.handle();
        // 2. 洗涤
        context.setWasherState(new WashingState());
        context.handle();
        System.out.println("...");
    }

}
