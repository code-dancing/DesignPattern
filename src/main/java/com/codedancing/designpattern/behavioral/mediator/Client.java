package com.codedancing.designpattern.behavioral.mediator;

public class Client {

    public static void main(String[] args) {
        // 中介者
        Mediator mediator = new WeChatMediator();
        // 同事
        AbstractColleague alice = new ConcreteColleague("Alice");
        AbstractColleague bob = new ConcreteColleague("Bob");
        AbstractColleague john = new ConcreteColleague("John");
        // 注册
        mediator.register(alice);
        mediator.register(bob);
        mediator.register(john);
        // 通信
        alice.send("Bob", "明天是你生日，祝你生日快乐！");
        bob.send("Alice", "谢谢你！我的好朋友！");
        bob.send("John", "周末有空一起打球？");
        john.send("Bob", "好呀，不见不散！");
    }

}
