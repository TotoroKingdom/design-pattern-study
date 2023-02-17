package com.totoro.study_01_creational_patterns.study_01_simple_factory_pattern.demo1;

import com.totoro.study_01_creational_patterns.study_01_simple_factory_pattern.Vehicle;

/**
 * @author:totoro
 * @createDate:2023/2/15
 * @description:
 */
public class Car{
    private String name;
    public Car(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
