package com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.factory;


import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.Car;
import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.CarModel;
import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.Model;
import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.Vehicle;

/**
 * @author:totoro
 * @createDate:2023/2/17
 * @description:
 */
public class BenzFactory extends Factory {
    @Override
    public Vehicle buildVehicle() {
        return new Car("奔驰");
    }

    @Override
    public Model buildModel() {
        return new CarModel("奔驰模型");
    }
}
