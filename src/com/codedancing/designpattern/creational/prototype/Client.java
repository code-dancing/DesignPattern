package com.codedancing.designpattern.creational.prototype;

/**
 * 使用原型模式创建新对象
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("原型模式完成新对象的创建 --> \n");

        // 原始羊（被克隆的羊）
        Sheep sheep = new Sheep("羊羔", 1, "白色", new Sheep("母亲", 3, "黑白色", null));

        // 克隆羊
        Sheep cloneSheep1 = (Sheep) sheep.clone();
        Sheep cloneSheep2 = (Sheep) sheep.clone();

        // 原始羊信息
        System.out.println("原始羊  : " + sheep);
        // 克隆羊信息
        System.out.println("克隆羊1 : " + cloneSheep1);
        System.out.println("克隆羊2 : " + cloneSheep2);
    }

}