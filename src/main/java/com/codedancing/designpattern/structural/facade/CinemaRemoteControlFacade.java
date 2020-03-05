package com.codedancing.designpattern.structural.facade;

/**
 * 影院集成遥控控制（外观角色）
 */
public class CinemaRemoteControlFacade {

    private Screen screen;
    private Projector projector;
    private Audio audio;
    private DVD dvd;
    private Light light;

    public CinemaRemoteControlFacade(Screen screen, Projector projector, Audio audio, DVD dvd, Light light) {
        this.screen = screen;
        this.projector = projector;
        this.audio = audio;
        this.dvd = dvd;
        this.light = light;
    }

    /**
     * 开始看电影
     */
    public void watchMovie(String movieName) {
        screen.down();
        projector.on();
        projector.focus();
        audio.on();
        audio.setVolume();
        dvd.on();
        dvd.setDisk(movieName);
        dvd.play();
        light.turnDown();
    }

    /**
     * 结束看电影
     */
    public void endMovie() {
        dvd.off();
        audio.off();
        projector.off();
        light.turnUp();
        screen.up();
    }

}
