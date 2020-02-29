package com.codedancing.designpattern.structural.composite;

public class Client {

    public static void main(String[] args) {

        Bag redSmallBag = new Bag("红色小袋子");
        redSmallBag.add(new Goods("纯牛奶", 7.9, 2));
        redSmallBag.add(new Goods("精品食盐", 9.9, 1));

        Bag whiteSmallBag = new Bag("白色小袋子");
        whiteSmallBag.add(new Goods("白酒", 68, 2));
        whiteSmallBag.add(new Goods("龙井茶", 80, 3));

        Bag blueMediumBag = new Bag("蓝色中号袋子");
        blueMediumBag.add(redSmallBag);
        blueMediumBag.add(new Goods("景德镇瓷器", 380, 1));

        Bag blackBigBag = new Bag("黑色大号袋子");
        blackBigBag.add(blueMediumBag);
        blackBigBag.add(whiteSmallBag);
        blackBigBag.add(new Goods("李宁运动鞋", 198, 1));

        System.out.println(String.format("商品总价是：%f\n", blackBigBag.calculate()));
        System.out.println("商品详情是:");
        blackBigBag.show();

    }

}
