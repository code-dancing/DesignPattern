package com.codedancing.designpattern.creational.prototype;

/**
 * 羊，实现了Cloneable接口
 */
public class Sheep implements Cloneable {

    /**
     * 羊的名字
     */
    private String name;
    /**
     * 羊的年龄
     */
    private int age;
    /**
     * 羊的颜色
     */
    private String color;

    /**
     * 该羊的母亲 (clone默认是浅拷贝)
     */
    private Sheep mother;

    public Sheep(String name, int age, String color, Sheep mother) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public Sheep getMother() {
        return mother;
    }

    @Override
    public String toString() {
        return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", mother's hashcode = " + mother.hashCode() + "]";
    }

    /**
     * 克隆该实例，使用默认的 clone 方法来完成
     */
    @Override
    protected Object clone() {
        Sheep sheep = null;

        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheep;
    }

}