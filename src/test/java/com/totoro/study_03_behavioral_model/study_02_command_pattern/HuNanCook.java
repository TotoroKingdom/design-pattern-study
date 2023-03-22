package com.totoro.study_03_behavioral_model.study_02_command_pattern;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class HuNanCook implements Cook {
    @Override
    public void doCooking() {
        System.out.println("湖南厨师");
    }
}
