package com.codedancing.designpattern.creational.builder;

/**
 * 房屋建造者（抽象）
 */
public abstract class AbstractHouseBuilder {

    /**
     * 房子对象
     */
    protected House house;

    /**
     * 建造地基
     */
    protected abstract void buildBase();

    /**
     * 建造墙面
     */
    protected abstract void buildWall();

    /**
     * 建造房顶
     */
    protected abstract void buildRoof();

    /**
     * 建房子的流程
     */
    public House buildHouse() {
        house = new House();
        buildBase();
        buildWall();
        buildRoof();

        return house;
    }

}
