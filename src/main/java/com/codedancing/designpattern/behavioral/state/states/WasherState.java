package com.codedancing.designpattern.behavioral.state.states;

import com.codedancing.designpattern.behavioral.state.WasherContext;

/**
 * 洗衣机状态，抽象状态
 */
public interface WasherState {

    void operation(WasherContext context);

    void nextState(WasherContext context);

}
