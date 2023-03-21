package com.totoro.study_02_structural_patterns.study_03_composite_pattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public class EngineConfig {

    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge",new UserAgeFilter());
        logicFilterMap.put("userGender",new UserGenderFilter());
    }

    public Map<String, LogicFilter> getLogicFilterMap(){
        return logicFilterMap;
    }

    public void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap){
        this.logicFilterMap = logicFilterMap;
    }
}
