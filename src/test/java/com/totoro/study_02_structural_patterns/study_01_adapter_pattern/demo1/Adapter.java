package com.totoro.study_02_structural_patterns.study_01_adapter_pattern.demo1;

/**
 * @author:totoro
 * @createDate:2023/3/8
 * @description:
 */
public class Adapter implements Lightning {

    private TypeC typeC;

    public Adapter(TypeC typeC){
        this.typeC = typeC;
    }

    @Override
    public void charge() {
        typeC.charge();
    }
}
