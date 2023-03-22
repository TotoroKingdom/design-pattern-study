package com.totoro.study_03_behavioral_model.study_02_command_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class XiaoEr {

    private List<Cuisine> list = new ArrayList<Cuisine>();

    public void order(Cuisine cuisine){
        list.add(cuisine);
    }

    public synchronized void placeOrder(){
        for (Cuisine cuisine : list) {
            cuisine.cook();
        }
        list.clear();
    }


}
