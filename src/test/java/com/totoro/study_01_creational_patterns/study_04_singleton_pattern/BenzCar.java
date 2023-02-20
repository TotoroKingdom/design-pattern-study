package com.totoro.study_01_creational_patterns.study_04_singleton_pattern;

/**
 * @author:totoro
 * @createDate:2023/2/20
 * @description:
 */
public class BenzCar {
    //车的拥有者
    private String owner;
    //车的名字
    private String name;

    //私有静态成员变量
    private static BenzCar benzCar;
    //客户端获取奔驰汽车方法
    public static BenzCar getBenzCar(){
        //如果不存在这个实例，就创建一个
        if ( null == benzCar){
            benzCar = new BenzCar("奔驰","小叮当");
            return benzCar;
        }
        //有的话就直接返回
        return benzCar;
    }
    //将构造函数改为私有方法
    private BenzCar(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }
}
