package com.codedancing.designpattern.behavioral.visitor.visit;

import com.codedancing.designpattern.behavioral.visitor.element.HardDisk;
import com.codedancing.designpattern.behavioral.visitor.element.CPU;
import com.codedancing.designpattern.behavioral.visitor.element.Memory;
import com.codedancing.designpattern.behavioral.visitor.element.GPU;

/**
 * 抽象访问者
 */
public interface Visitor {

    void visit(HardDisk hardDisk);

    void visit(CPU cpu);

    void visit(GPU gpu);

    void visit(Memory memory);

}
