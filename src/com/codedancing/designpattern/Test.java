package com.codedancing.designpattern;

import com.codedancing.designpattern.creational.singleton.Singleton02;
import com.codedancing.designpattern.creational.singleton.Singleton06;

public class Test {

    public static void main(String[] args) {
        System.out.println(Singleton06.getInstance());
        System.out.println(Singleton06.getInstance());
        System.out.println(Singleton06.getInstance());
        System.out.println(Singleton06.getInstance());
        System.out.println(Singleton06.getInstance());
    }

}
