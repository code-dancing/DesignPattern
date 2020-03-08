package com.codedancing.designpattern.behavioral.memento;

import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

/**
 * 游戏，相当于Originator
 */
public class Game {

    /**
     * 手势
     */
    private final String ROCK = "石头";
    private final String SCISSORS = "剪刀";
    private final String CLOTH = "布";
    private final String EXIT = "exit";

    /**
     * 当前关卡
     */
    private Memento memento;

    public Game() {
        this.memento = new Memento(1);
        System.out.println("================= 猜拳游戏开始 ================");
    }

    public Game(Memento memento) {
        this.memento = memento;
        System.out.println("================= 猜拳游戏开始 ================");
    }

    public void play() {
        System.out.println("\n============================================");
        System.out.println("当前游戏关卡：[" + memento.getCheckpoint() + "], 【输入 exit 退出游戏】");
        System.out.println("============================================");
        System.out.println("请输入【石头】【剪刀】【布】：");
        fingerGuess();
    }

    /**
     * 猜拳
     */
    private void fingerGuess() {
        String systemGesture = getSystemGesture();
        Scanner scanner = new Scanner(System.in);
        String userGesture = scanner.next();

        while (!ROCK.equals(userGesture) && !SCISSORS.equals(userGesture) && !CLOTH.equals(userGesture)) {
            if (EXIT.equals(userGesture)) {
                System.out.println("正在退出游戏...");
                return;
            }
            System.out.println("你输入的手势有误，请重新输入：");
            userGesture = scanner.next();
        }

        // 用户手势和系统手势比较
        if (ROCK.equals(userGesture)) {
            switch (systemGesture) {
                case ROCK:
                    System.out.println("平局，继续执行该关卡...");
                    play();
                    break;
                case SCISSORS:
                    System.out.println("系统手势是：" + SCISSORS + ", 您赢了！进入下一关");
                    nextCheckPoint();
                    break;
                default:
                    System.out.println("系统手势是：" + CLOTH + ", 您输了！继续执行该关卡...");
                    play();
                    break;
            }
        } else if (SCISSORS.equals(userGesture)) {
            switch (systemGesture) {
                case ROCK:
                    System.out.println("系统手势是：" + ROCK + ", 您输了！继续执行该关卡...");
                    play();
                    break;
                case SCISSORS:
                    System.out.println("平局，继续执行该关卡...");
                    play();
                    break;
                default:
                    System.out.println("系统手势是：" + CLOTH + ", 您赢了！进入下一关");
                    nextCheckPoint();
                    break;
            }
        } else {
            switch (systemGesture) {
                case ROCK:
                    System.out.println("系统手势是：" + ROCK + ", 您赢了！进入下一关");
                    nextCheckPoint();
                    break;
                case SCISSORS:
                    System.out.println("系统手势是：" + SCISSORS + ", 您输了！继续执行该关卡...");
                    play();
                    break;
                default:
                    System.out.println("平局，继续执行该关卡...");
                    play();
                    break;
            }
        }
    }

    /**
     * 生成系统手势
     */
    private String getSystemGesture() {
        // 随机生成系统手势
        String systemGesture;
        switch (new Random().nextInt(3)) {
            case 0:
                systemGesture = ROCK;
                break;
            case 1:
                systemGesture = SCISSORS;
                break;
            default:
                systemGesture = CLOTH;
        }
        return systemGesture;
    }

    /**
     * 进入下一关
     */
    private void nextCheckPoint() {
        memento = new Memento(memento.getCheckpoint() + 1);
        play();
    }

    /**
     * 退出游戏并存档
     */
    public Memento quitAndArchive() {
        System.out.println("正在为您存档...\n");
        return memento;
    }

    /**
     * 开始游戏并读取存档
     */
    public void beginAndRestore(Memento memento) {
        System.out.println("\n正在读取存档... 准备开始游戏");
        this.memento = Optional.ofNullable(memento).orElse(new Memento(1));
        play();
    }

}
