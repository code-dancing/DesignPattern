package com.codedancing.designpattern.behavioral.state.states;

import com.codedancing.designpattern.behavioral.state.WasherContext;

/**
 * 关机状态
 */
public class PowerOffState implements WasherState {

    @Override
    public void operation(WasherContext context) {
        System.out.println("洗衣已完成，洗衣机已自动关机节电。");
    }

    @Override
    public void nextState(WasherContext context) {

    }

}
