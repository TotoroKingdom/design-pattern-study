package com.totoro.study_02_structural_patterns.study_01_adapter_pattern;

import com.totoro.study_01_creational_patterns.study_05_prototype_pattern.Phone;

/**
 * @author:totoro
 * @createDate:2023/2/21
 * @description:
 */
public class Demo {

    public static void main(String[] args) {

        //现在我们有一个苹果手机
        Iphone iphone = new Iphone();
        //iphone需要充电了，没有苹果充电器 但我们有typec充电器
        TypeCReplenisher typec = new TypeCReplenisher();
        typec.setElectron("100w电流");
        //所以我们造一个适配器
        Adapter adapter = new Adapter(typec);
        //然后转换一下,开始充电
        iphone.charge(adapter.change());

    }
}
