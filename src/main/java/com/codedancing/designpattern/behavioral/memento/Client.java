package com.codedancing.designpattern.behavioral.memento;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        Caretaker caretaker = new Caretaker();
        // 开始游戏
        game.play();
        // 退出游戏并存档
        caretaker.archiveMemento(game.quitAndArchive());
        // 读取存档并开始游戏
        game.beginAndRestore(caretaker.restoreMemento());
    }

}
