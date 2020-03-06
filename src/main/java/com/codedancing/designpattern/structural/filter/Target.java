package com.codedancing.designpattern.structural.filter;

/**
 * 目标类
 */
public class Target {

    public void processingRequest(String request) {
        System.out.println("目标对象处理请求：" + request);
    }

}
