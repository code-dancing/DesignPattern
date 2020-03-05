package com.codedancing.designpattern.structural.composite;

import java.util.ArrayList;

/**
 * 袋子，相当于树枝节点
 */
public class Bag implements Item{

    /**
     * 袋子名称
     */
    private String bagName;
    /**
     * 袋子中的商品
     */
    private ArrayList<Item> goodsList = new ArrayList<>();

    public Bag(String bagName) {
        this.bagName = bagName;
    }

    /**
     * 添加商品
     */
    public void add(Item item) {
        goodsList.add(item);
    }

    /**
     * 删除商品
     */
    public void remove(Item item) {
        goodsList.remove(item);
    }

    /**
     * 获取商品
     */
    public Item getChild(int i) {
        return goodsList.get(i);
    }

    @Override
    public double calculate() {
        float totalPrice = 0;
        for(Item item : goodsList) {
            totalPrice += item.calculate();
        }
        return totalPrice;
    }

    @Override
    public void show() {
        for (Item item : goodsList) {
            item.show();
        }
    }

}
