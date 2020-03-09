package com.codedancing.designpattern.behavioral.state.states;

import com.codedancing.designpattern.behavioral.state.WasherContext;

/**
 * 关机状态
 */
public class PowerOffState implements WasherState {

    @Override
    public void operation(WasherContext context) {
        if (context.isAUTO()) {
            System.out.println("洗衣已完成，洗衣机已自动关机节电。");
        } else {
            System.out.println("洗衣机已关机。");
        }
    }

    @Override
    public void nextState(WasherContext context) {

    }

}
