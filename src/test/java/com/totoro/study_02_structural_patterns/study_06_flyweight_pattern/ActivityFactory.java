package com.totoro.study_02_structural_patterns.study_06_flyweight_pattern;

import cn.hutool.core.util.ObjUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class ActivityFactory {

    static Map<Long, Activity> activityMap = new HashMap<>();

    public static Activity getActivity(Long id){
        Activity activity = activityMap.get(id);

        if (ObjUtil.isNull(activity)){
            activity = new Activity();
            activity.setId(100L);
            activity.setName("小叮当");
            activity.setDesc("小叮当是一只猫");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            activityMap.put(id,activity);
        }
        return activity;
    }
}
