package com.codedancing.designpattern.behavioral.visitor.element;

import com.codedancing.designpattern.behavioral.visitor.visit.Visitor;

/**
 * CPU
 */
public class CPU implements Component {

    private String brandName;

    public CPU(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getBrandName() {
        return brandName;
    }

}
