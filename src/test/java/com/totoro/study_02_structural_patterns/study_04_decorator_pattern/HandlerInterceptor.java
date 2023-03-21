package com.totoro.study_02_structural_patterns.study_04_decorator_pattern;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handle);
}
