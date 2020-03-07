package com.codedancing.designpattern.behavioral.iterator;

/**
 * 抽象迭代器
 */
public interface Iterator<T> {

    T next();

    boolean hasNext();

}
