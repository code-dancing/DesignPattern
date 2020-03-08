package com.codedancing.designpattern.behavioral.mediator;

/**
 * 具体同事类
 */
public class ConcreteColleague extends AbstractColleague{

    public ConcreteColleague(String username) {
        super(username);
    }

    @Override
    public void receive(Message message) {
        System.out.println(String.format("[%s] 已接收：%s [%s发送于：%s]\n", username, message.getContent(), message.getSender(), message.getSendTime()));
    }

    @Override
    public void send(String receiver, String content) {
        message = new Message(receiver, content);
        System.out.println(String.format("[%s] 发送给 [%s]：%s", username, receiver, content));
        mediator.relay(this);
    }

}
