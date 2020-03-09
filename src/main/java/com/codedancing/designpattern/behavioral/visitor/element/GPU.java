package com.codedancing.designpattern.behavioral.visitor.element;

import com.codedancing.designpattern.behavioral.visitor.visit.Visitor;

/**
 * GPU
 */
public class GPU implements Component {

    private String brandName;

    public GPU(String brandName) {
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
