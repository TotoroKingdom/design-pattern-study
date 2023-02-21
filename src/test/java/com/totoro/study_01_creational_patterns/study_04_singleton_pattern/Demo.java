package com.totoro.study_01_creational_patterns.study_04_singleton_pattern;

/**
 * @author:totoro
 * @createDate:2023/2/20
 * @description:
 */
public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                BenzCar benzCar = BenzCar.getBenzCar();
                System.out.println(benzCar.getOwner()+ "的" + benzCar.getName() + benzCar.hashCode());
            }).start();
        }
    }
}
