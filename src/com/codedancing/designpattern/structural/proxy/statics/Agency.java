package com.codedancing.designpattern.structural.proxy.statics;

/**
 * 中介，相当于 Proxy
 */
public class Agency implements RentService {

    /**
     * 业主
     */
    private Landlord landlord;
    /**
     * 期望租金
     */
    private double rental;

    public Agency(Landlord landlord) {
        this.landlord = landlord;
    }

    /**
     * 中介广告
     */
    public void advertisement() {
        System.out.println("中介广告：有一套" + landlord.getLocation() + "的房子准备出租，欢迎咨询！");
    }

    /**
     * 带客户看房
     */
    public void preRent(double income) {
        System.out.println("中介带领客户看房、谈价格...");
        this.rental = landlord.getRental() + income;
    }

    @Override
    public void rent(boolean isSatisfied) {
        advertisement();
        preRent(300);

        if (isSatisfied) {
            System.out.println(String.format("客户满意，决定租房，正在签订租房合同(租金：%f/月)...", rental));
            landlord.rent(isSatisfied);
            postRent();
        } else {
            System.out.println("客户不满意，租房失败，等待下个客户...");
        }
    }

    /**
     * 汇款
     */
    public void postRent() {
        System.out.println(String.format("中介正在给业主%s汇款租金(%f)...",landlord.getName(), landlord.getRental()));
    }

}
