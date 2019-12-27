package com.codedancing.designpattern.structural.adapter.classadapter;

/**
 * 标压为220V的民用电（被适配的类）
 */
public class IO220V {

    public int output220V() {
        int src = 220;
        System.out.println("民用电电压为： " + src + "V.");
        return src;
    }

}
