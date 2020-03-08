package com.codedancing.designpattern.behavioral.memento;

import java.util.Objects;

/**
 * 备忘录
 */
public class Memento {

    /**
     * 关卡
     */
    private Integer checkpoint;

    public Memento(Integer checkpoint) {
        this.checkpoint = checkpoint;
    }

    public Integer getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(Integer checkpoint) {
        this.checkpoint = checkpoint;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Memento memento = (Memento) o;
        return checkpoint.equals(memento.checkpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkpoint);
    }

    @Override
    public String toString() {
        return "Memento{" +
                "关卡='" + checkpoint + '}';
    }

}
