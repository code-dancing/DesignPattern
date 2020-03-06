package com.codedancing.designpattern.behavioral.chainofresponsibility;

/**
 * 老板
 */
public class Boss extends AbstractPosition {

    public Boss() {
        super("Boss", 2);
    }

    @Override
    public void handler(AbstractPosition.Event event) {
        System.out.println("现在是最高级别领导处理...");
        System.out.println(this.getPositionName() + "已处理事务：" + event.getEventDetails() + ", done.");
    }

}
