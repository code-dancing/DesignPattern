package com.codedancing.designpattern.behavioral.visitor.element;

import com.codedancing.designpattern.behavioral.visitor.visit.Visitor;

/**
 * 内存
 */
public class Memory implements Component {

    private String brandName;

    public Memory(String brandName) {
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
