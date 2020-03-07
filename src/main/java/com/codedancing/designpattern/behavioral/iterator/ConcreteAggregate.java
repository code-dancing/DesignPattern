package com.codedancing.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合类
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    private List<T> list = new ArrayList<>();

    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public void remove(T t) {
        list.remove(t);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator<T>(list);
    }

}
