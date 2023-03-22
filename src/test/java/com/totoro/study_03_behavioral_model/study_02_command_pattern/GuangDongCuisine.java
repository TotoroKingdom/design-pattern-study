package com.totoro.study_03_behavioral_model.study_02_command_pattern;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class GuangDongCuisine implements Cuisine {

    private Cook cook;

    public GuangDongCuisine(Cook cook){
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}
