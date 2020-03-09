package com.codedancing.designpattern.behavioral.visitor.element;

import com.codedancing.designpattern.behavioral.visitor.visit.Visitor;

/**
 * 硬盘
 */
public class HardDisk implements Component {

    private String brandName;

    public HardDisk(String brandName) {
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

