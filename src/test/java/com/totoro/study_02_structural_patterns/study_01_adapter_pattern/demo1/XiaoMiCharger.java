package com.totoro.study_02_structural_patterns.study_01_adapter_pattern.demo1;

/**
 * @author:totoro
 * @createDate:2023/3/8
 * @description:
 */
public class XiaoMiCharger implements TypeC {
    @Override
    public void charge() {
        System.out.println("小米充电器开始工作");
    }
}
