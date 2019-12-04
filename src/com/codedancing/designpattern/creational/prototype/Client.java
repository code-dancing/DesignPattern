package com.codedancing.designpattern.creational.prototype;

import java.io.*;

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
        System.out.println("原始羊  : " + sheep + "\n");
        // 克隆羊信息
        System.out.println("克隆羊1 : " + cloneSheep1);
        System.out.println("克隆羊2 : " + cloneSheep2 + "\n");

        // 深拷贝

        System.out.println("深拷贝羊1 " + deepClone(sheep));
        System.out.println("深拷贝羊2 " + deepClone(sheep));
    }

    /**
     * 深拷贝一个对象
     */
    public static Object deepClone(Object src) {
        Object object = null;

        try {
            if (src != null) {
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos);
                oos.writeObject(src);
                oos.close();

                ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                ObjectInputStream ois = new ObjectInputStream(bis);
                object = ois.readObject();
                ois.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return object;
    }

}