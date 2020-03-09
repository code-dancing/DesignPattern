package com.codedancing.designpattern.behavioral.state.states;

import com.codedancing.designpattern.behavioral.state.WasherContext;

/**
 * 脱水状态
 */
public class DewateringState implements WasherState {

    @Override
    public void operation(WasherContext context) {
        System.out.println("洗衣机正在给衣物脱水...");
        if (context.isAUTO()) {
            nextState(context);
        }
    }

    @Override
    public void nextState(WasherContext context) {
        new DryState().operation(context);
    }

}
