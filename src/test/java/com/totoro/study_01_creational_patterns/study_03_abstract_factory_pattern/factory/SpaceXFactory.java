package com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.factory;


import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.Model;
import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.RocketModel;
import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.Ship;
import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.Vehicle;

/**
 * @author:totoro
 * @createDate:2023/2/17
 * @description:
 */
public class SpaceXFactory extends Factory {
    @Override
    public Vehicle buildVehicle() {
        return new Ship("宇宙飞船");
    }

    @Override
    public Model buildModel() {
        return new RocketModel("火箭模型");
    }
}

