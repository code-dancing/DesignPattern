package com.codedancing.designpattern.behavioral.visitor.element;

import com.codedancing.designpattern.behavioral.visitor.visit.Visitor;

/**
 * 电脑组件，抽象元素
 */
public interface Component {

    void accept(Visitor visitor);

}
