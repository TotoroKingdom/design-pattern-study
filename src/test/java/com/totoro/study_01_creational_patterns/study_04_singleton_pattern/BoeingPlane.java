package com.totoro.study_01_creational_patterns.study_04_singleton_pattern;

/**
 * @author:totoro
 * @createDate:2023/2/21
 * @description:
 */
public class BoeingPlane {

    private String name;
    private String owner;
    //static表示只能有boeingPlane一个实例，final标识它不能修改
    private static final BoeingPlane boeingPlane = new BoeingPlane("飞机","小叮当");

    /**
     * 获取实例时直接返回
     * @return
     */
    public static BoeingPlane getBoeingPlane(){
        return boeingPlane;
    }

    private BoeingPlane(String name, String owner){
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }
}
