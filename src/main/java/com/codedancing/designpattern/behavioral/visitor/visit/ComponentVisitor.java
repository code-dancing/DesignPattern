package com.codedancing.designpattern.behavioral.visitor.visit;

import com.codedancing.designpattern.behavioral.visitor.element.HardDisk;
import com.codedancing.designpattern.behavioral.visitor.element.CPU;
import com.codedancing.designpattern.behavioral.visitor.element.Memory;
import com.codedancing.designpattern.behavioral.visitor.element.GPU;

/**
 * 电脑组件访问者
 */
public class ComponentVisitor implements Visitor {

    @Override
    public void visit(HardDisk hardDisk) {
        System.out.println(String.format("您电脑的硬盘：%s", hardDisk.getBrandName()));
    }

    @Override
    public void visit(CPU cpu) {
        System.out.println(String.format("您电脑的CPU：%s", cpu.getBrandName()));
    }

    @Override
    public void visit(GPU gpu) {
        System.out.println(String.format("您电脑的GPU：%s", gpu.getBrandName()));
    }

    @Override
    public void visit(Memory memory) {
        System.out.println(String.format("您电脑的缓存：%s", memory.getBrandName()));
    }

}
