package com.totoro.study_02_structural_patterns.study_01_adapter_pattern.demo1;

/**
 * @author:totoro
 * @createDate:2023/3/8
 * @description:
 */
public class Demo1 {
    public static void main(String[] args) {
        //拥有一个苹果手机
        Apple apple = new Apple();

        //还有一个typec接口的小米充电器
        TypeC xiaomi = new XiaoMiCharger();

        //没有苹果手机的充电器，所以新建一个适配器，把小米充电器的typec接口转换成Lightning接口
        Adapter adapter = new Adapter(xiaomi);

        //开始充电
        apple.receiver(adapter);
    }
}
