package com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product;

/**
 * @author:totoro
 * @createDate:2023/2/20
 * @description:
 */
public class CarModel extends Model {
    private String name;

    public CarModel(String name) {
        this.name = name;
    }

    @Override
    public String getModel() {
        return name;
    }
}
