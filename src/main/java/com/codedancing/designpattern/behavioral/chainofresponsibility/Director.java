package com.codedancing.designpattern.behavioral.chainofresponsibility;

/**
 * 项目负责人
 */
public class Director extends AbstractPosition {

    public Director() {
        super("项目负责人", 1);
    }

    @Override
    public void handler(AbstractPosition.Event event) {
        System.out.println(this.getPositionName() + "已处理事务：" + event.getEventDetails() + ", done.");
    }

}
