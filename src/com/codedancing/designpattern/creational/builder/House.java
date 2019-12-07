package com.codedancing.designpattern.creational.builder;

/**
 * 产品： 房子
 */
public class House {

    /**
     * 地基
     */
    private String base;
    /**
     * 墙面
     */
    private String wall;
    /**
     * 屋顶
     */
    private String roof;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "base='" + base + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
