package com.totoro.study_01_creational_patterns.study_01_simple_factory_pattern.demo2;

import java.util.Scanner;

/**
 * @author:totoro
 * @createDate:2023/2/15
 * @description:
 */
public class Demo2 {
    public static void main(String[] args) {
        /**
         * 简单工厂模式改造
         * 1-新增一个交通工具类Vehicle,做为Car和Plane的公共抽象父类
         * 2-新增一个工厂类，写一个静态工厂方法获取交通工具
         */
        Scanner scanner = new Scanner(System.in);
        String vehicle = scanner.nextLine();

        //直接使用工厂方法获取具体的交通工具，不用自己创建了
        Vehicle vObject = Factory.getVehicle(vehicle);
        System.out.println(vObject.getName());

        /**
         * 优点：创建交通工具类比Demo1简化了好多，方便调用者。
         * 缺点：1-辛苦写工厂方法的人
         *      2-工厂类拓展和维护困难
         */

    }
}
