package com.codedancing.designpattern.creational.builder;

/**
 * 平房建造者
 */
public class CottageBuilder extends AbstractHouseBuilder {

    @Override
    protected void buildBase() {
        System.out.println("平房的地基打15米");
        house.setBase("15米深");
    }

    @Override
    protected void buildWall() {
        System.out.println("平房的墙砌20公分宽");
        house.setWall("20公分宽");
    }

    @Override
    protected void buildRoof() {
        System.out.println("平房的房顶使用水泥");
        house.setRoof("水泥");
    }

}
