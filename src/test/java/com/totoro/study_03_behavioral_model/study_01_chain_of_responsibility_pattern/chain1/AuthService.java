package com.totoro.study_03_behavioral_model.study_01_chain_of_responsibility_pattern.chain1;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class AuthService {

    private static Map<String, Date> authMap = new ConcurrentHashMap<>();

    public static Date queryAuthInfo(String id, String orderId){
        return authMap.get(id.concat(orderId));
    }

    public static void auth(String id, String orderId){
        authMap.put(id.concat(orderId), new Date());
    }

}
