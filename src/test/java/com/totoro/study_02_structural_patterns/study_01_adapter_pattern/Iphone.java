package com.totoro.study_02_structural_patterns.study_01_adapter_pattern;

/**
 * @author:totoro
 * @createDate:2023/2/21
 * @description:
 */
public class Iphone {

    public void charge(Lightning lightning){
        System.out.println("iphone开始充电=" + lightning);
    }
}
