package com.codedancing.designpattern.behavioral.state.states;

import com.codedancing.designpattern.behavioral.state.WasherContext;

/**
 * 洗涤状态
 */
public class WashingState implements WasherState {

    @Override
    public void operation(WasherContext context) {
        System.out.println("洗衣机正在洗涤衣物...");
        if (context.isAUTO()) {
            nextState(context);
        }
    }

    @Override
    public void nextState(WasherContext context) {
        new DewateringState().operation(context);
    }

}
