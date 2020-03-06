package com.codedancing.designpattern.structural.filter;

/**
 * 过滤器实现类B
 */
public class SpecificationFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("规范检查:" + request);
    }

}
