package com.codedancing.designpattern.structural.flyweight;

public class Client {

    public static void main(String[] args) {

        PanServer server = PanServer.getInstance();

        // 上传文件
        System.out.println("=================上传文件===================");
        String filePath = "/home/codedancing/Desktop/HeadFirst设计模式.pdf";
        String filePath1 = "/home/codedancing/Desktop/朱一旦的HeadFirst设计模式.pdf";
        String filePath2 = "/home/codedancing/Desktop/Test-1.0-SNAPSHOT.war";

        server.upload("朱一旦", "HeadFirst设计模式.pdf", filePath);
        server.upload("朱一旦", "HeadFirst设计模式.pdf", filePath);
        server.upload("朱一旦", "朱一旦的HeadFirst设计模式.pdf", filePath1);
        server.upload("朱一旦", "Test-1.0-SNAPSHOT.war", filePath2);

        // 下载文件
        System.out.println("=================下载文件===================");
        server.download("HeadFirst设计模式.pdf");
        server.download("HeadFirst设计模式.pdf");
        server.download("朱一旦的HeadFirst设计模式.pdf");
        server.download("Test-1.0-SNAPSHOT.war");

    }

}
