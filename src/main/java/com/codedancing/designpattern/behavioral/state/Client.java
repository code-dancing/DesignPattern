package com.codedancing.designpattern.behavioral.state;

import com.codedancing.designpattern.behavioral.state.states.DryState;
import com.codedancing.designpattern.behavioral.state.states.PowerOnState;
import com.codedancing.designpattern.behavioral.state.states.WashingState;

public class Client {

    public static void main(String[] args) {
        // 自动模式，使用责任链机制
        WasherContext context = new WasherContext(new PowerOnState(), WasherContext.AUTO_MODE);
        context.handle();

        System.out.println("\n=========================\n");

        // 手动模式，每个步骤需要人工操作，每个步骤可以单独执行
        context.setAUTO(false);
        // 1. 洗涤
        context.setWasherState(new WashingState());
        context.handle();
        // 2. 烘干
        context.setWasherState(new DryState());
        context.handle();
        System.out.println("...");
    }

}
