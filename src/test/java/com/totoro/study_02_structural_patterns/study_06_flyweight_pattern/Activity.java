package com.totoro.study_02_structural_patterns.study_06_flyweight_pattern;

import lombok.Data;

import java.util.Date;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
@Data
public class Activity {

    private Long id;
    private String name;
    private String desc;
    private Date startTime;
    private Date stopTime;
    private Stock stock;
}
