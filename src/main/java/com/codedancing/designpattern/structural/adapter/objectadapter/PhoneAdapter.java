package com.codedancing.designpattern.structural.adapter.objectadapter;

/**
 * 手机电源适配器（适配器类）
 */
public class PhoneAdapter implements IO5V {

    private IO220V io220V;

    public PhoneAdapter(IO220V io220V) {
        this.io220V = io220V;
    }

    @Override
    public int output5V() {
        int dst = io220V.output220V() / 44;
        System.out.println("电源正在适配...");
        return dst;
    }
}
