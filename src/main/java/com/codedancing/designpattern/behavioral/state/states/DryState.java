package com.codedancing.designpattern.behavioral.state.states;

import com.codedancing.designpattern.behavioral.state.WasherContext;

/**
 * 烘干状态
 */
public class DryState implements WasherState {

    @Override
    public void operation(WasherContext context) {
        System.out.println("洗衣机正在烘干衣物...");
        if (context.isAUTO()) {
            nextState(context);
        }
    }

    @Override
    public void nextState(WasherContext context) {
        new PowerOffState().operation(context);
    }

}
