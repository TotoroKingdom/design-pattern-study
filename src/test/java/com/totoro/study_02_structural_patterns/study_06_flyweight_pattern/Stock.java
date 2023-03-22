package com.totoro.study_02_structural_patterns.study_06_flyweight_pattern;

import lombok.Data;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
@Data
public class Stock {

    private int total;
    private int used;

    public Stock(int total, int used){
        this.total = total;
        this.used = used;
    }
}
