package com.totoro.study_02_structural_patterns.study_04_decorator_pattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public class LoginSsoDecorator extends SsoInterceptor{

    private static Map<String,String> authMap = new ConcurrentHashMap<>();

    static {
        authMap.put("huahua","queryUserInfo");
        authMap.put("doudou","queryUserInfo");
    }


    @Override
    public boolean preHandle(String request, String response, Object handle) {

        String ticket = request.substring(1, 8);

        boolean success = ticket.equals("success");

        if (!success){
            return false;
        }

        String userId = request.substring(9);

        String method = authMap.get(userId);


        return "queryUserInfo".equals(method);

    }
}
