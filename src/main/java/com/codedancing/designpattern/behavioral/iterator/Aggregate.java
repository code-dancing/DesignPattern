package com.codedancing.designpattern.behavioral.iterator;

/**
 * 抽象聚合类
 */
public interface Aggregate<T> {

    void add(T t);

    void remove(T t);

    Iterator getIterator();

}
