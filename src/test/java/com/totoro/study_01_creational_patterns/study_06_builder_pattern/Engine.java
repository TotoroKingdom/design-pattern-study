package com.totoro.study_01_creational_patterns.study_06_builder_pattern;

import lombok.Builder;

/**
 * @author:totoro
 * @createDate:2023/2/21
 * @description:
 */
@Builder
public class Engine {

    private String name;

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }
}
