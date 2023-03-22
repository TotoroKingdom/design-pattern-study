package com.totoro.study_03_behavioral_model.study_03_interpreter_pattern;

import lombok.Data;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
@Data
public class Employee {

    private String uId;

    private String name;

    private String desc;

    public Employee(String uId, String name, String desc){
        this.uId = uId;
        this.name = name;
        this.desc = desc;
    }
}
