package com.codedancing.designpattern.behavioral.visitor;

import com.codedancing.designpattern.behavioral.visitor.element.Component;
import com.codedancing.designpattern.behavioral.visitor.visit.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算机，相当于对象结构
 */
public class Computer {

    private String brandName;

    private List<Component> computerComponents = new ArrayList<>();

    public Computer(String brandName) {
        this.brandName = brandName;
    }

    public void addComponent(Component e) {
        computerComponents.add(e);
    }

    public void removeComponent(Component e) {
        computerComponents.remove(e);
    }

    public void accept(Visitor visitor) {
        System.out.println(String.format("您的电脑品牌：%s", brandName));
        for (Component e : computerComponents) {
            e.accept(visitor);
        }
    }

}
