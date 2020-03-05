package com.codedancing.designpattern.structural.adapter.classadapter;

/**
 * 手机电源适配器（适配器类）
 */
public class PhoneAdapter extends IO220V implements IO5V {

    @Override
    public int output5V() {
        int dst = output220V() / 44;
        System.out.println("电源正在适配...");
        return dst;
    }

}
