package com.totoro.study_01_creational_patterns.study_05_prototype_pattern;

import java.io.Serializable;

/**
 * @author:totoro
 * @createDate:2023/2/21
 * @description:
 */
public class Owner implements Serializable {
    //序列化版本号
    private static final long serialVersionUID = 123456789L;

    private String name;

    public Owner(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                '}' + hashCode();
    }
}
