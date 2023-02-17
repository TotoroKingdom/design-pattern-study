package com.totoro.study_01_creational_patterns.study_01_simple_factory_pattern;

/**
 * @author:totoro
 * @createDate:2023/2/15
 * @description:
 */
public class Factory {
    //静态工厂方法，根据传进来的值，创建具体的交通工具
    public static Vehicle getVehicle(String vehicle){
        Vehicle vehicleObject = null;
        if (vehicle.equals("car")){
            vehicleObject = new Car("奔驰");
        }
        if (vehicle.equals("plane")){
            vehicleObject = new Plane("波音");
        }
        return vehicleObject;
    }
}
