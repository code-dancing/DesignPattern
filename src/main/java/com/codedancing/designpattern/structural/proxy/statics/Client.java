package com.codedancing.designpattern.structural.proxy.statics;

public class Client {

    public static void main(String[] args) {
        // 业主将房子交给中介代理出租
        Landlord landlord = new Landlord("小张", "北京市海淀区颐和园路xxx小区", 1500);
        RentService rentService = new Agency(landlord);

        // 客户租房
        rentService.rent(true);
    }

}
