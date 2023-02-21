package com.totoro.study_01_creational_patterns.study_06_builder_pattern;

/**
 * @author:totoro
 * @createDate:2023/2/21
 * @description:
 */
public class Demo {
    public static void main(String[] args) {

        Rocket rocket = Rocket.builder()
                .name("火箭")
                .engine(Engine.builder()
                        .name("发动机")
                        .build())
                .build();

        System.out.println(rocket);
    }
}
