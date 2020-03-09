package com.codedancing.designpattern.behavioral.visitor;

import com.codedancing.designpattern.behavioral.visitor.element.CPU;
import com.codedancing.designpattern.behavioral.visitor.element.GPU;
import com.codedancing.designpattern.behavioral.visitor.element.HardDisk;
import com.codedancing.designpattern.behavioral.visitor.element.Memory;
import com.codedancing.designpattern.behavioral.visitor.visit.ComponentVisitor;

public class Client {

    public static void main(String[] args) {
        Computer macBookPro = new Computer("MacBook Pro 13' 2019");
        macBookPro.addComponent(new CPU("2.6GHz 6核第九代 Intel Core i7"));
        macBookPro.addComponent(new GPU("AMD Radeon Pro 5300M"));
        macBookPro.addComponent(new HardDisk("512GB基于PCIe的SSD"));
        macBookPro.addComponent(new Memory("16GB 2133MHz LPDDR3内存"));

        macBookPro.accept(new ComponentVisitor());
    }

}
