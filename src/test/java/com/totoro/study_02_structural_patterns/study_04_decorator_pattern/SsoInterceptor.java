package com.totoro.study_02_structural_patterns.study_04_decorator_pattern;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public class SsoInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(String request, String response, Object handle) {
        String substring = request.substring(1, 8);
        return substring.equals("success");
    }
}
