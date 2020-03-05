package com.codedancing.designpattern.creational.builder;

/**
 * 别墅建造者
 */
public class VillaBuilder extends AbstractHouseBuilder {

    @Override
    protected void buildBase() {
        System.out.println("别墅的地基打30米");
        house.setBase("30米深");
    }

    @Override
    protected void buildWall() {
        System.out.println("别墅的墙砌25公分宽");
        house.setWall("25公分宽");
    }

    @Override
    protected void buildRoof() {
        System.out.println("别墅的房顶使用定制琉璃瓦");
        house.setRoof("定制琉璃瓦");
    }

}
