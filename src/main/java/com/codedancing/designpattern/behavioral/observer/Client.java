package com.codedancing.designpattern.behavioral.observer;

public class Client {

    public static void main(String[] args) {
        // UP主
        AbstractUPSubject upA = new UPA("混世大魔王");
        AbstractUPSubject upB = new UPB("樱桃小丸子");
        // 粉丝
        FansObserver fanA = new FansA("小王");
        FansObserver fanB = new FansB("小李");

        // 订阅UP主
        upA.addFan(fanA);
        upA.addFan(fanB);
        upB.addFan(fanB);

        // 通知
        upA.notifyFans();
        upB.notifyFans();
    }

}
