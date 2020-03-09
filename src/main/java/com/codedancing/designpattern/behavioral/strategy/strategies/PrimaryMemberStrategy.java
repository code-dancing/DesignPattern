package com.codedancing.designpattern.behavioral.strategy.strategies;

/**
 * 初级会员策略
 */
public class PrimaryMemberStrategy implements MemberStrategy{

    @Override
    public double discountPrice(double originalPrice) {
        System.out.println("您是初级会员，享受10%的购物折扣");
        return originalPrice * 0.9;
    }

}