package com.codedancing.designpattern.behavioral.chainofresponsibility;

/**
 * 抽象职位
 */
public abstract class AbstractPosition {

    /**
     * 职位名称
     */
    private String positionName;
    /**
     * 职位等级
     */
    private int positionLevel;
    /**
     * 上级领导
     */
    private AbstractPosition nextPosition;

    public AbstractPosition(String positionName, int positionLevel) {
        this.positionName = positionName;
        this.positionLevel = positionLevel;
    }

    public String getPositionName() {
        return positionName;
    }

    public int getPositionLevel() {
        return positionLevel;
    }

    public AbstractPosition getNextPosition() {
        return nextPosition;
    }

    public void setNextPosition(AbstractPosition nextPosition) {
        this.nextPosition = nextPosition;
    }

    protected void reportCheck(Event event) {
        System.out.println(this.positionName + "已接收此事务");
        if (event.eventLevel == positionLevel) {
            handler(event);
        } else {
            System.out.println(this.positionName + "需要向上级报告");
            this.nextPosition.reportCheck(event);
        }
    }

    /**
     * 处理事务
     */
    public abstract void handler(Event event);


    /**
     * 工作事务
     */
    static class Event {

        /**
         * 事务重要等级
         */
        private int eventLevel;

        /**
         * 事务内容信息
         */
        private String eventDetails;

        public Event(String eventDetails, int eventLevel) {
            this.eventDetails = eventDetails;
            this.eventLevel = eventLevel;
        }

        public String getEventDetails() {
            return eventDetails;
        }

        public int getEventLevel() {
            return eventLevel;
        }
    }

}

