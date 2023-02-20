package com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.factory;


import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.Model;
import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.Plane;
import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.PlaneModel;
import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.Vehicle;

/**
 * @author:totoro
 * @createDate:2023/2/17
 * @description:
 */
public class BoeingFactory extends Factory {
    @Override
    public Vehicle buildVehicle() {
        return new Plane("波音");
    }

    @Override
    public Model buildModel() {
        return new PlaneModel("波音飞机模型");
    }
}
