package com.totoro.study_01_creational_patterns.study_02_factory_method_pattern.vehicle;

/**
 * @author:totoro
 * @createDate:2023/2/17
 * @description:
 */
public class Ship extends Vehicle{
    private String name;
    public Ship(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
