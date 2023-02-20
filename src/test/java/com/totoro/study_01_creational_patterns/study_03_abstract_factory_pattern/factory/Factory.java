package com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.factory;


import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.Model;
import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.Vehicle;

/**
 * @author:totoro
 * @createDate:2023/2/17
 * @description:
 */
public abstract class Factory {
    /**
     * 建造交通工具的抽象方法
     * @return
     */
    public abstract Vehicle buildVehicle();

    /**
     * 建造模型手办的抽象方法
     * @return
     */
    public abstract Model buildModel();
}
