package com.codedancing.designpattern.behavioral.memento;

/**
 * 备忘录管理类（存档）
 */
public class Caretaker {

    /**
     * 存放的关卡
     */
    private Memento memento;

    /**
     * 保存关卡
     */
    public void archiveMemento(Memento memento) {
       this.memento = memento;
    }

    /**
     * 恢复存档
     */
    public Memento restoreMemento() {
        return memento;
    }

}
