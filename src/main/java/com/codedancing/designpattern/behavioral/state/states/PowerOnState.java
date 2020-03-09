package com.codedancing.designpattern.behavioral.state.states;

import com.codedancing.designpattern.behavioral.state.WasherContext;

/**
 * 开机状态
 */
public class PowerOnState implements WasherState {

    @Override
    public void operation(WasherContext context) {
        System.out.println("洗衣机已开机，请放入衣服、洗涤剂...");
        if (context.isAUTO()) {
            nextState(context);
        }
    }

    @Override
    public void nextState(WasherContext context) {
        new WashingState().operation(context);
    }

}
