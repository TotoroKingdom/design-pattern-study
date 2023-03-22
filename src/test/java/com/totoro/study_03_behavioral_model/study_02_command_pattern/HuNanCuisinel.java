package com.totoro.study_03_behavioral_model.study_02_command_pattern;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class HuNanCuisinel implements Cuisine {

    private Cook cook;

    public HuNanCuisinel(Cook cook){
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}
