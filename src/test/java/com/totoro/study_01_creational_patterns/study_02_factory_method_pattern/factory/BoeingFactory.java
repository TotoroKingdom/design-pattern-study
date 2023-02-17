package com.totoro.study_01_creational_patterns.study_02_factory_method_pattern.factory;

import com.totoro.study_01_creational_patterns.study_02_factory_method_pattern.vehicle.Plane;
import com.totoro.study_01_creational_patterns.study_02_factory_method_pattern.vehicle.Vehicle;

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
}
