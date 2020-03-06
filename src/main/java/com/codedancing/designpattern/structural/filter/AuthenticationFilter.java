package com.codedancing.designpattern.structural.filter;

/**
 * 过滤器实现类A
 */
public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("授权检查：" + request);
    }

}
