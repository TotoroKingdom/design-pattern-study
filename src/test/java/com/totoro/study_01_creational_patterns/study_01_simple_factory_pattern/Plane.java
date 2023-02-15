package com.totoro.study_01_creational_patterns.study_01_simple_factory_pattern;

import com.totoro.study_01_creational_patterns.study_01_simple_factory_pattern.demo2.Vehicle;
import lombok.Data;

/**
 * @author:totoro
 * @createDate:2023/2/15
 * @description:
 */
public class Plane extends Vehicle {

    private String name;

    public Plane(String name) {
        this.name = name;
    }

    public Plane(){}

    @Override
    public String getName() {
        return name;
    }
}
