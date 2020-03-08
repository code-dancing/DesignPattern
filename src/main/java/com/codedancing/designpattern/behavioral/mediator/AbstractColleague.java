package com.codedancing.designpattern.behavioral.mediator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

/**
 * 抽象同事类
 */
public abstract class AbstractColleague {

    /**
     * 绑定中介者
     */
    protected Mediator mediator;
    /**
     * 同事类姓名
     */
    protected String username;
    /**
     * 通信消息
     */
    protected Message message;

    public AbstractColleague(String username) {
        this.username = username;
    }

    /**
     * 接收消息
     */
    public abstract void receive(Message message);

    /**
     * 发送消息
     */
    public abstract void send(String receiver, String content);

    public Message getMessage() {
        return message;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractColleague that = (AbstractColleague) o;
        return Objects.equals(mediator, that.mediator) &&
                Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediator, username);
    }

    /**
     * 同事类进行沟通的消息
     */
    class Message {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        /**
         * 消息发送者
         */
        private String sender;
        /**
         * 消息接收者
         */
        private String receiver;
        /**
         * 消息内容
         */
        private String content;
        /**
         * 消息发送时间
         */
        private String sendTime;

        public Message(String receiver, String content) {
            this.sender = AbstractColleague.this.username;
            this.receiver = receiver;
            this.content = content;
            this.sendTime = dateFormat.format(Calendar.getInstance().getTime());
        }

        public String getContent() {
            return content;
        }

        public String getSendTime() {
            return sendTime;
        }

        public String getSender() {
            return sender;
        }

        public String getReceiver() {
            return receiver;
        }

    }

}
