package com.codedancing.designpattern.behavioral.iterator;

import java.util.List;

/**
 * 具体迭代器
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private List<T> list;
    private int index = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public T next() {
        return hasNext() ? list.get(index++) : null;
    }

    @Override
    public boolean hasNext() {
        return list.size() != 0 && index < list.size();
    }

}
