package com.codedancing.designpattern.behavioral.state;

import com.codedancing.designpattern.behavioral.state.states.WasherState;

/**
 * 洗衣机，相当于环境类
 */
public class WasherContext {

    /**
     * 模式
     */
    public static final String AUTO_MODE = "自动模式";
    public static final String MANUAL_MODE = "手动模式";
    /**
     * 是否为自动模式
     */
    private boolean isAUTO;
    /**
     * 洗衣机状态
     */
    private WasherState washerState;

    public WasherContext(WasherState washerState, String washingMode) {
        if (AUTO_MODE.equals(washingMode)) {
            isAUTO = true;
        }
        this.washerState = washerState;
        System.out.println("您已将洗涤模式设置为：" + washingMode);
    }

    /**
     * 执行洗衣操作
     */
    public void handle() {
        washerState.operation(this);
    }

    public void setWasherState(WasherState washerState) {
        this.washerState = washerState;
    }

    public WasherState getWasherState() {
        return washerState;
    }

    public void setAUTO(boolean auto) {
        System.out.println("您已将洗涤模式设置为：" + (auto ? AUTO_MODE : MANUAL_MODE));
        isAUTO = auto;
    }

    public boolean isAUTO() {
        return isAUTO;
    }

}
