package com.codedancing.designpattern.structural.facade;

public class Client {

    public static void main(String[] args) {

        CinemaRemoteControlFacade remoteControl = new CinemaRemoteControlFacade(new Screen(), new Projector(), new Audio(), new DVD(), new Light());
        System.out.println("------------准备播放电影------------\n");
        remoteControl.watchMovie("决战中途岛");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n------------电影播放结束------------\n");
        remoteControl.endMovie();

    }

}
