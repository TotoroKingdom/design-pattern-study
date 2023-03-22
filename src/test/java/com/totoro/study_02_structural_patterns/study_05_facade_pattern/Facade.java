package com.totoro.study_02_structural_patterns.study_05_facade_pattern;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class Facade {

    private SystemA a = new SystemA();
    private SystemB b = new SystemB();
    private SystemC c = new SystemC();

    public void method(){
        a.methodA();
        b.methodB();
        c.methodC();
    }


}
