package com.totoro.study_01_creational_patterns.study_02_factory_method_pattern;

import com.totoro.study_01_creational_patterns.study_02_factory_method_pattern.factory.Factory;
import com.totoro.study_01_creational_patterns.study_02_factory_method_pattern.vehicle.Vehicle;
import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author:totoro
 * @createDate:2023/2/17
 * @description: 工厂方法模式
 * 在简单工厂模式中，如果新增了一个Ship交通工具，就要修改Factory中的getVehicle方法,这样违背了开闭原则
 * 如何解决这个问题，将工厂类抽象出来，创建工厂的活由工厂的子类来干。
 */
public class Demo1 {

    @SneakyThrows
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            String code = scanner.nextLine();
            //新增一个map用来映射调用代号和创建路径
            Map<String, String> map = new HashMap<>();
            map.put("car","com.totoro.study_01_creational_patterns.study_02_factory_method_pattern.factory.BenzFactory");
            map.put("plane","com.totoro.study_01_creational_patterns.study_02_factory_method_pattern.factory.BoeingFactory");
            map.put("ship","com.totoro.study_01_creational_patterns.study_02_factory_method_pattern.factory.SpaceXFactory");
            Factory o = (Factory) Class.forName(map.get(code)).newInstance();
            Vehicle vehicle = o.buildVehicle();
            System.out.println(vehicle.getName());
        }
    }


}
