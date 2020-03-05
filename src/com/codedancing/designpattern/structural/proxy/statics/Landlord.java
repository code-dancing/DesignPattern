package com.codedancing.designpattern.structural.proxy.statics;

/**
 * 业主，相当于 RealSubject
 */
public class Landlord implements RentService{

    /**
     * 业主姓名
     */
    private String name;
    /**
     * 房屋位置
     */
    private String location;
    /**
     * 期望租金
     */
    private double rental;

    @Override
    public void rent(boolean isSatisfied) {
        if (isSatisfied) {
            System.out.println(String.format("业主 %s 收到中介短信：房屋出租成功", name));
        }
    }

    public Landlord(String name, String location, double rental) {
        this.name = name;
        this.location = location;
        this.rental = rental;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getRental() {
        return rental;
    }
}
