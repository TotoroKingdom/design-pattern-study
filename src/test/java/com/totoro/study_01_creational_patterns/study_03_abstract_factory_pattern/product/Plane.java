package com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product;

/**
 * @author:totoro
 * @createDate:2023/2/17
 * @description:
 */
public class Plane extends Vehicle {
    private String name;

    public Plane(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
