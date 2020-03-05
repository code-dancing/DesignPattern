package com.codedancing.designpattern.structural.composite;

/**
 * 商品，相当于叶子节点
 */
public class Goods implements Item {

    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品单价
     */
    private double price;
    /**
     * 商品数量
     */
    private int quantity;

    public Goods(String goodsName, double price, int quantity) {
        this.goodsName = goodsName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calculate() {
        return price * quantity;
    }

    @Override
    public void show() {
        System.out.println(String.format("%s (数量：%d，单价：%f)", goodsName, quantity, price));
    }

}
