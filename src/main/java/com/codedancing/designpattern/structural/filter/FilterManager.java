package com.codedancing.designpattern.structural.filter;

/**
 * 过滤器管理
 */
public class FilterManager {

    private FilterChain filterChain;

    public FilterManager(Target target) {
        this.filterChain = new FilterChain();
        this.filterChain.setTarget(target);
    }

    public void addFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }

}
