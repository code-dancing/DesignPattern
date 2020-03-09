package com.codedancing.designpattern.behavioral.strategy;

import com.codedancing.designpattern.behavioral.strategy.strategies.MemberStrategy;

/**
 * 购物环境类
 */
public class ShoppingContext {

    /**
     * 持有一个具体的策略对象
     */
    private MemberStrategy strategy;

    public ShoppingContext(MemberStrategy strategy){
        this.strategy = strategy;
    }

    /**
     * 计算商品的价格
     */
    public void handle(double originalPrice){
        double discountPrice = this.strategy.discountPrice(originalPrice);
        System.out.println(String.format("您的购物商品原价为：%s元，优惠后您需要支付%s元", originalPrice, discountPrice));
    }

    public void setStrategy(MemberStrategy strategy) {
        this.strategy = strategy;
    }

}
