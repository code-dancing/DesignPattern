package com.codedancing.designpattern.behavioral.chainofresponsibility;

public class Client {

    public static void main(String[] args) {
        AbstractPosition position = new Director();
        position.setNextPosition(new Boss());
        position.reportCheck(new AbstractPosition.Event("工程造价预算讨论", 2));
    }

}
