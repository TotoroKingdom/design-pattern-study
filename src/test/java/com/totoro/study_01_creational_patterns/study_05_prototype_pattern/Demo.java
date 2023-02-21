package com.totoro.study_01_creational_patterns.study_05_prototype_pattern;

/**
 * @author:totoro
 * @createDate:2023/2/21
 * @description:
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Phone phone = new Phone("苹果", "星光色", "iPhone 14",new Owner("小叮当"));
        System.out.println("小叮当买了一台"+phone+phone.hashCode());

        Phone clone = (Phone) phone.clone();

        System.out.println("小叮咚买了一台"+clone+clone.hashCode());


    }
}
