package com.totoro.study_01_creational_patterns.study_02_factory_method_pattern.factory;

import com.totoro.study_01_creational_patterns.study_02_factory_method_pattern.vehicle.Car;
import com.totoro.study_01_creational_patterns.study_02_factory_method_pattern.vehicle.Vehicle;

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
}
