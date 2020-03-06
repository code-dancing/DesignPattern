package com.codedancing.designpattern.behavioral.interpreter;

import java.util.*;

/**
 * 抽象表达式类
 */
interface Expression {

    boolean interpret(String info);

}

/**
 * 终结符表达式类
 */
class TerminalExpression implements Expression {

    private Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data) {
        Collections.addAll(set, data);
    }

    @Override
    public boolean interpret(String info) {
        return set.contains(info);
    }

}

/**
 * 非终结符表达式类
 */
class AndExpression implements Expression {

    private Expression city;
    private Expression person;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] s = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }

}


/**
 * 环境类
 */
class Context {

    private String[] citys = {"北京", "天津"};
    private String[] persons = {"老人", "儿童"};
    private Expression cityPerson;

    public Context() {
        Expression city = new TerminalExpression(citys);
        Expression person = new TerminalExpression(persons);
        cityPerson = new AndExpression(city, person);
    }

    public void freeRide(String info) {
        boolean ok = cityPerson.interpret(info);
        if (ok) {
            System.out.println("您是" + info + "，您本次乘车免费！");
        } else {
            System.out.println(info + "，您不是免费人员，本次乘车扣费1元！");
        }
    }
}
