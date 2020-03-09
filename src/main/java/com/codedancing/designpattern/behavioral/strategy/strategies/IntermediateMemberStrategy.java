package com.codedancing.designpattern.behavioral.strategy.strategies;

/**
 * 中级会员策略
 */
public class IntermediateMemberStrategy implements MemberStrategy {

    @Override
    public double discountPrice(double originalPrice) {
        System.out.println("您是中级会员，享受20%的购物折扣");
        return originalPrice * 0.8;
    }

}
