package com.totoro.study_01_creational_patterns.study_01_simple_factory_pattern.demo1;

import com.totoro.study_01_creational_patterns.study_01_simple_factory_pattern.Car;
import com.totoro.study_01_creational_patterns.study_01_simple_factory_pattern.Plane;

import java.util.Scanner;

/**
 * @author:totoro
 * @createDate:2023/2/15
 * @description:
 */
public class Demo1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String vehicle = scanner.nextLine();

        //如果客户需要一辆汽车，就建造一辆汽车
        if (vehicle.equals("car")){
            Car car = new Car("奔驰");
            System.out.println(car.getName());
        }
        if (vehicle.equals("plane")){
            Plane plane = new Plane("波音");
            System.out.println(plane.getName());
        }
        //..如果加入其他的交通工具，在后面继续加产品
        /**
         * 优点：简单方便
         * 缺点：1-代码冗长，不易阅读
         *      2-违反单一原则，不利于重构
         *      3-违法开闭原则，新增交通工具时，需要修改这个类的代码
         */


    }

}
