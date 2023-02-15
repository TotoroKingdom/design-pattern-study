package com.totoro.study_01_creational_patterns.study_01_simple_factory_pattern;

import com.totoro.study_01_creational_patterns.study_01_simple_factory_pattern.demo2.Vehicle;
import lombok.Data;

/**
 * @author:totoro
 * @createDate:2023/2/15
 * @description:
 */
public class Car extends Vehicle {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public Car(){}

    @Override
    public String getName() {
        return name;
    }
}
