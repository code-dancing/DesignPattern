package com.codedancing.designpattern.behavioral.strategy.strategies;

/**
 * 会员优惠策略
 */
public interface MemberStrategy {

    /**
     * 根据会员等级计算最终价格
     */
    double discountPrice(double originalPrice);

}
