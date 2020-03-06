package com.codedancing.designpattern.structural.filter;

public class Client {

    public static void main(String[] args) {
        sendRequest();
    }

    private static void sendRequest() {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.addFilter(new AuthenticationFilter());
        filterManager.addFilter(new SpecificationFilter());
        filterManager.filterRequest("【@Request：这里是一个WEB请求】");
    }

}
