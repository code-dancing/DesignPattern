package com.codedancing.designpattern.behavioral.interpreter;

public class Client {

    /**
     * 文法规则
     * <expression> ::= <city>的<person>
     * <city> ::= 北京 | 天津
     * <person> ::= 老人 | 儿童
     */
    public static void main(String[] args) {
        Context bus = new Context();

        bus.freeRide("北京的老人");
        bus.freeRide("北京的中年人");
        bus.freeRide("天津的妇女");
        bus.freeRide("天津的儿童");
        bus.freeRide("河北的中年人");
    }

}
