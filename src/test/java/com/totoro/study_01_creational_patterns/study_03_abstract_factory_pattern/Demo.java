package com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern;

import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.factory.Factory;
import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.Model;
import com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.product.Vehicle;
import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author:totoro
 * @createDate:2023/2/20
 * @description:
 */
public class Demo {

    @SneakyThrows
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            String code = scanner.nextLine();
            //新增一个map用来映射调用代号和创建路径
            Map<String, String> map = new HashMap<>();
            map.put("car","com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.factory.BenzFactory");
            map.put("plane","com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.factory.BoeingFactory");
            map.put("ship","com.totoro.study_01_creational_patterns.study_03_abstract_factory_pattern.factory.SpaceXFactory");

            Factory factory = (Factory) Class.forName(map.get(code)).newInstance();
            Vehicle vehicle = factory.buildVehicle();
            System.out.println("vehicle="+vehicle.getName());

            //新增建造模型的方法
            Model model = factory.buildModel();
            System.out.println("model="+model.getModel());

        }
    }
}
