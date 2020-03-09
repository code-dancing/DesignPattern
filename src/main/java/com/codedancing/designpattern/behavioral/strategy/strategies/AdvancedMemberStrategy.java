package com.codedancing.designpattern.behavioral.strategy.strategies;

/**
 * 高级会员策略
 */
public class AdvancedMemberStrategy implements MemberStrategy {

    @Override
    public double discountPrice(double originalPrice) {
        System.out.println("您是高级会员，享受30%的购物折扣");
        return originalPrice * 0.7;
    }

}
