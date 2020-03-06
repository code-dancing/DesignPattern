package com.codedancing.designpattern.behavioral.template;

public class Client {

    public static void main(String[] args) {
        System.out.println("========== 做炒米饭===========");
        AbstractCooking cook = new RiceFriedCooking();
        cook.cooking();

        System.out.println("\n========== 做炒饼丝===========");
        AbstractCooking cook1 = new ShreddedCakeCooking();
        cook1.cooking();
    }

}
