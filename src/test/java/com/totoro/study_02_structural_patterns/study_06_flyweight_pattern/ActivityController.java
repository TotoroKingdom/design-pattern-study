package com.totoro.study_02_structural_patterns.study_06_flyweight_pattern;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class ActivityController {

    private RedisUtil redisUtil = new RedisUtil();

    public Activity queryActivityInfo(Long id){
        Activity activity = ActivityFactory.getActivity(id);

        Stock stock = new Stock(1000, redisUtil.getStockUsed());
        activity.setStock(stock);
        return activity;
    }
}
