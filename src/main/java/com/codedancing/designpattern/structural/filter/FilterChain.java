package com.codedancing.designpattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链
 */
public class FilterChain {

    /**
     * 过滤器
     */
    private List<Filter> filters;
    /**
     * 目标对象
     */
    private Target target;

    public FilterChain() {
        filters = new ArrayList<>();
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void execute(String request) {
        // 过滤请求
        for (Filter filter : filters) {
            filter.execute(request);
        }
        // 目标对象处理请求
        target.processingRequest(request);
    }

}
